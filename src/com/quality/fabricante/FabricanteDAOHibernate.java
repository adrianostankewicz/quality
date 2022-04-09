package com.quality.fabricante;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class FabricanteDAOHibernate implements FabricanteDAO {

	private Session session;
	
	public void setSession(Session session){
		this.session = session;
	}
	
	@Override
	public void salvar(Fabricante fabricante) {
		session.save(fabricante);
	}

	@Override
	public void atualizar(Fabricante fabricante) {
		session.update(fabricante);
	}

	@Override
	public void excluir(Fabricante fabricante) {
		session.delete(fabricante);
	}

	@Override
	public Fabricante carregar(Integer id) {
		return (Fabricante) session.get(Fabricante.class, id);
	}
	
	@Override
	public Fabricante buscarPorNome(String nome){
		return (Fabricante) session.get(Fabricante.class, nome);
	}

	@Override
	public List<Fabricante> listar() {
		Criteria criteria = session.createCriteria(Fabricante.class);
		return criteria.list();
	}
}
