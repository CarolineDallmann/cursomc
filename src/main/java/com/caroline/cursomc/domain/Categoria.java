package com.caroline.cursomc.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;// atributos básicos (por padrão privado)
	private String nome;

	public Categoria() {// construtor vazio: com ele constroi um objeto sem jogar nada para os
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
