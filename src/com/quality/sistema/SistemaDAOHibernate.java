package com.quality.sistema;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class SistemaDAOHibernate implements SistemaDAO {

	private Session session;
	
	public void setSession(Session session){
		this.session = session;
	}

	@Override
	public void salvar(Sistema sistema) {
		session.save(sistema);
	}

	@Override
	public void atualizar(Sistema sistema) {
		session.update(sistema);
	}

	@Override
	public void excluir(Sistema sistema) {
		session.delete(sistema);
		
	}

	@Override
	public List<Sistema> listar() {
		Criteria criteria = session.createCriteria(Sistema.class);
		return criteria.list();
	}
	
	
}
