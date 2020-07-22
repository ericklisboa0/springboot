package com.loja.cursoSpring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loja.cursoSpring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){ //ResponseEntity é um tipo específico do spring para retornar respostas de requisições web
		User u = new User(1L, "Erick", "erickllm0@hotmail.com", "996993509", "1234567"); //O "L" é necessário por ser um long
		return ResponseEntity.ok().body(u); //.ok serve para retornar a resposta com sucesso no http, .body serve para retornar o corpo da resposta
	}
}
