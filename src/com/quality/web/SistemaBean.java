package com.quality.web;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.quality.sistema.Sistema;
import com.quality.sistema.SistemaRN;

@ManagedBean(name="sistemaBean")
@ApplicationScoped
public class SistemaBean implements Serializable {
	private static final long serialVersionUID = 3070325785614426134L;

	private Sistema sistema = new Sistema();
	private SistemaRN sistemaRN = new SistemaRN();
	private String[] sistemas = new String[]{"afterdark","afternoon","afterwork","aristo","black-tie","blitzer","bluesky",
			                                 "casablanca","cruze","cupertino","dark-hive","delta", "dot-luv","eggplant",
			                                 "excite-bike","flick","glass-x","home", "hot-sneaks","humanity","le-frog",
			                                 "midnight", "mint-choc","overcast","pepper-grinder","redmond","rocket","sam",
			                                 "smoothness","south-street", "start","sunny","swanky-purse","trontastic",
			                                 "twitter bootstrap","ui-darkness","ui-lightness","vader"};
	
	private String temaSelecionado;
	
	public SistemaBean(){
		this.temaSelecionado = "home";
	}
	
	public Sistema getSistema() {
		return sistema;
	}
	
	public String[] getSistemas(){
		return sistemas;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public SistemaRN getSistemaRN() {
		return sistemaRN;
	}

	public void setSistemaRN(SistemaRN sistemaRN) {
		this.sistemaRN = sistemaRN;
	}

	public String getTemaSelecionado() {
		return temaSelecionado;
	}

	public void setTemaSelecionado(String temaSelecionado) {
		this.temaSelecionado = temaSelecionado;
	}
}
