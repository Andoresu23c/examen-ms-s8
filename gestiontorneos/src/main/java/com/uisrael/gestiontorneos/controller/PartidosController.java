package com.uisrael.gestiontorneos.controller;

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
import com.uisrael.gestiontorneos.model.Partidos;
import com.uisrael.gestiontorneos.service.impl.PartidosServiceImpl;

@RestController
@RequestMapping("api/partidos")
public class PartidosController {
	
	@Autowired
	private PartidosServiceImpl servPart;
	
	@PostMapping("/nuevo")
	@ResponseStatus(HttpStatus.OK)
	public boolean guardarPart(@RequestBody Partidos nuevoPart) {
		return servPart.guardarPartidos(nuevoPart);
	}
	
	@GetMapping("/listar")
	@ResponseStatus(HttpStatus.OK)
	public List<Partidos> listarPartidos(){
		return servPart.listarPartidos();
	}
	@PutMapping("/update")
	@ResponseStatus(HttpStatus.OK)
	public boolean actualizar (@RequestBody Partidos update) {
		return servPart.updatePartidos(update);
	}
	
	@DeleteMapping("/eliminar-{id}")
	@ResponseStatus(HttpStatus.OK)
	public void eliminar(@PathVariable int id) {
		servPart.eliminarPartidos(id);
	}
}
