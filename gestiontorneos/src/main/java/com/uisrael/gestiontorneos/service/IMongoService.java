package com.uisrael.gestiontorneos.service;

import java.util.List;

import com.uisrael.gestiontorneos.model.CompeticionDTO;
import com.uisrael.gestiontorneos.model.DisciplinasDTO;

public interface IMongoService {
	public List<DisciplinasDTO> listarDisc();

	public List<CompeticionDTO> listarCompe();
}
