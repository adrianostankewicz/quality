package com.quality.transportadora;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;


public class TransportadoraDAOHibernate implements TransportadoraDAO {
	
	private Session session;
	
	public void setSession(Session session){
		this.session = session;
	}

	@Override
	public void salvar(Transportadora transportadora) {
		session.save(transportadora);
	}

	@Override
	public void atualizar(Transportadora transportadora) {
		session.update(transportadora);
	}

	@Override
	public void excluir(Transportadora transportadora) {
		session.delete(transportadora);
	}

	@Override
	public Transportadora carregar(Integer id) {
		return (Transportadora) session.get(Transportadora.class, id);
	}
	
	@Override
	public Transportadora buscarPorNome(String nome) {
		return (Transportadora)session.get(Transportadora.class, nome);
	}

	@Override
	public List<Transportadora> listar() {
		Criteria criteria = session.createCriteria(Transportadora.class);
		return criteria.list();
	}
}
