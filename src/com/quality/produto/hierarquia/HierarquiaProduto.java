package com.quality.produto.hierarquia;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Hierarquia_Produto")
public class HierarquiaProduto implements Serializable{
	private static final long serialVersionUID = -35669498784219492L;

	@Id
	@GeneratedValue
	@Column(name="Id_Hierarquia_Produto")
	private Integer idHierarquiaProduto;
	
	@Column(name="Id_SAP")
	private String idSAP;
	
	@Column(name="Descricao")
	private String descricao;

	public Integer getIdHierarquiaProduto() {
		return idHierarquiaProduto;
	}

	public void setIdHierarquiaProduto(Integer idHierarquiaProduto) {
		this.idHierarquiaProduto = idHierarquiaProduto;
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
				+ ((idHierarquiaProduto == null) ? 0 : idHierarquiaProduto
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
		HierarquiaProduto other = (HierarquiaProduto) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (idHierarquiaProduto == null) {
			if (other.idHierarquiaProduto != null)
				return false;
		} else if (!idHierarquiaProduto.equals(other.idHierarquiaProduto))
			return false;
		if (idSAP == null) {
			if (other.idSAP != null)
				return false;
		} else if (!idSAP.equals(other.idSAP))
			return false;
		return true;
	}
}
