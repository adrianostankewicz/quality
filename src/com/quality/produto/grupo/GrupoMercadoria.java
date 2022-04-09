package com.quality.produto.grupo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Grupo_Mercadoria")
public class GrupoMercadoria implements Serializable {
	private static final long serialVersionUID = 1276286260540306018L;

	@Id
	@GeneratedValue
	@Column(name="Id_Grupo_Mercadoria")
	private Integer idGrupoMercadoria;
	
	@Column(name="Id_SAP")
	private String idSAP;
	
	@Column(name="Descricao")
	private String descricao;

	public Integer getIdGrupoMercadoria() {
		return idGrupoMercadoria;
	}

	public void setIdGrupoMercadoria(Integer idGrupoMercadoria) {
		this.idGrupoMercadoria = idGrupoMercadoria;
	}

	public String getIdSAP() {
		return idSAP;
	}

	public void setIdSAP(String idSAP) {
		this.idSAP = idSAP;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime
				* result
				+ ((idGrupoMercadoria == null) ? 0 : idGrupoMercadoria
						.hashCode());
		result = prime * result + ((idSAP == null) ? 0 : idSAP.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GrupoMercadoria other = (GrupoMercadoria) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (idGrupoMercadoria == null) {
			if (other.idGrupoMercadoria != null)
				return false;
		} else if (!idGrupoMercadoria.equals(other.idGrupoMercadoria))
			return false;
		if (idSAP == null) {
			if (other.idSAP != null)
				return false;
		} else if (!idSAP.equals(other.idSAP))
			return false;
		return true;
	}
}
