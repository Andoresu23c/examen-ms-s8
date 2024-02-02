package com.uisrael.gestiontorneos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.gestiontorneos.model.Equipos;
import com.uisrael.gestiontorneos.repository.IEquiposRepository;
import com.uisrael.gestiontorneos.service.IEquiposService;

@Service
public class EquiposServiceImpl implements IEquiposService{

	@Autowired
	private IEquiposRepository repo;
	
	@Override
	public boolean insertarequipo(Equipos nEquipo) {
		// TODO Auto-generated method stub
		return repo.save(nEquipo) != null;
	}

	@Override
	public List<Equipos> listarEquipo() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public boolean updateEquipo(Equipos nuevaDisciplina) {
		// TODO Auto-generated method stub
		return repo.save(nuevaDisciplina) != null;
	}

	@Override
	public void eliminarEquipo(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
