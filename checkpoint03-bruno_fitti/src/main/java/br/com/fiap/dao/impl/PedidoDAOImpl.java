package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import br.com.fiap.jpa.entity.Pedido;

public class PedidoDAOImpl extends HibernateGenericDAO<Pedido, Long>{
	private static PedidoDAOImpl instance = null;

	public static PedidoDAOImpl  getInstance() {
		if (instance == null) {
			instance = new PedidoDAOImpl ();
		}

		return instance;
	}

	private PedidoDAOImpl () {
		super(Pedido.class);
	}
	
	public List<Pedido> listarPedidoCPF(String cpfCliente, EntityManager entityManager) {
		String jpql = "SELECT p FROM Pedido p WHERE p.pedido.cpfCliente = :cpfCliente";
		
		TypedQuery<Pedido> consulta = entityManager.createQuery(jpql, Pedido.class);
		consulta.setParameter("cpfCliente", cpfCliente);
		

		return consulta.getResultList();
	}
}
