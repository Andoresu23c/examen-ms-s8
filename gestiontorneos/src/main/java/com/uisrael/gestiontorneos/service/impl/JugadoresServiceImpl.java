package com.uisrael.gestiontorneos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.gestiontorneos.model.Jugadores;
import com.uisrael.gestiontorneos.repository.IJugadoresRepository;
import com.uisrael.gestiontorneos.service.IJugadoresService;

@Service
public class JugadoresServiceImpl implements IJugadoresService {

	@Autowired
	private IJugadoresRepository repo;

	@Override
	public boolean insertarJugador(Jugadores nJugador) {
		// TODO Auto-generated method stub
		return repo.save(nJugador) != null;
	}

	@Override
	public List<Jugadores> listarJugador() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public boolean actualizarJugador(Jugadores update) {
		// TODO Auto-generated method stub
		return repo.save(update) != null;
	}

	@Override
	public void eliminarJugador(String id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
