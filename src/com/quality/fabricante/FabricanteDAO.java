package com.quality.fabricante;

import java.util.List;

public interface FabricanteDAO {

	public void salvar(Fabricante fabricante);
	
	public void atualizar(Fabricante fabricante);
	
	public void excluir(Fabricante fabricante);
	
	public Fabricante carregar(Integer id);
	
	public Fabricante buscarPorNome(String nome);
	
	public List<Fabricante> listar();
}
