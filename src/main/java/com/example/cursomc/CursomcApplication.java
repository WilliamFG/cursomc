package com.example.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.cursomc.domain.Categoria;
import com.example.cursomc.domain.Produto;
import com.example.cursomc.repositories.CategoriaRepository;
import com.example.cursomc.repositories.ProdutoRepository;



@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

		
	@Autowired
	private CategoriaRepository categoriaRepository; /* cria a depencia para conexão com o repository */
	
	@Autowired
	private ProdutoRepository produtoRepository; /* cria a depencia para conexão com o repository */
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Categoria cat1 = new Categoria(null, "informática");
		Categoria cat2 = new Categoria(null, "escritório");

		Produto p1 = new Produto (null, "computador", 2000.00);
		Produto p2 = new Produto (null, "impressora", 800.00);
		Produto p3 = new Produto (null, "mouse", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3)); /* Cria as instâncias das associações muitos pra muitos */
		cat2.getProdutos().addAll(Arrays.asList(p2)); /* Cria as instâncias das associações muitos pra muitos */
		
		p1.getCategoria().addAll(Arrays.asList(cat1)); /* Cria as instâncias das associações muitos pra muitos */
		p2.getCategoria().addAll(Arrays.asList(cat1, cat2)); /* Cria as instâncias das associações muitos pra muitos */
		p3.getCategoria().addAll(Arrays.asList(cat1)); /* Cria as instâncias das associações muitos pra muitos */
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2)); /* carrega objetos no banco de dados */
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3)); /* carrega objetos no banco de dados */
		
	}
	
	

}
