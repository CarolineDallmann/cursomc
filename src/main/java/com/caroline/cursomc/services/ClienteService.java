package com.caroline.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caroline.cursomc.domain.Cliente;
import com.caroline.cursomc.repositories.ClienteRepository;
import com.caroline.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired // ao usar, a dependencia é automaticamente instanciada pelo Spring
	private ClienteRepository repo; //declara dependencia tipo ClienteRepository
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		}

}
