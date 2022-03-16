package com.caroline.cursomc.domain;

import java.io.Serializable;
import java.util.Objects;

public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	// atributos básicos (por padrão privado)
	private Integer id;
	private String nome;

	public Categoria() {// construtor: com ele constroi um objeto sem jogar nada para os
						// atributos
	}

	public Categoria(Integer id, String nome) {// construtor com os atributos recebendo
		super(); // um id e nome para povoar os dados dos atributos
		this.id = id; // com os dados do construtor
		this.nome = nome;
	}

	// getters e setters são métodos de acesso para os atributos
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return Objects.equals(id, other.id);
	}

}
