package com.example.microserviciolaliga.service;

import java.util.List;

import com.example.microserviciolaliga.model.Competiciones;

public interface ICompeticionesService {
	public boolean agregarComp(Competiciones comp);

	public List<Competiciones> listarComp();
	
	public void actualizarComp(String id, Competiciones comp);
	
	public void eliminarComp(String id);
	
	public void listarporId(String id);
}
