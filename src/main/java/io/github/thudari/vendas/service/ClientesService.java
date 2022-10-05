package io.github.thudari.vendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.thudari.vendas.model.Cliente;
import io.github.thudari.vendas.repository.ClientesRepository;

@Service
public class ClientesService {
	
	private ClientesRepository repository;
	
	@Autowired
	public ClientesService(ClientesRepository repository) {
		this.repository = repository;
	}
	
	public void salvarClientes(Cliente cliente) {
		validarCliente(cliente);
		this.repository.persistir(cliente);
	}
	
	public void validarCliente(Cliente cliente) {
		//aplica validações
	}
}
