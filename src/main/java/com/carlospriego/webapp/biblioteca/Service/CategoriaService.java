package com.carlospriego.webapp.biblioteca.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.carlospriego.webapp.biblioteca.Model.Categoria;
import com.carlospriego.webapp.biblioteca.Repository.CategoriaRepository;

@Service
public class CategoriaService implements ICategoriaService{

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public Categoria buscarcCategoriaPorId(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarCategoria(Categoria categoria) {
    }

    @Override
    public Categoria guardarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public List<Categoria> listarCategoria() {

        return categoriaRepository.findAll();
    }
    
}
