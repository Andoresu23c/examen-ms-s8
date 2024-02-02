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

@Data
@Entity
public class Equipos implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long equiId;
	private String equNombre;
	private int equNroIntegrantes;
	private boolean equEstado;
	
	@OneToMany(mappedBy = "fkEquipo")
	private List<Jugadores> listarJugador = new ArrayList<Jugadores>();
	
}
