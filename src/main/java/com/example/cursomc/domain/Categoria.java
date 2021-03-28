package com.example.cursomc.domain;

import java.io.Serializable;

public class Categoria implements Serializable { /* Classe */
	private static final long serialVersionUID = 1L;
	
	/* Atributos */
	private Integer id;
	private String nome;
	
	/* Construtor vazio obrigatório em java */
	public Categoria() {	
	}
	
	/* Costrutor da classe */
	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	/* Métodos de acesso a classe Getters and Setters */
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/* HashCode Equals para comparação de objetos, padrão java obrigatório */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
