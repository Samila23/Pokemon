package com.pokemon.pokemon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.pokemon.model.linhaEvolutiva.Forms;
import com.pokemon.pokemon.service.LinhaEvolutivaService;

@RestController
@RequestMapping("LinhaEvolutivaController")
public class LinhaEvolutivaController {
	@Autowired
	LinhaEvolutivaService linhaEvolutivaService;
	
	@GetMapping("{name}")
	public Forms getOne(@PathVariable String name) {							
		return linhaEvolutivaService.getOneLinhaEvolutiva(name);
	}
}
