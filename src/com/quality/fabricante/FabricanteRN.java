package com.quality.fabricante;

import java.util.List;

import com.quality.util.DAOFactory;

public class FabricanteRN {

	private FabricanteDAO fabricanteDAO;
	
	public FabricanteRN(){
		fabricanteDAO = DAOFactory.criarFabricanteDAO();
	}
	
	public void salvar(Fabricante fabricante){
	
		Integer codigo = fabricante.getIdFabricante();
		
		if(codigo == null || codigo == 0){
			fabricanteDAO.salvar(fabricante);
		}else{
			fabricanteDAO.atualizar(fabricante);
		}
	}
	
	public void excluir(Fabricante fabricante){
		fabricanteDAO.excluir(fabricante);
	}
	
	public Fabricante carregar(Integer id){
		return fabricanteDAO.carregar(id);
	}
	
	public Fabricante buscarPorNome(String nome){
		return fabricanteDAO.buscarPorNome(nome);
	}
	
	public List<Fabricante> listar(){
		return fabricanteDAO.listar();
	}
}
