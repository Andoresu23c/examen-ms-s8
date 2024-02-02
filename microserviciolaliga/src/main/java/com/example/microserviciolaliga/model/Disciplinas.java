package com.example.microserviciolaliga.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "disciplinas")
@Data
public class Disciplinas {
	
	@Id
	private String disId;
	private String disNombre;
	private String disTipo;
}
