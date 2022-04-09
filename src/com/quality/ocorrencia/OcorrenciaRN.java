package com.quality.ocorrencia;

import java.util.Date;
import java.util.List;

import com.quality.fabricante.Fabricante;
import com.quality.util.DAOFactory;

public class OcorrenciaRN {

	private OcorrenciaDAO ocorrenciaDAO;
	
	public OcorrenciaRN() {
		ocorrenciaDAO = DAOFactory.criarOcorrenciaDAO();
	}
	
	public void salvar(Ocorrencia ocorrencia){
		ocorrenciaDAO.salvar(ocorrencia);
	}
	
	public void atualizar(Ocorrencia ocorrencia){
		ocorrenciaDAO.atualizar(ocorrencia);
	}
	
	public void excluir(Ocorrencia ocorencia){
		ocorrenciaDAO.excluir(ocorencia);
	}
	
	public Ocorrencia carregar(Integer id){
		return ocorrenciaDAO.carregar(id);
	}
	
	public List<Ocorrencia> listarPorData(Date dataInicio, Date dataFim){
		return ocorrenciaDAO.listarPorData(dataInicio, dataFim);
	}
	
	public List<Ocorrencia> listarPorFabricante(Fabricante fabricante, Date dataInicio, Date dataFim){
		return ocorrenciaDAO.listarPorFabricante(fabricante, dataInicio, dataFim);
	}
	
	public List<Ocorrencia> listar(){
		return ocorrenciaDAO.listar();
	}
}
