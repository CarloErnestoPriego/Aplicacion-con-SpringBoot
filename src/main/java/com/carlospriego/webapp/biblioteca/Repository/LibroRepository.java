package com.carlospriego.webapp.biblioteca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlospriego.webapp.biblioteca.Model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long>{

}
