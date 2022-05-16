package br.com.fiap.jpa.app;

import br.com.fiap.jpa.service.impl.BoletoServiceImpl;
import br.com.fiap.jpa.service.impl.ItemPedidoServiceImpl;
import br.com.fiap.jpa.service.impl.PedidoServiceImpl;
import br.com.fiap.jpa.service.impl.ProdutoServiceImpl;

public class Main {

	public static void main(String[] args) {
	BoletoServiceImpl boletoService = BoletoServiceImpl.getInstance();
	PedidoServiceImpl pedidoService = PedidoServiceImpl.getInstance();
	ItemPedidoServiceImpl itempedidoService = ItemPedidoServiceImpl.getInstance();
	ProdutoServiceImpl produtoService = ProdutoServiceImpl.getInstance();

	
	pedidoService.listarPedidoCPF("222.222.222-22").forEach(System.out::println);

	}

}
