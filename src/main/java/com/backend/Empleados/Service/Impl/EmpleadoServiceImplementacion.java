package com.backend.Empleados.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.Empleados.Service.EmpleadoService;
import com.backend.Empleados.modelo.EmpleadosModelo;
import com.backend.Empleados.repository.EmpleadosRepository;

@Service
public class EmpleadoServiceImplementacion implements EmpleadoService{

	@Autowired
	private EmpleadosRepository empleadoRepository;
	
	@Override
	public List<EmpleadosModelo> findAll() {
		// TODO Auto-generated method stub
		return empleadoRepository.findAll();
	}

	@Override
	public EmpleadosModelo findById(Long Id) {
		// TODO Auto-generated method stub
		return empleadoRepository.findById(Id).orElseThrow();
	}

	@Override
	public void CrearEmpleado(EmpleadosModelo empleadoModelo) {
		empleadoRepository.save(empleadoModelo);
		
	}

	@Override
	public void EliminarEmpleado(Long id) {
		empleadoRepository.deleteById(id);
		
	}

}
