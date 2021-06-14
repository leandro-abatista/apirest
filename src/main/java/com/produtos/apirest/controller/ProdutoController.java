package com.produtos.apirest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;

@RestController
@RequestMapping(value = "/api")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	//criando o primeiro método
	@GetMapping("/produtos")
	public List<Produto> listaProdutos(){
		//retorna uma lista de produtos
		return produtoRepository.findAll();
	}
	
	@GetMapping("/produto/{id}")
	public Object listaProdutosPorId(@PathVariable (value = "id") Long id){
		//retorna um id
		return produtoRepository.findById(id);
	}
	
	@PostMapping("/produto")
	public Produto salvarProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
}
