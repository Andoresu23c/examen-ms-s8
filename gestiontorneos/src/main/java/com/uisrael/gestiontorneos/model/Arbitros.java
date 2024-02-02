package com.uisrael.gestiontorneos.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Arbitros implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int arbId;
	private String arbNombre;
	private String arbApellido;
	private String arbCi;
	private boolean arbEstado;
	
	@OneToMany(mappedBy = "fkArb")
	private List<Partidos> listarPart = new ArrayList<Partidos>();
}
