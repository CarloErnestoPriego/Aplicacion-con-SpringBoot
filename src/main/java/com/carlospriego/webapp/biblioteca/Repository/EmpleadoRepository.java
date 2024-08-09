package com.carlospriego.webapp.biblioteca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlospriego.webapp.biblioteca.Model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{

}
