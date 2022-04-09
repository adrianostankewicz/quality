package com.quality.web;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.quality.usuario.Usuario;
import com.quality.usuario.UsuarioRN;

@ManagedBean(name="usuarioBean")
@RequestScoped
public class UsuarioBean {

	private Usuario usuario = new Usuario();
	private String confirmarSenha;
	private List<Usuario> usuarios;

	public String novo(){
		usuario = new Usuario();
		usuario.setAtivo(true);
		usuario.setDataCadastro(new Date(System.currentTimeMillis()));
		return "/admin/usuario";
	}
	
	public String salvar(){
		FacesContext context = FacesContext.getCurrentInstance();
		
		String senha = usuario.getSenha();
		if(!senha.equals(confirmarSenha)){
			FacesMessage facesMessage =  new FacesMessage("A senha n�o foi confirmada corretamente!");
			context.addMessage(null, facesMessage);
			return null;
		}
		
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.salvar(usuario);
		
		FacesMessage facesMessage =  new FacesMessage("Usu�rio " + usuario.getNome() + " cadastrado com sucesso");
		context.addMessage(null, facesMessage);
		return null;
	}
	
	public String editar(){
		confirmarSenha = usuario.getSenha();
		return "/public/usuario";
	}
	
	public String excluir(){
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.excluir(usuario);
		usuarios = null;
		return null;
	}
	
	public String ativar(){
		if(usuario.isAtivo()){
			usuario.setAtivo(false);
		}else{
			usuario.setAtivo(true);
		}
		
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.salvar(usuario);
		return null;
	}
	
	public String atribuirPermissao(Usuario usuario, String permissao){
		this.usuario = usuario;
		Set<String> permissoes = usuario.getPermissao();
		if(permissoes.contains(permissao)){
			permissoes.remove(permissao);
		}else{
			permissoes.add(permissao);
		}
		return null;
	}
	
	public List<Usuario> getUsuarios(){
		if(usuarios == null){
			UsuarioRN usuarioRN = new UsuarioRN();
			usuarios = usuarioRN.listar();
		}
		return usuarios;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getConfirmarSenha() {
		return confirmarSenha;
	}
	public void setConfirmarSenha(String confirmarSenha) {
		this.confirmarSenha = confirmarSenha;
	}
}
