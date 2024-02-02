package com.uisrael.gestiontorneos.model;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Jugadores implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String jugId;
	private String jugNombre;
	private String jugApellido;
	private String jugEmail;
	private boolean jugEstado;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "fkEquipo")
	private Equipos fkEquipo;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "fkPartidos")
	private Partidos fkPartidos;	
}
