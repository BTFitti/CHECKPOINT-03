package br.com.fiap.dao.impl;

import br.com.fiap.jpa.entity.Produto;

public class ProdutoDAOImpl extends HibernateGenericDAO<Produto, Long>{
	private static ProdutoDAOImpl instance = null;

	public static ProdutoDAOImpl  getInstance() {
		if (instance == null) {
			instance = new ProdutoDAOImpl ();
		}

		return instance;
	}

	private ProdutoDAOImpl () {
		super(Produto.class);
	}
}
