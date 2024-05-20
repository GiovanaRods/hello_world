package com.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello-world")


public class controller {

	@GetMapping("helloworld")
	public String HelloWorld() {
		return "Olá mundo!";
	}
	@GetMapping("BSMs")
	public String BSMs() {
		return "Persistência\r\n"
				+ "Orientação ao Detalhe\r\n"
				+ "Orientação ao Futuro\r\n"
				+ "Responsabilidade Pessoal\r\n"
				+ "Trabalho em Equipe\r\n"
				+ "Proatividade\r\n"
				+ "Comunicação\r\n"
				+ "Mentalidade de Crescimento";
	}
	@GetMapping("Objetivos de Aprendizagem")
	public String ObjAprendizagem() {
		return "Aprender Spring\r\n"
				+ "Melhorar o banco de dados do meu projeto";
		
	}
	
	
	
}

