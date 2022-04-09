package com.quality.ocorrencia;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.quality.fabricante.Fabricante;

public class OcorrenciaDAOHibernate implements OcorrenciaDAO {

	private Session session;
	
	public void setSession(Session session){
		this.session = session;
	}
	
	@Override
	public void salvar(Ocorrencia ocorrencia) {
		session.save(ocorrencia);
	}

	@Override
	public void atualizar(Ocorrencia ocorrencia) {
		session.update(ocorrencia);
	}

	@Override
	public void excluir(Ocorrencia ocorrencia) {
		session.delete(ocorrencia);
	}

	@Override
	public Ocorrencia carregar(Integer id) {
		return (Ocorrencia) session.get(Ocorrencia.class, id);
	}

	@Override
	public List<Ocorrencia> listarPorData(Date dataInicio, Date dataFim) {
		Criteria criteria = session.createCriteria(Ocorrencia.class);
		criteria.add(Restrictions.between("dataAgendamento", dataInicio, dataFim));
		return (List<Ocorrencia>)criteria.list();
	}

	@Override
	public List<Ocorrencia> listarPorFabricante(Fabricante fabricante, Date dataInicio, Date dataFim) {
		Criteria criteria = session.createCriteria(Ocorrencia.class);
		criteria.add(Restrictions.between("dataAgendamento", dataInicio, dataFim));
		criteria.add(Restrictions.eq("idFabricante", fabricante.getIdFabricante()));
		return criteria.list();
	}

	@Override
	public List<Ocorrencia> listar() {
		Criteria criteria = session.createCriteria(Ocorrencia.class);
		return criteria.list();
	}
}
