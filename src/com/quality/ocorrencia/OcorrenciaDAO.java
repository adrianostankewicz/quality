package com.quality.ocorrencia;

import java.util.Date;
import java.util.List;

import com.quality.fabricante.Fabricante;

public interface OcorrenciaDAO {

	public void salvar(Ocorrencia ocorrencia);
	
	public void atualizar(Ocorrencia ocorrencia);
	
	public void excluir(Ocorrencia ocorrencia);
	
	public Ocorrencia carregar(Integer id);
	
	public List<Ocorrencia> listarPorData(Date dataInicio, Date dataFim);
	
	public List<Ocorrencia> listarPorFabricante(Fabricante fabricante, Date dataInicio, Date dataFim);
	
	public List<Ocorrencia> listar();
}
