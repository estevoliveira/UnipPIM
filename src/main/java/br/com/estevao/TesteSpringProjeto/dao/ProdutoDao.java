package br.com.estevao.TesteSpringProjeto.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.estevao.TesteSpringProjeto.model.Produto;

@Repository
@Transactional
public class ProdutoDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void gravar(Produto produto) {
		entityManager.persist(produto);
	}
}
