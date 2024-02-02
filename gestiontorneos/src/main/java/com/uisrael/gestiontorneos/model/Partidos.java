package com.uisrael.gestiontorneos.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Partidos implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int partyId;
	private Date partyFecha;
	private String partyEquipo1;
	private String partyEquipo2;
	private String partyResultado;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "fkArb")
	private Arbitros fkArb;
	
	@OneToMany(mappedBy = "fkPartidos")
	private List<Jugadores> listarJug = new ArrayList<Jugadores>();
}
