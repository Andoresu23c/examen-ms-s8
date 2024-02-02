package com.uisrael.gestiontorneos.service;

import java.util.List;

import com.uisrael.gestiontorneos.model.Jugadores;

public interface IJugadoresService {
	public boolean insertarJugador(Jugadores nJugador);

	public List<Jugadores> listarJugador();

	public boolean actualizarJugador(Jugadores update);

	public void eliminarJugador(String id);
}
