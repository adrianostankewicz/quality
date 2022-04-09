package com.quality.ocorrencia;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.quality.fabricante.Fabricante;
import com.quality.transportadora.Transportadora;

@Entity
@Table(name="Ocorrencia")
public class Ocorrencia implements Serializable{
	private static final long serialVersionUID = 5448924506541714532L;

	@Id
	@GeneratedValue
	@Column(name="Id_Ocorrencia")
	private Integer idOcorrencia;
	
	@Column(name="Data_Agendamento")
	private Date dataAgendamento;
	
	@Column(name="Hora_Agendamento")
	private String horaAgendamento;
	
	@Column(name="Data_Recebimento")
	private Date dataRecebimento;
	
	@Column(name="Hora_Recebimento")
	private String horaRecebimento;
	
	@Column(name="Qty_NF_Agendada")
	private Integer qtyNFAgendada;
	
	@Column(name="Qty_NF_Recebida")
	private Integer qtyNFRecebida;
	
	@Column(name="Qty_Pecas_Agendadas")
	private Integer qtyPecasAgendadas;
	
	@Column(name="Qty_Pecas_Recebidas")
	private Integer qtyPecasRecebidas;
	
	@Column(name="Qty_Volume_Agendado")
	private Integer qtyVolumeAgendado;
	
	@Column(name="Qty_Volume_Recebido")
	private Integer qtyVolumeRecebido;
	
	@Column(name="Qty_Veiculos")
	private Integer qtyVeiculos;
	
	@Column(name="Qty_Pallets")
	private Integer qtyPallets;
	
	@Column(name="Hora_Chegada_Portaria")
	private String horaChegadaPortaria;
	
	@Column(name="Hora_Chegada_Doca")
	private String horaChegadaDoca;
	
	@Column(name="Hora_Saida_Doca")
	private String horaSaidaDoca;
	
	@Column(name="Hora_Saida_Portaria")
	private String horaSaidaPortaria;
	
	@Column(name="Carga_Stretch")
	private Boolean cargaStretch;
	
	@Column(name="Volume_Danificado")
	private Boolean volumeDanificado;
	
	@Column(name="Necessario_Ajudante")
	private boolean necessarioAjudante;
	
	@Column(name="Ajudante_Compareceu")
	private boolean ajudanteCompareceu;
	
	@Column(name="NF_Agendamento")
	private Boolean nfAgendamento;
	
	@Column(name="Empilhamento_Maximo")
	private Boolean empilhamnetoMaximo;
	
	@Column(name="Carga_Paletizada")
	private Boolean cargaPaletizada;
	
	@Column(name="Mistura_PartNumber")
	private Boolean misturaPartNumber;
	
	@Column(name="Pedido_Liberado")
	private Boolean pedidoLiberado;
	
	@Column(name="Observacoes")
	private String observacoes;
	
	@Column(name="Valor_Nota_Fiscal")
	private double valorNotaFiscal;
	
	@ManyToOne
	@JoinColumn(name="Id_Transportadora")
	private Transportadora transportadora;
	
	@ManyToOne
	@JoinColumn(name="Id_Fabricante")
	private Fabricante fabricante;

	public Integer getIdOcorrencia() {
		return idOcorrencia;
	}

	public void setIdOcorrencia(Integer idOcorrencia) {
		this.idOcorrencia = idOcorrencia;
	}

	public Date getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public String getHoraAgendamento() {
		return horaAgendamento;
	}

	public void setHoraAgendamento(String horaAgendamento) {
		this.horaAgendamento = horaAgendamento;
	}

