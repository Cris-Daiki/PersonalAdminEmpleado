package com.backend.Empleados.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.backend.Empleados.Controller.dto.EmpleadoDTO;
import com.backend.Empleados.Service.EmpleadoService;
import com.backend.Empleados.modelo.EmpleadosModelo;

@Controller
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService empleadoServicio;
	
	@GetMapping(path = {"/", "/all"})
	public String ShowAll(Model model){
		List<EmpleadosModelo> empleadoModeloList = empleadoServicio.findAll();
		model.addAttribute("Empleados",empleadoModeloList);
		return "index";
		
	}
	
	@GetMapping("/create/form")
	public String createForm(Model model) {
		model.addAttribute("empleado",new EmpleadosModelo());
		return "form";
	}
	
	//dto es DATA TRANSFER OBJET, se hace asi, esa clase para no recibir directamente como parametro una entidad .(modelo) es una mala practica
	//el DTO es un patron de diseño(objetos de transferencia de datos)
	@PostMapping("/create/process")
	public String createProcess(EmpleadoDTO empleadoDTO) {
		//con esto creamos nuestro objeto empleadoModelo
		EmpleadosModelo empleadoModelo =EmpleadosModelo.builder()
				.nombre(empleadoDTO.getNombre())
				.apellido(empleadoDTO.getApellido())
				.contacto(empleadoDTO.getContacto())
				.puesto(empleadoDTO.getPuesto())
				.sueldo(empleadoDTO.getSueldo())
				.build();
		empleadoServicio.CrearEmpleado(empleadoModelo);
		return "redirect:/all"; //este es un endpoint , y lo redireccionamos a el
	}
	
	
	
}
