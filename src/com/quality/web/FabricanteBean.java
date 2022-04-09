package com.quality.web;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.quality.fabricante.Fabricante;
import com.quality.fabricante.FabricanteRN;

@ManagedBean(name="fabricanteBean")
@SessionScoped
public class FabricanteBean implements Serializable{
	private static final long serialVersionUID = -1477506453414596398L;
	
	private Fabricante fabricante = new Fabricante();
	private List<Fabricante> fabricantes;

	public String salvar(){
		FacesContext context = FacesContext.getCurrentInstance();
		
		FabricanteRN fabricanteRN = new FabricanteRN();
		fabricanteRN.salvar(fabricante);
		fabricantes = null;
		
		FacesMessage facesMessage = new FacesMessage("Fabricante " + fabricante.getNome() + " registrado com sucesso!");
		context.addMessage(null, facesMessage);
		
		return null;
	}
	
	public String editar(){
		return "/admin/fabricante";
	}
	
	public String excluir(){
		FacesContext context = FacesContext.getCurrentInstance();
		
		FabricanteRN fabricanteRN = new FabricanteRN();
		fabricanteRN.excluir(fabricante);
		fabricantes = null;
		
		FacesMessage facesMessage = new FacesMessage("Fabricante " + fabricante.getNome() + " exclu�do com sucesso!");
		context.addMessage(null, facesMessage);
		
		return null;
	}
	
	public List<Fabricante> getFabricantes(){
		FabricanteRN fabricanteRN = new FabricanteRN();
		fabricantes = fabricanteRN.listar();
		return fabricantes;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
}
