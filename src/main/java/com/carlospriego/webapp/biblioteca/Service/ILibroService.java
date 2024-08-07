package com.carlospriego.webapp.biblioteca.Service;

import java.util.List;

import com.carlospriego.webapp.biblioteca.Model.Libro;

public interface ILibroService {
    public List<Libro> listarLibro();
    
    public Libro buscarLibroPorId(Long id);

    public Libro guardarLibro(Libro libro);

    public void eliminarLibro(Libro libro);
}
