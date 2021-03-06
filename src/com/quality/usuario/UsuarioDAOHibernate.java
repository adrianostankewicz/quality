package com.quality.usuario;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class UsuarioDAOHibernate implements UsuarioDAO {

	private Session session;
	
	public void setSession(Session session){
		this.session = session;
	}

	@Override
	public void salvar(Usuario usuario) {
		session.save(usuario);
	}

	@Override
	public void atualizar(Usuario usuario) {
		if(usuario.getPermissao() == null || usuario.getPermissao().size() == 0){
			Usuario usuarioPermissao = carregar(usuario.getId());
			usuario.setPermissao(usuarioPermissao.getPermissao());
			session.evict(usuarioPermissao);
		}
		session.update(usuario);
	}

	@Override
	public void excluir(Usuario usuario) {
		session.delete(usuario);
	}

	@Override
	public Usuario carregar(Integer id) {
		return (Usuario)session.get(Usuario.class, id);
	}

	@Override
	public Usuario buscarPorLogin(String login) {
		String sql = "select u from Usuario u where u.login= :login";
		Query query = session.createQuery(sql);
		query.setString("login",login);
		return (Usuario)query.uniqueResult();
	}

	@Override
	public List<Usuario> listar() {
		return session.createCriteria(Usuario.class).list();
	}
}
