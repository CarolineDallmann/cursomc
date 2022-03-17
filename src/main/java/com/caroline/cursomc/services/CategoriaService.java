package com.caroline.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caroline.cursomc.domain.Categoria;
import com.caroline.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired // ao usar, a dependencia é automaticamente instanciada pelo Spring
	private CategoriaRepository repo; //declara dependencia tipo CategoriaRepository
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		}

}
