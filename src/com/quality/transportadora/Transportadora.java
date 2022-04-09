package com.quality.transportadora;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transportadora")
public class Transportadora implements Serializable {
	private static final long serialVersionUID = 5296668107942989280L;

	@Id
	@GeneratedValue
	@Column(name="Id_Transportadora")
	private Integer idTransportadora;
	
	@Column(name="Nome")
	private String nome;

	public Integer getIdTransportadora() {
		return idTransportadora;
	}

	public void setIdTransportadora(Integer idTransportadora) {
		this.idTransportadora = idTransportadora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((idTransportadora == null) ? 0 : idTransportadora.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Transportadora other = (Transportadora) obj;
		if (idTransportadora == null) {
			if (other.idTransportadora != null)
				return false;
		} else if (!idTransportadora.equals(other.idTransportadora))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
