package com.backend.Empleados.Controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoDTO {
	private String nombre;
	private String apellido;
	private String puesto;
	private int sueldo;
	private String contacto;
}
