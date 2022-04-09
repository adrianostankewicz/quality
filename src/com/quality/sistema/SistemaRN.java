package com.quality.sistema;

import java.util.List;

import com.quality.util.DAOFactory;

public class SistemaRN {

	private SistemaDAO sistemaDAO;
	
	public SistemaRN(){
		sistemaDAO = DAOFactory.criarSistemaDAO();
	}
	
	public void salvar(Sistema sistema){
		sistemaDAO.salvar(sistema);
	}
	
	public void atualizar(Sistema sistema){
		sistemaDAO.atualizar(sistema);
	}
	
	public void excluir(Sistema sistema){
		sistemaDAO.excluir(sistema);
	}
	
	public List<Sistema> listar(){
		return sistemaDAO.listar();
	}
}
