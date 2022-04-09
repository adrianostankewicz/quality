package com.quality.web;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.quality.transportadora.Transportadora;
import com.quality.transportadora.TransportadoraRN;

@ManagedBean(name="transportadoraBean")
@SessionScoped
public class TransportadoraBean implements Serializable{
	private static final long serialVersionUID = 7177117952123295441L;
	
	private Transportadora transportadora = new Transportadora();
	private List<Transportadora> transportadoras;
	
	public String salvar(){
		FacesContext context = FacesContext.getCurrentInstance();
		
		TransportadoraRN transportadoraRN = new TransportadoraRN();
		transportadoraRN.salvar(transportadora);
		transportadoras = null;
		
		FacesMessage facesMessage = new FacesMessage("Transportadora " + transportadora.getNome() + " registrada com sucesso!");
		context.addMessage(null, facesMessage);
		return null;
	}
	
	public String editar(){
		return "/admin/transportadora";
	}
	
	public String excluir(){
		FacesContext context = FacesContext.getCurrentInstance();
		
		TransportadoraRN transportadoraRN = new TransportadoraRN();
		transportadoraRN.excluir(transportadora);
		
		FacesMessage facesMessage = new FacesMessage("Transportadora " + transportadora.getNome() + "exlcu�da com sucesso!");
		context.addMessage(null, facesMessage);
		return null;
	}
	
	public List<Transportadora> getTransportadoras(){
		TransportadoraRN transportadoraRN = new TransportadoraRN();
		transportadoras = transportadoraRN.listar();
		return transportadoras;
	}

	public Transportadora getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(Transportadora transportadora) {
		this.transportadora = transportadora;
	}
}
