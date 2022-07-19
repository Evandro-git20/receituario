package com.projeto.receita.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.receita.entiteis.Receitas;
import com.projeto.receita.repositories.ReceitasRepository;

@RestController
@RequestMapping(value = "/receitas")
public class ReceitasController {
	@Autowired
	private ReceitasRepository repository;
	
	@GetMapping
	public List<Receitas> findAll(){		
		List<Receitas> resultado = repository.findAll();
		return resultado;
	}
	
	@GetMapping(value = "/{id}")
	public Receitas findById(@PathVariable Long id) {
		Receitas resultado = repository.findById(id).get();
		return resultado;
	}
	
	@PostMapping
	public Receitas save(@RequestBody Receitas receita) {
		Receitas resultado = repository.save(receita);
		return resultado;
	}
}
