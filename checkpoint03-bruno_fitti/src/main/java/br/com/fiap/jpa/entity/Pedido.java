package br.com.fiap.jpa.entity;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pedido")
@SequenceGenerator(name = "pedido", sequenceName = "SQ_TB_PEDIDO", allocationSize = 1)
public class Pedido implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = -6881254468944954783L;

	public Pedido(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido")
private long id;

@Column(name = "nr_cpf")
private String cpfCliente;

@Column(name = "nr_pedido", length = 80, nullable = false)
private String numeroPedido;

@Column(name = "vl_total")
private Float valorTotal;



@OneToMany(mappedBy = "itempedido")
private List<ItemPedido> itens;


public String getCpfCliente() {
	return cpfCliente;
}
public void setCpfCliente(String cpfCliente) {
	this.cpfCliente = cpfCliente;
}
public String getNumeroPedido() {
	return numeroPedido;
}
public void setNumeroPedido(String numeroPedido) {
	this.numeroPedido = numeroPedido;
}
public Float getValorTotal() {
	return valorTotal;
}
public void setValorTotal(Float valorTotal) {
	this.valorTotal = valorTotal;
}
public List<ItemPedido> getItens() {
	return itens;
}
public void setItens(List<ItemPedido> itens) {
	this.itens = itens;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

@Override
public String toString() {
	
	return "\nCpf: " + this.getCpfCliente() 
		+ "\nNumeroPedido: " + this.getNumeroPedido()
		+ "\nValor Total: " + this.getValorTotal();
}


}

