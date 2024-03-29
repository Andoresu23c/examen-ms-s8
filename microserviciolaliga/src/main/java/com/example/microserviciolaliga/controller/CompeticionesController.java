package com.example.microserviciolaliga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.microserviciolaliga.model.Competiciones;
import com.example.microserviciolaliga.service.impl.CompeticionesServiceImpl;

@RestController
@RequestMapping("/api/competicion")
public class CompeticionesController {
	@Autowired
	private CompeticionesServiceImpl servComp;

	@PostMapping("/nuevo")
	@ResponseStatus(HttpStatus.OK)
	public void guardarComp(@RequestBody Competiciones comp) {		
		servComp.agregarComp(comp);
	}

	@GetMapping("/listar")
	@ResponseStatus(HttpStatus.OK)
	public List<Competiciones> listarComp() {
		return servComp.listarComp();
	}
	
	@GetMapping("/listar-{id}")
	@ResponseStatus(HttpStatus.OK)
	public void listarId(@PathVariable String id) {
		servComp.listarporId(id);
	}

	@PutMapping("/update-{id}")
	@ResponseStatus(HttpStatus.OK)
	public void actualizarComp(@PathVariable(value = "id") String id, @RequestBody Competiciones compe) {
		servComp.actualizarComp(id, compe);
	}
	
	@DeleteMapping("/borrar/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void eliminarComp(@PathVariable String id) {
		servComp.eliminarComp(id);
	}
}
