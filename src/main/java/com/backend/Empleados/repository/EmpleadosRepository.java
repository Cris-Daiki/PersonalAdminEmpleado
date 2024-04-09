package com.backend.Empleados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.Empleados.modelo.EmpleadosModelo;

@Repository
public interface EmpleadosRepository extends JpaRepository<EmpleadosModelo, Long>{

}
