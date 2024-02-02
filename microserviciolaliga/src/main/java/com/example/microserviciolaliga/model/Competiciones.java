package com.example.microserviciolaliga.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Document(collection = "competiciones")
@Data
public class Competiciones {
	@Id
	private String compId;
	private String compDireccion;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date compFechaInicio;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date compeFechaFin;
	
	@DBRef
	private Disciplinas disciplinas;
}
