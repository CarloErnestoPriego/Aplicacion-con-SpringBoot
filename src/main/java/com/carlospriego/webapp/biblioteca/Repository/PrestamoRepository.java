package com.carlospriego.webapp.biblioteca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlospriego.webapp.biblioteca.Model.Prestamo;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long>{

}
