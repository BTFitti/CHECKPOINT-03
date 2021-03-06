package br.com.fiap.jpa.service.impl;

import java.util.List;

import br.com.fiap.dao.impl.ItemPedidoDAOImpl;
import br.com.fiap.jpa.entity.ItemPedido;
import br.com.fiap.jpa.service.GenericService;

public class ItemPedidoServiceImpl extends GenericService<ItemPedido, Long> {

	private static ItemPedidoServiceImpl instance = null;

	private ItemPedidoDAOImpl itempedidoDAO;

	private ItemPedidoServiceImpl() {
		itempedidoDAO = ItemPedidoDAOImpl.getInstance();
	}
	
public static ItemPedidoServiceImpl getInstance() {
		
		if (instance == null) {
			instance = new ItemPedidoServiceImpl();
		}
		
		return instance;
	}
	

	@Override
	public void atualizar(ItemPedido itempedido) {
		try {
			itempedidoDAO.atualizar(itempedido, getEntityManager());
		} catch (Exception e) {
			getEntityManager().getTransaction().rollback();
		} finally {
			closeEntityManager();
		}

	}

	@Override
	public void remover(Long id) {
		try {
			itempedidoDAO.remover(id, getEntityManager());
		} catch (Exception e) {
			e.printStackTrace();
			getEntityManager().getTransaction().rollback();
		} finally {
			closeEntityManager();
		}

	}

	@Override
	public ItemPedido obter(Long id) {
		ItemPedido itempedido = null;

		try {
			itempedido = itempedidoDAO.obterPorId(id, getEntityManager());
		} catch (Exception e) {
		} finally {
			closeEntityManager();
		}

		return itempedido;
	}

	@Override
	public List<ItemPedido> listar() {
		List<ItemPedido> itenspedidos = null;

		try {
//			alunos = alunoDAO.listar(getEntityManager());
			itenspedidos = itempedidoDAO.listar(getEntityManager());
		} catch (Exception e) {
		} finally {
			closeEntityManager();
		}

		return itenspedidos;
	}

	@Override
	public void inserir(ItemPedido instance) {
		// TODO Auto-generated method stub

	}

	public static void setInstance(ItemPedidoServiceImpl instance) {
		ItemPedidoServiceImpl.instance = instance;
	}

}
