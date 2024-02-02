package com.uisrael.gestiontorneos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.uisrael.gestiontorneos.model.CompeticionDTO;
import com.uisrael.gestiontorneos.model.DisciplinasDTO;
import com.uisrael.gestiontorneos.service.IMongoService;
import com.uisrael.gestiontorneos.util.JsonConverter;

@Service
public class MongoServiceImpl implements IMongoService {

	@Autowired
	private RestTemplate restTemp;

	@Override
	public List<DisciplinasDTO> listarDisc() {
		String endpoint = "http://localhost:56018/api/disciplinas/listar";
		String jsonResponse = restTemp.getForObject(endpoint, String.class);

		JsonConverter<DisciplinasDTO> convertir = new JsonConverter<>();
		List<DisciplinasDTO> disc = convertir.Deserializar(jsonResponse, new TypeReference<List<DisciplinasDTO>>() {
		});

		return disc;
	}

	@Override
	public List<CompeticionDTO> listarCompe() {
		String endpoint = "http://localhost:56018/api/competicion/listar";
		String jsonResponse = restTemp.getForObject(endpoint, String.class);

		JsonConverter<CompeticionDTO> convertir = new JsonConverter<>();
		List<CompeticionDTO> compe = convertir.Deserializar(jsonResponse, new TypeReference<List<CompeticionDTO>>() {
		});

		return compe;
	}
}
