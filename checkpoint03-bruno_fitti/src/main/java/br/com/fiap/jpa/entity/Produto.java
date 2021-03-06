package br.com.fiap.jpa.entity;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produto")
@SequenceGenerator(name = "produto", sequenceName = "SQ_TB_PRODUTO", allocationSize = 1)
public class Produto implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = -8198974526713670702L;

@Column(name = "ds_nome", length = 80, nullable = false)
private String nome;

@Column(name = "vl_produto")
private Float valor;

public String getNome() {
	return nome;
}

@OneToMany(mappedBy = "item_pedido")
private List<ItemPedido> itens;

public void setNome(String nome) {
	this.nome = nome;
}

public Float getValor() {
	return valor;
}

public void setValor(Float valor) {
	this.valor = valor;
}
@Override
public String toString() {
	
	return "\nNome: " + this.getNome()
		+ "\nValor: " + this.getValor();
}

}
