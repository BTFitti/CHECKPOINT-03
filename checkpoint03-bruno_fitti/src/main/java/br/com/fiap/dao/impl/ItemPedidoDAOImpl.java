package br.com.fiap.dao.impl;

import br.com.fiap.jpa.entity.Boleto;
import br.com.fiap.jpa.entity.ItemPedido;
import br.com.fiap.jpa.entity.Pedido;

public class ItemPedidoDAOImpl extends HibernateGenericDAO<ItemPedido, Long>{
	private static ItemPedidoDAOImpl instance = null;

	public static ItemPedidoDAOImpl  getInstance() {
		if (instance == null) {
			instance = new ItemPedidoDAOImpl ();
		}

		return instance;
	}

	private ItemPedidoDAOImpl () {
		super(ItemPedido.class);
	}
}
