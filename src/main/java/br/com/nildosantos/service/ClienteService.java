package br.com.nildosantos.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.nildosantos.dto.ClienteRequest;
import br.com.nildosantos.dto.ClienteResponse;
import br.com.nildosantos.entities.Cliente;

@Service
public class ClienteService {

	
	public ClienteResponse response(ClienteRequest request) {
		var cliente = new Cliente();
		 cliente.setId(UUID.randomUUID());	
		 cliente.setNome(request.getNome());	
		 
		var clienteResponse = new ClienteResponse();
			clienteResponse.setNome(cliente.getNome());
		
			return clienteResponse;
	}
		
	 
	
}