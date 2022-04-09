package com.quality.transportadora;

import java.util.List;

public interface TransportadoraDAO {

	public void salvar(Transportadora transportadora);
	
	public void atualizar(Transportadora transportadora);
	
	public void excluir(Transportadora transportadora);
	
	public Transportadora carregar(Integer id);
	
	public Transportadora buscarPorNome(String nome);
	
	public List<Transportadora> listar();
}
