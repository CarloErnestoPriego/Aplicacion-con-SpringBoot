package com.carlospriego.webapp.biblioteca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlospriego.webapp.biblioteca.Model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
