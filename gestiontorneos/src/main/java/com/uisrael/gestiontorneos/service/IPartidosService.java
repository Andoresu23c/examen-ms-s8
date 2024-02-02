package com.uisrael.gestiontorneos.service;


import java.util.List;

import com.uisrael.gestiontorneos.model.Partidos;

public interface IPartidosService {
	public boolean guardarPartidos(Partidos nuevosPart);
	
	public List<Partidos> listarPartidos();
	
	public boolean updatePartidos (Partidos update);
	
	public void eliminarPartidos(int id);
}
