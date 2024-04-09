package com.backend.Empleados.Service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.backend.Empleados.modelo.EmpleadosModelo;

@Service
public interface EmpleadoService {
	//comportamiento
	
	List<EmpleadosModelo> findAll();
	
	EmpleadosModelo findById(Long Id);
	
	void CrearEmpleado(EmpleadosModelo empleadoModelo);
	
	void EliminarEmpleado(Long id);

}
