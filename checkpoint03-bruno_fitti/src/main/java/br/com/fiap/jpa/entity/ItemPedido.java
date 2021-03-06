package br.com.fiap.jpa.entity;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_item_pedido")
@SequenceGenerator(name = "item_pedido", sequenceName = "SQ_TB_ITEMPEDIDO", allocationSize = 1)
public class ItemPedido implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1366233882005356428L;

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_pedido")
private long id;

@Column(name = "nr_quantidade", length = 80, nullable = false)
private String quantidade;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "produto_id")
private Produto produto;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getQuantidade() {
	return quantidade;
}

public void setQuantidade(String quantidade) {
	this.quantidade = quantidade;
}

public Produto getProduto() {
	return produto;
}

public void setProduto(Produto produto) {
	this.produto = produto;
}
@Override
public String toString() {
	
	return "\nQuantidade: " + this.getQuantidade();

}

}
