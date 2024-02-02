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
import com.uisrael.gestiontorneos.model.Jugadores;
import com.uisrael.gestiontorneos.service.impl.JugadoresServiceImpl;

@RestController
@RequestMapping("/api/jugadores")
public class JugadoresController {

	@Autowired
	private JugadoresServiceImpl servJug;

	@PostMapping("/nuevo")
	@ResponseStatus(HttpStatus.OK)
	public boolean guardar(@RequestBody Jugadores nJug) {
		return servJug.insertarJugador(nJug);
	}

	@GetMapping("/listar")
	@ResponseStatus(HttpStatus.OK)
	public List<Jugadores> listarJugadores() {
		return servJug.listarJugador();
	}

	@PutMapping("/update")
	@ResponseStatus(HttpStatus.OK)
	public boolean actualizar(@RequestBody Jugadores update) {
		return servJug.actualizarJugador(update);
	}

	@DeleteMapping("/eliminar-{id}")
	@ResponseStatus(HttpStatus.OK)
	public void eliminar(@PathVariable String id) {
		servJug.eliminarJugador(id);
	}

}
