package com.quality.produto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

import com.quality.produto.grupo.GrupoMercadoria;
import com.quality.produto.hierarquia.HierarquiaProduto;

@Entity
@Table(name="Produto")
public class Produto implements Serializable{
	private static final long serialVersionUID = 6088205161630237062L;
	
	@Id
	@GeneratedValue
	@Column(name="Id_Produto")
	private Integer idProduto;
	
	@Column(name="Id_SAP")
	@NaturalId
	private Integer idSAP;
	
	@Column(name="Descricao")
	private String descricao;
	
	@Column(name="Serial_Number")
	private String serialNumber;
	
	@Column(name="Id_Grupo_Mercadoria")
	private GrupoMercadoria grupoMercadoria;
	
	@Column(name="Id_Hierarquia_Produto")
	private HierarquiaProduto hierarquiaProduto;

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public Integer getIdSAP() {
		return idSAP;
	}

	public void setIdSAP(Integer idSAP) {
		this.idSAP = idSAP;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public GrupoMercadoria getGrupoMercadoria() {
		return grupoMercadoria;
	}

	public void setGrupoMercadoria(GrupoMercadoria grupoMercadoria) {
		this.grupoMercadoria = grupoMercadoria;
	}

	public HierarquiaProduto getHierarquiaProduto() {
		return hierarquiaProduto;
	}

	public void setHierarquiaProduto(HierarquiaProduto hierarquiaProduto) {
		this.hierarquiaProduto = hierarquiaProduto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((grupoMercadoria == null) ? 0 : grupoMercadoria.hashCode());
		result = prime
				* result
				+ ((hierarquiaProduto == null) ? 0 : hierarquiaProduto
						.hashCode());
		result = prime * result
				+ ((idProduto == null) ? 0 : idProduto.hashCode());
		result = prime * result + ((idSAP == null) ? 0 : idSAP.hashCode());
		result = prime * result
				+ ((serialNumber == null) ? 0 : serialNumber.hashCode());
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
		Produto other = (Produto) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (grupoMercadoria == null) {
			if (other.grupoMercadoria != null)
				return false;
		} else if (!grupoMercadoria.equals(other.grupoMercadoria))
			return false;
		if (hierarquiaProduto == null) {
			if (other.hierarquiaProduto != null)
				return false;
		} else if (!hierarquiaProduto.equals(other.hierarquiaProduto))
			return false;
		if (idProduto == null) {
			if (other.idProduto != null)
				return false;
		} else if (!idProduto.equals(other.idProduto))
			return false;
		if (idSAP == null) {
			if (other.idSAP != null)
				return false;
		} else if (!idSAP.equals(other.idSAP))
			return false;
		if (serialNumber == null) {
			if (other.serialNumber != null)
				return false;
		} else if (!serialNumber.equals(other.serialNumber))
			return false;
		return true;
	}
}
