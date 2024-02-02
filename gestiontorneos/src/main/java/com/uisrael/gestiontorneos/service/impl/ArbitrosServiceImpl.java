package com.uisrael.gestiontorneos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.gestiontorneos.model.Arbitros;
import com.uisrael.gestiontorneos.repository.IArbitrosRepository;
import com.uisrael.gestiontorneos.service.IArbitrosService;

@Service
public class ArbitrosServiceImpl implements IArbitrosService{

	@Autowired
	private IArbitrosRepository	repo;

	@Override
	public boolean guardarArb(Arbitros nuevoArb) {
		// TODO Auto-generated method stub
		return repo.save(nuevoArb)!=null;
	}

	@Override
	public List<Arbitros> listarArb() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public boolean updateArb(Arbitros update) {
		// TODO Auto-generated method stub
		return repo.save(update)!=null;
	}

	@Override
	public void eliminarArb(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	
}
