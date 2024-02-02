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
import com.uisrael.gestiontorneos.model.Equipos;
import com.uisrael.gestiontorneos.service.impl.EquiposServiceImpl;

@RestController
@RequestMapping("/api/equipos")
public class EquiposController {
	@Autowired
	private EquiposServiceImpl servEquipo;

	@PostMapping("/nuevo")
	@ResponseStatus(HttpStatus.OK)
	public boolean guardar(@RequestBody Equipos nEquip) {
		return servEquipo.insertarequipo(nEquip);
	}

	@GetMapping("/listar")
	@ResponseStatus(HttpStatus.OK)
	public List<Equipos> listarJugadores() {
		return servEquipo.listarEquipo();
	}

	@PutMapping("/update")
	@ResponseStatus(HttpStatus.OK)
	public boolean actualizar(@RequestBody Equipos update) {
		return servEquipo.updateEquipo(update);
	}

	@DeleteMapping("/eliminar-{id}")
	@ResponseStatus(HttpStatus.OK)
	public void eliminar(@PathVariable Long id) {
		servEquipo.eliminarEquipo(id);
	}
}
