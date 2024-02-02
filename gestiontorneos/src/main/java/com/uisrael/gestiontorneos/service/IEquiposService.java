package com.uisrael.gestiontorneos.service;

import java.util.List;

import com.uisrael.gestiontorneos.model.Equipos;

public interface IEquiposService {
	public boolean insertarequipo(Equipos nEquipo);

	public List<Equipos> listarEquipo();
	
	public boolean updateEquipo(Equipos nuevaDisciplina);
	
	public void eliminarEquipo(Long id);
}
