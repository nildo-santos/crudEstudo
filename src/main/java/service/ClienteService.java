package service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import dto.ClienteRequest;
import dto.ClienteResponse;
import entities.Cliente;

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
