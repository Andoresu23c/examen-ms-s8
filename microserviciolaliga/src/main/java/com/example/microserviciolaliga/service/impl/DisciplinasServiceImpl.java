package com.example.microserviciolaliga.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microserviciolaliga.model.Disciplinas;
import com.example.microserviciolaliga.repository.IDisciplinasRepository;
import com.example.microserviciolaliga.service.IDisciplinasService;

@Service
public class DisciplinasServiceImpl implements IDisciplinasService{

	@Autowired
	private IDisciplinasRepository repo;
	
	@Override
	public boolean agregarDisc(Disciplinas nuevaDisciplina) {
		// TODO Auto-generated method stub
		return repo.save(nuevaDisciplina)!=null;
	}

	@Override
	public List<Disciplinas> listarDisc() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public boolean actualizarDisc(Disciplinas disc) {
		// TODO Auto-generated method stub
		return repo.save(disc)!=null;
	}

	@Override
	public void eliminarDis(String id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
}
