package com.quality.sistema;

import java.util.List;

public interface SistemaDAO {

	public void salvar(Sistema sistema);
	
	public void atualizar(Sistema sistema);
	
	public void excluir(Sistema sistema);
	
	public List<Sistema> listar();
}
