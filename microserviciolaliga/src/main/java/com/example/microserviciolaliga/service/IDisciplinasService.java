package com.example.microserviciolaliga.service;

import java.util.List;

import com.example.microserviciolaliga.model.Disciplinas;

public interface IDisciplinasService {
	public boolean agregarDisc(Disciplinas nuevaDisciplina);

	public List<Disciplinas> listarDisc();
	
	public boolean actualizarDisc(Disciplinas nuevaDisciplina);
	
	public void eliminarDis(String id);
}
