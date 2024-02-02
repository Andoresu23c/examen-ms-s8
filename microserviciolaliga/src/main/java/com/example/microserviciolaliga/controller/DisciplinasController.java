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

import com.example.microserviciolaliga.model.Disciplinas;
import com.example.microserviciolaliga.service.IDisciplinasService;

@RestController
@RequestMapping("/api/disciplinas")
public class DisciplinasController {
	@Autowired
	private IDisciplinasService servDisc;
	
	@PostMapping("/nuevo")
	@ResponseStatus(HttpStatus.OK)
	public void guardarDisciplinas(@RequestBody Disciplinas disciplinas) {
		servDisc.agregarDisc(disciplinas);
	}
	
	@GetMapping("/listar")
	@ResponseStatus(HttpStatus.OK)
	public List<Disciplinas> listarDisciplinas(){
		return servDisc.listarDisc();
	}
	
	@PutMapping("/update")
	@ResponseStatus(HttpStatus.OK)
	public void actualizarDisciplinas(@RequestBody Disciplinas disciplinas) {
		servDisc.actualizarDisc(disciplinas);
	}
	
	@DeleteMapping("/eliminar-{id}")
	@ResponseStatus(HttpStatus.OK)
	public void eliminarDisciplinas(@PathVariable String id) {
		servDisc.eliminarDis(id);
	}
	
}
