package com.example.microserviciolaliga.service.impl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microserviciolaliga.model.Competiciones;
import com.example.microserviciolaliga.repository.ICompeticionesRepository;
import com.example.microserviciolaliga.service.ICompeticionesService;

@Service
public class CompeticionesServiceImpl implements ICompeticionesService {

	@Autowired
	private ICompeticionesRepository repo;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public boolean agregarComp(Competiciones comp) {
		// TODO Auto-generated method stub
		
		return repo.save(comp) != null;
	}

	@Override
	public List<Competiciones> listarComp() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void eliminarComp(String id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public void actualizarComp(String id, Competiciones comp) {

		Optional<Competiciones> compe = repo.findById(id);

	    if (compe.isPresent()) {	 
	        Competiciones compeExiste = compe.get();
	        modelMapper.map(comp, compeExiste);
	        compeExiste.setCompId(id);
	        repo.save(compeExiste);
	    }	   
	}

	@Override
	public void listarporId(String id) {
		
		repo.findById(id);
		
	}
}
