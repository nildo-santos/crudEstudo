package br.com.nildosantos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nildosantos.dto.ClienteRequest;
import br.com.nildosantos.dto.ClienteResponse;
import br.com.nildosantos.service.ClienteService;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping("/cadastrar")
	public ResponseEntity<ClienteResponse> post(@RequestBody ClienteRequest request){
		var response = clienteService.response(request);
		
		
		return ResponseEntity.ok(response);
	}
}
