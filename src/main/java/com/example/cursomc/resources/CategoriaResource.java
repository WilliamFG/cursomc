package com.example.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.cursomc.domain.Categoria;
import com.example.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias") /* Mapeia o endpoint no navegador */
public class CategoriaResource {
	
	@Autowired /* instância objetos automaticamente */
	public CategoriaService service;
	
	/* método GET para tratar as requisições feitas em /categoria */
	@RequestMapping(value = "/{id}",method = RequestMethod.GET) 
	
	/* @PathVariable para conectar o id da requisição com id da classe */
	public ResponseEntity<?> find(@PathVariable Integer id) { 
	Categoria obj = service.buscar(id);
	return ResponseEntity.ok().body(obj);	
		
	}

}
