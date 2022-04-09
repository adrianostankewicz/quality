package com.quality.util;

import com.quality.fabricante.FabricanteDAO;
import com.quality.fabricante.FabricanteDAOHibernate;
import com.quality.ocorrencia.OcorrenciaDAO;
import com.quality.ocorrencia.OcorrenciaDAOHibernate;
import com.quality.sistema.SistemaDAO;
import com.quality.sistema.SistemaDAOHibernate;
import com.quality.transportadora.TransportadoraDAO;
import com.quality.transportadora.TransportadoraDAOHibernate;
import com.quality.usuario.UsuarioDAO;
import com.quality.usuario.UsuarioDAOHibernate;

public class DAOFactory {

	public static OcorrenciaDAO criarOcorrenciaDAO(){
		OcorrenciaDAOHibernate ocorrenciaDAO = new OcorrenciaDAOHibernate();
		ocorrenciaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return ocorrenciaDAO;
	}
	
	public static FabricanteDAO criarFabricanteDAO(){
		FabricanteDAOHibernate fabricanteDAO = new FabricanteDAOHibernate();
		fabricanteDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return fabricanteDAO;
	}
	
	public static TransportadoraDAO criarTransportadoraDAO(){
		TransportadoraDAOHibernate transportadoraDAO = new TransportadoraDAOHibernate();
		transportadoraDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return transportadoraDAO;
	}
	
	public static SistemaDAO criarSistemaDAO(){
		SistemaDAOHibernate sistemaDAO = new SistemaDAOHibernate();
		sistemaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return sistemaDAO;
	}
	
	public static UsuarioDAO criarUsuarioDAO(){
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}
}
