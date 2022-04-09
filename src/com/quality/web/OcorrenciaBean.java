package com.quality.web;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;

import com.quality.fabricante.Fabricante;
import com.quality.ocorrencia.Ocorrencia;
import com.quality.ocorrencia.OcorrenciaRN;

@ManagedBean(name="ocorrenciaBean")
@RequestScoped
public class OcorrenciaBean implements Serializable {
	private static final long serialVersionUID = 4852598217657046499L;
	
	private Ocorrencia ocorrencia;
	private List<Ocorrencia> ocorrencias;
	private Date dataInicio;
	private Date dataFim;
	private CartesianChartModel graficoFabricantesModel;
	private CartesianChartModel graficoTransportadorasModel;
	
	public OcorrenciaBean(){
		graficoFabricantesModel = new CartesianChartModel();
		ocorrencia = new Ocorrencia();
	}
	
	public String novo(){
		ocorrencia = new Ocorrencia();
		//dataInicio = new Date(1900,01,01);
		//dataFim = new Date(1900,01,01);
		return "ocorrencia";
	}
	
	public String salvar(){
		OcorrenciaRN ocorrenciaRN = new OcorrenciaRN();
		ocorrenciaRN.salvar(ocorrencia);
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage facesMessage =  new FacesMessage("Ocorr�ncia " + ocorrencia.getIdOcorrencia() + " registrada com sucesso!");
		context.addMessage(null, facesMessage);
		ocorrencia = new Ocorrencia();
		return null;
	}
	
	public String filtrar(){
		criarHistogramas();
		return null;
	} 
	
	public List<Ocorrencia> getOcorrencias() {
		OcorrenciaRN ocorrenciaRN = new OcorrenciaRN();
		ocorrencias = ocorrenciaRN.listarPorData(dataInicio, dataFim);
		return ocorrencias;
	}
	
	public void criarHistogramas(){
		criarHistogramaFabricantes();
		//criarHistogramaTransportadoras();
	}
	
	public void criarHistogramaFabricantes(){
		graficoFabricantesModel = new CartesianChartModel();
		
		Set<Fabricante> fabricantes = new HashSet<Fabricante>();
		ChartSeries cs = new ChartSeries();
		
		for(Ocorrencia o : getOcorrencias()){
			fabricantes.add(o.getFabricante());
		}
		
		int contaOcorrencias;
		
		for(Fabricante f : fabricantes){
			
			contaOcorrencias = 0;
			
			for(Ocorrencia o : ocorrencias){
				if(f.getNome().equalsIgnoreCase(o.getFabricante().getNome())){
					contaOcorrencias++;
				}
			}
			cs.setLabel("Ocorr�ncias");
			cs.set(f.getNome(), contaOcorrencias);
		}
		graficoFabricantesModel.addSeries(cs);
	}

	public void criarHistogramaTransportadoras(){
		graficoTransportadorasModel = new CartesianChartModel();
	}
	
	public CartesianChartModel getGraficoFabricantesModel() {
		return graficoFabricantesModel;
	}

	public void setGraficoFabricantesModel(
			CartesianChartModel graficoFabricantesModel) {
		this.graficoFabricantesModel = graficoFabricantesModel;
	}

	public CartesianChartModel getGraficoTransportadorasModel() {
		return graficoTransportadorasModel;
	}

	public void setGraficoTransportadorasModel(
			CartesianChartModel graficoTransportadorasModel) {
		this.graficoTransportadorasModel = graficoTransportadorasModel;
	}

	public Ocorrencia getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	
	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
}
