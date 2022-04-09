package com.quality.transportadora;

import java.util.List;

import com.quality.util.DAOFactory;

public class TransportadoraRN {

	private TransportadoraDAO transportadoraDAO;
	
	public TransportadoraRN(){
		transportadoraDAO = DAOFactory.criarTransportadoraDAO();
	}
	
	public void salvar(Transportadora transportadora){
		
		Integer codigo = transportadora.getIdTransportadora();
		
		if(codigo == null || codigo == 0){
			transportadoraDAO.salvar(transportadora);
		}else{
			transportadoraDAO.atualizar(transportadora);
		}
	}
	
	public void excluir(Transportadora transportadora){
		transportadoraDAO.excluir(transportadora);
	}
	
	public Transportadora carregar(Integer id){
		return transportadoraDAO.carregar(id);
	}
	
	public List<Transportadora> listar(){
		return transportadoraDAO.listar();
	}
}
