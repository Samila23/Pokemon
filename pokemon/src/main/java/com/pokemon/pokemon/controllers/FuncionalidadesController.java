package com.pokemon.pokemon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.pokemon.model.funcionalidades.Funcionalidades;
import com.pokemon.pokemon.service.FuncionalidadesService;

@RestController
@RequestMapping("FuncionalidadesController")
public class FuncionalidadesController {
	
	@Autowired
	FuncionalidadesService funcionalidadesService;
	@GetMapping("{name}")
	public Funcionalidades getOne(@PathVariable String name) {							
		return funcionalidadesService.getOne(name);
	}
}