	public Date getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(Date dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	public String getHoraRecebimento() {
		return horaRecebimento;
	}

	public void setHoraRecebimento(String horaRecebimento) {
		this.horaRecebimento = horaRecebimento;
	}

	public Integer getQtyNFAgendada() {
		return qtyNFAgendada;
	}

	public void setQtyNFAgendada(Integer qtyNFAgendada) {
		this.qtyNFAgendada = qtyNFAgendada;
	}

	public Integer getQtyNFRecebida() {
		return qtyNFRecebida;
	}

	public void setQtyNFRecebida(Integer qtyNFRecebida) {
		this.qtyNFRecebida = qtyNFRecebida;
	}

	public Integer getQtyPecasAgendadas() {
		return qtyPecasAgendadas;
	}

	public void setQtyPecasAgendadas(Integer qtyPecasAgendadas) {
		this.qtyPecasAgendadas = qtyPecasAgendadas;
	}

	public Integer getQtyPecasRecebidas() {
		return qtyPecasRecebidas;
	}

	public void setQtyPecasRecebidas(Integer qtyPecasRecebidas) {
		this.qtyPecasRecebidas = qtyPecasRecebidas;
	}

	public Integer getQtyVolumeAgendado() {
		return qtyVolumeAgendado;
	}

	public void setQtyVolumeAgendado(Integer qtyVolumeAgendado) {
		this.qtyVolumeAgendado = qtyVolumeAgendado;
	}

	public Integer getQtyVolumeRecebido() {
		return qtyVolumeRecebido;
	}

	public void setQtyVolumeRecebido(Integer qtyVolumeRecebido) {
		this.qtyVolumeRecebido = qtyVolumeRecebido;
	}

	public Integer getQtyVeiculos() {
		return qtyVeiculos;
	}

	public void setQtyVeiculos(Integer qtyVeiculos) {
		this.qtyVeiculos = qtyVeiculos;
	}

	public Integer getQtyPallets() {
		return qtyPallets;
	}

	public void setQtyPallets(Integer qtyPallets) {
		this.qtyPallets = qtyPallets;
	}

	public String getHoraChegadaPortaria() {
		return horaChegadaPortaria;
	}

	public void setHoraChegadaPortaria(String horaChegadaPortaria) {
		this.horaChegadaPortaria = horaChegadaPortaria;
	}

	public String getHoraChegadaDoca() {
		return horaChegadaDoca;
	}

	public void setHoraChegadaDoca(String horaChegadaDoca) {
		this.horaChegadaDoca = horaChegadaDoca;
	}

	public String getHoraSaidaDoca() {
		return horaSaidaDoca;
	}

	public void setHoraSaidaDoca(String horaSaidaDoca) {
		this.horaSaidaDoca = horaSaidaDoca;
	}

	public String getHoraSaidaPortaria() {
		return horaSaidaPortaria;
	}

	public void setHoraSaidaPortaria(String horaSaidaPortaria) {
		this.horaSaidaPortaria = horaSaidaPortaria;
	}

	public Boolean getCargaStretch() {
		return cargaStretch;
	}

	public void setCargaStretch(Boolean cargaStretch) {
		this.cargaStretch = cargaStretch;
	}

	public Boolean getVolumeDanificado() {
		return volumeDanificado;
	}

	public void setVolumeDanificado(Boolean volumeDanificado) {
		this.volumeDanificado = volumeDanificado;
	}

	public boolean isNecessarioAjudante() {
		return necessarioAjudante;
	}

	public void setNecessarioAjudante(boolean necessarioAjudante) {
		this.necessarioAjudante = necessarioAjudante;
	}

	public boolean isAjudanteCompareceu() {
		return ajudanteCompareceu;
	}

	public void setAjudanteCompareceu(boolean ajudanteCompareceu) {
		this.ajudanteCompareceu = ajudanteCompareceu;
	}

	public Boolean getNfAgendamento() {
		return nfAgendamento;
	}

	public void setNfAgendamento(Boolean nfAgendamento) {
		this.nfAgendamento = nfAgendamento;
	}

	public Boolean getEmpilhamnetoMaximo() {
		return empilhamnetoMaximo;
	}

	public void setEmpilhamnetoMaximo(Boolean empilhamnetoMaximo) {
		this.empilhamnetoMaximo = empilhamnetoMaximo;
	}

	public Boolean getCargaPaletizada() {
		return cargaPaletizada;
	}

	public void setCargaPaletizada(Boolean cargaPaletizada) {
		this.cargaPaletizada = cargaPaletizada;
	}

	public Boolean getMisturaPartNumber() {
		return misturaPartNumber;
	}

	public void setMisturaPartNumber(Boolean misturaPartNumber) {
		this.misturaPartNumber = misturaPartNumber;
	}

	public Boolean getPedidoLiberado() {
		return pedidoLiberado;
	}

	public void setPedidoLiberado(Boolean pedidoLiberado) {
		this.pedidoLiberado = pedidoLiberado;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public double getValorNotaFiscal() {
		return valorNotaFiscal;
	}

	public void setValorNotaFiscal(double valorNotaFiscal) {
		this.valorNotaFiscal = valorNotaFiscal;
	}

	public Transportadora getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(Transportadora transportadora) {
		this.transportadora = transportadora;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (ajudanteCompareceu ? 1231 : 1237);
		result = prime * result
				+ ((cargaPaletizada == null) ? 0 : cargaPaletizada.hashCode());
		result = prime * result
				+ ((cargaStretch == null) ? 0 : cargaStretch.hashCode());
		result = prime * result
				+ ((dataAgendamento == null) ? 0 : dataAgendamento.hashCode());
		result = prime * result
				+ ((dataRecebimento == null) ? 0 : dataRecebimento.hashCode());
		result = prime
				* result
				+ ((empilhamnetoMaximo == null) ? 0 : empilhamnetoMaximo
						.hashCode());
		result = prime * result
				+ ((fabricante == null) ? 0 : fabricante.hashCode());
		result = prime * result
				+ ((horaAgendamento == null) ? 0 : horaAgendamento.hashCode());
		result = prime * result
				+ ((horaChegadaDoca == null) ? 0 : horaChegadaDoca.hashCode());
		result = prime
				* result
				+ ((horaChegadaPortaria == null) ? 0 : horaChegadaPortaria
						.hashCode());
		result = prime * result
				+ ((horaRecebimento == null) ? 0 : horaRecebimento.hashCode());
		result = prime * result
				+ ((horaSaidaDoca == null) ? 0 : horaSaidaDoca.hashCode());
		result = prime
				* result
				+ ((horaSaidaPortaria == null) ? 0 : horaSaidaPortaria
						.hashCode());
		result = prime * result
				+ ((idOcorrencia == null) ? 0 : idOcorrencia.hashCode());
		result = prime
				* result
				+ ((misturaPartNumber == null) ? 0 : misturaPartNumber
						.hashCode());
		result = prime * result + (necessarioAjudante ? 1231 : 1237);
		result = prime * result
				+ ((nfAgendamento == null) ? 0 : nfAgendamento.hashCode());
		result = prime * result
				+ ((observacoes == null) ? 0 : observacoes.hashCode());
		result = prime * result
				+ ((pedidoLiberado == null) ? 0 : pedidoLiberado.hashCode());
		result = prime * result
				+ ((qtyNFAgendada == null) ? 0 : qtyNFAgendada.hashCode());
		result = prime * result
				+ ((qtyNFRecebida == null) ? 0 : qtyNFRecebida.hashCode());
		result = prime * result
				+ ((qtyPallets == null) ? 0 : qtyPallets.hashCode());
		result = prime
				* result
				+ ((qtyPecasAgendadas == null) ? 0 : qtyPecasAgendadas
						.hashCode());
		result = prime
				* result
				+ ((qtyPecasRecebidas == null) ? 0 : qtyPecasRecebidas
						.hashCode());
		result = prime * result
				+ ((qtyVeiculos == null) ? 0 : qtyVeiculos.hashCode());
		result = prime
				* result
				+ ((qtyVolumeAgendado == null) ? 0 : qtyVolumeAgendado
						.hashCode());
		result = prime
				* result
				+ ((qtyVolumeRecebido == null) ? 0 : qtyVolumeRecebido
						.hashCode());
		result = prime * result
				+ ((transportadora == null) ? 0 : transportadora.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valorNotaFiscal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime
				* result
				+ ((volumeDanificado == null) ? 0 : volumeDanificado.hashCode());
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
		Ocorrencia other = (Ocorrencia) obj;
		if (ajudanteCompareceu != other.ajudanteCompareceu)
			return false;
		if (cargaPaletizada == null) {
			if (other.cargaPaletizada != null)
				return false;
		} else if (!cargaPaletizada.equals(other.cargaPaletizada))
			return false;
		if (cargaStretch == null) {
			if (other.cargaStretch != null)
				return false;
		} else if (!cargaStretch.equals(other.cargaStretch))
			return false;
		if (dataAgendamento == null) {
			if (other.dataAgendamento != null)
				return false;
		} else if (!dataAgendamento.equals(other.dataAgendamento))
			return false;
		if (dataRecebimento == null) {
			if (other.dataRecebimento != null)
				return false;
		} else if (!dataRecebimento.equals(other.dataRecebimento))
			return false;
		if (empilhamnetoMaximo == null) {
			if (other.empilhamnetoMaximo != null)
				return false;
		} else if (!empilhamnetoMaximo.equals(other.empilhamnetoMaximo))
			return false;
		if (fabricante == null) {
			if (other.fabricante != null)
				return false;
		} else if (!fabricante.equals(other.fabricante))
			return false;
		if (horaAgendamento == null) {
			if (other.horaAgendamento != null)
				return false;
		} else if (!horaAgendamento.equals(other.horaAgendamento))
			return false;
		if (horaChegadaDoca == null) {
			if (other.horaChegadaDoca != null)
				return false;
		} else if (!horaChegadaDoca.equals(other.horaChegadaDoca))
			return false;
		if (horaChegadaPortaria == null) {
			if (other.horaChegadaPortaria != null)
				return false;
		} else if (!horaChegadaPortaria.equals(other.horaChegadaPortaria))
			return false;
		if (horaRecebimento == null) {
			if (other.horaRecebimento != null)
				return false;
		} else if (!horaRecebimento.equals(other.horaRecebimento))
			return false;
		if (horaSaidaDoca == null) {
			if (other.horaSaidaDoca != null)
				return false;
		} else if (!horaSaidaDoca.equals(other.horaSaidaDoca))
			return false;
		if (horaSaidaPortaria == null) {
			if (other.horaSaidaPortaria != null)
				return false;
		} else if (!horaSaidaPortaria.equals(other.horaSaidaPortaria))
			return false;
		if (idOcorrencia == null) {
			if (other.idOcorrencia != null)
				return false;
		} else if (!idOcorrencia.equals(other.idOcorrencia))
			return false;
		if (misturaPartNumber == null) {
			if (other.misturaPartNumber != null)
				return false;
		} else if (!misturaPartNumber.equals(other.misturaPartNumber))
			return false;
		if (necessarioAjudante != other.necessarioAjudante)
			return false;
		if (nfAgendamento == null) {
			if (other.nfAgendamento != null)
				return false;
		} else if (!nfAgendamento.equals(other.nfAgendamento))
			return false;
		if (observacoes == null) {
			if (other.observacoes != null)
				return false;
		} else if (!observacoes.equals(other.observacoes))
			return false;
		if (pedidoLiberado == null) {
			if (other.pedidoLiberado != null)
				return false;
		} else if (!pedidoLiberado.equals(other.pedidoLiberado))
			return false;
		if (qtyNFAgendada == null) {
			if (other.qtyNFAgendada != null)
				return false;
		} else if (!qtyNFAgendada.equals(other.qtyNFAgendada))
			return false;
		if (qtyNFRecebida == null) {
			if (other.qtyNFRecebida != null)
				return false;
		} else if (!qtyNFRecebida.equals(other.qtyNFRecebida))
			return false;
		if (qtyPallets == null) {
			if (other.qtyPallets != null)
				return false;
		} else if (!qtyPallets.equals(other.qtyPallets))
			return false;
		if (qtyPecasAgendadas == null) {
			if (other.qtyPecasAgendadas != null)
				return false;
		} else if (!qtyPecasAgendadas.equals(other.qtyPecasAgendadas))
			return false;
		if (qtyPecasRecebidas == null) {
			if (other.qtyPecasRecebidas != null)
				return false;
		} else if (!qtyPecasRecebidas.equals(other.qtyPecasRecebidas))
			return false;
		if (qtyVeiculos == null) {
			if (other.qtyVeiculos != null)
				return false;
		} else if (!qtyVeiculos.equals(other.qtyVeiculos))
			return false;
		if (qtyVolumeAgendado == null) {
			if (other.qtyVolumeAgendado != null)
				return false;
		} else if (!qtyVolumeAgendado.equals(other.qtyVolumeAgendado))
			return false;
		if (qtyVolumeRecebido == null) {
			if (other.qtyVolumeRecebido != null)
				return false;
		} else if (!qtyVolumeRecebido.equals(other.qtyVolumeRecebido))
			return false;
		if (transportadora == null) {
			if (other.transportadora != null)
				return false;
		} else if (!transportadora.equals(other.transportadora))
			return false;
		if (Double.doubleToLongBits(valorNotaFiscal) != Double
				.doubleToLongBits(other.valorNotaFiscal))
			return false;
		if (volumeDanificado == null) {
			if (other.volumeDanificado != null)
				return false;
		} else if (!volumeDanificado.equals(other.volumeDanificado))
			return false;
		return true;
	}
}
