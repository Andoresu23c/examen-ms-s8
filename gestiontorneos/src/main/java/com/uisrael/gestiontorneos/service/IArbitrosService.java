package com.uisrael.gestiontorneos.service;

import java.util.List;

import com.uisrael.gestiontorneos.model.Arbitros;

public interface IArbitrosService {
	public boolean guardarArb(Arbitros nuevoArb);
	public List<Arbitros> listarArb();
	public boolean updateArb(Arbitros update);
	public void eliminarArb(int id);
}
