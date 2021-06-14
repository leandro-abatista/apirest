package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.models.Produto;

/**
 * Possui vários métodos prontos para realizar persistência no banco de dados
 * @author Leandro
 *
 */
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	
	//método para buscar apenas um id
	//Produto findByPorId(Long id);
}
