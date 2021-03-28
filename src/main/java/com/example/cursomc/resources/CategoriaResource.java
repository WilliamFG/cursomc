package com.example.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias") /* Mapeia o endpoint no navegador */
public class CategoriaResource {
		
	@RequestMapping(method = RequestMethod.GET) /* método GET para tratar as requisições feitas em /categoria */
	public List<Categoria> listar () { 
		
		/* Instância dois objetos do tipo categoria e inclui em uma List */
		
		Categoria cat1 = new Categoria(1, "Informática"); 
		Categoria cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> lista =  new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista ;
	}

}
