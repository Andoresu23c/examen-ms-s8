package com.uisrael.gestiontorneos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.uisrael.gestiontorneos.model.CompeticionDTO;
import com.uisrael.gestiontorneos.model.DisciplinasDTO;
import com.uisrael.gestiontorneos.service.impl.MongoServiceImpl;

@RestController
@RequestMapping("/mongo")
public class MongoController {
	@Autowired
	private MongoServiceImpl servM;

	
	@GetMapping("/listarcompeticion")
	@ResponseStatus(HttpStatus.OK)
	public List<CompeticionDTO> listarcompe() {
		return servM.listarCompe();
	}
	
	@GetMapping("/listardisc")
	@ResponseStatus(HttpStatus.OK)
	public List<DisciplinasDTO> listardisc() {
		return servM.listarDisc();
	}
}
