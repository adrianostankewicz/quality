package com.quality.usuario;

import java.util.List;

import com.quality.util.DAOFactory;

public class UsuarioRN {

	private UsuarioDAO usuarioDAO;
	
	public UsuarioRN() {
		usuarioDAO = DAOFactory.criarUsuarioDAO();
	}

	public void salvar(Usuario usuario){
		
		Integer codigo = usuario.getId();
		
		if(codigo == null || codigo == 0){
			usuario.getPermissao().add("ROLE_USUARIO");
			usuarioDAO.salvar(usuario);
		} else{
			usuarioDAO.atualizar(usuario);
		}
	}
	
	public void excluir(Usuario usuario){
		usuarioDAO.excluir(usuario);
	}
	
	public Usuario carregar(Integer id){
		return usuarioDAO.carregar(id);
	}
	
	public Usuario buscarPorLogin(String login){
		return usuarioDAO.buscarPorLogin(login);
	}
	
	public List<Usuario> listar(){
		return usuarioDAO.listar();
	}
}
