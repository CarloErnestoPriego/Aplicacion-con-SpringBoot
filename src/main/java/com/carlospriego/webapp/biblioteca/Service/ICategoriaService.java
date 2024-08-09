package com.carlospriego.webapp.biblioteca.Service;

import java.util.List;

import com.carlospriego.webapp.biblioteca.Model.Categoria;

public interface ICategoriaService {

    public List<Categoria> listarCategoria();

    public Categoria guardarCategoria(Categoria categoria);

    public Categoria buscarCategoriaPorId(Long id);

    public void eliminarCategoria(Categoria categoria);
}
