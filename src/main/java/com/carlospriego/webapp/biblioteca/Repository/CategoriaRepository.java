package com.carlospriego.webapp.biblioteca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlospriego.webapp.biblioteca.Model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long>{

}
