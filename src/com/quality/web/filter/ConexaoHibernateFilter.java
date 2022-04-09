package com.quality.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.SessionFactory;

import com.quality.util.HibernateUtil;

public class ConexaoHibernateFilter implements Filter {

	private SessionFactory sf;
	
	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
			FilterChain chain) throws IOException, ServletException {
		try{
			sf.getCurrentSession().beginTransaction();
			chain.doFilter(servletRequest, servletResponse);
			sf.getCurrentSession().getTransaction().commit();
			sf.getCurrentSession().close();
		}catch(Throwable ex){
			try{
				if(sf.getCurrentSession().getTransaction().isActive()){
					sf.getCurrentSession().getTransaction().rollback();
				}
			}catch(Throwable t){
				t.printStackTrace();
			}
			throw new ServletException(ex);
		}	
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		sf = HibernateUtil.getSessionFactory();
	}
}
