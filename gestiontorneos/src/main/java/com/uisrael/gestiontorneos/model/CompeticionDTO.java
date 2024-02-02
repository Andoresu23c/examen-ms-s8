package com.uisrael.gestiontorneos.model;

import java.util.Date;
import lombok.Data;

@Data
public class CompeticionDTO {
	private String compId;
	private String compDireccion;
	private Date compFechaInicio;
	private Date compeFechaFin;
	private DisciplinasDTO disciplinas;
}
