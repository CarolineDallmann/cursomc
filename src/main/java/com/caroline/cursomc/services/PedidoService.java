package com.caroline.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caroline.cursomc.domain.Pedido;
import com.caroline.cursomc.repositories.PedidoRepository;
import com.caroline.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired // ao usar, a dependencia é automaticamente instanciada pelo Spring
	private PedidoRepository repo; //declara dependencia tipo PedidoRepository
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
		}

}
