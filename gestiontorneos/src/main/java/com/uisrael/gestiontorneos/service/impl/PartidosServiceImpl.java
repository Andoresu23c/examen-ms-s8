package com.uisrael.gestiontorneos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uisrael.gestiontorneos.model.Partidos;
import com.uisrael.gestiontorneos.repository.IPartidosRepository;
import com.uisrael.gestiontorneos.service.IPartidosService;

@Service
public class PartidosServiceImpl implements IPartidosService {
	@Autowired
	private IPartidosRepository repo;

	@Override
	public boolean guardarPartidos(Partidos nuevosPart) {
		// TODO Auto-generated method stub
		return repo.save(nuevosPart) != null;
	}

	@Override
	public List<Partidos> listarPartidos() {
		// TODO Auto-generated method stub

		return repo.findAll();

	}

	@Override
	public boolean updatePartidos(Partidos update) {
		// TODO Auto-generated method stub
		return repo.save(update) != null;
	}

	@Override
	public void eliminarPartidos(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
