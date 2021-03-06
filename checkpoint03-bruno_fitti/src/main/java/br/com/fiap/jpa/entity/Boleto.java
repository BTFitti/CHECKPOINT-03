package br.com.fiap.jpa.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_boleto")
@SequenceGenerator(name = "boleto", sequenceName = "SQ_TB_BOLETO", allocationSize = 1)
public class Boleto implements Serializable {

		/**
		 * 
		 */
	private static final long serialVersionUID = 1125857987782106209L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "boleto")
	private long id;

	@Column(name = "nr_nossonumero", length = 80, nullable = false)
	private String numero;

	@Column(name = "dt_vencimento")
	private LocalDateTime dataVencimento;

	@Column(name = "valor")
	private Float valor;

	@Column(name = "nr_codigobarras")
	private String codigo;

	@OneToOne(optional = false)
	@JoinColumn(name = "pedido_id")
	private Pedido pedido;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDateTime dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	@Override
	public String toString() {
		
		return "\nNosso numero: " + this.getNumero()
			+ "\nVencimento: " + this.getDataVencimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
			+ "\nValor: " + this.getValor()
			+ "\nCodigo Barras: " + this.getCodigo();
	}
}

