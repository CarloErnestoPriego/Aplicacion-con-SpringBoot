package com.carlospriego.webapp.biblioteca.Service;

import java.util.List;

import com.carlospriego.webapp.biblioteca.Model.Prestamo;

public interface IPrestamoService {

    public List<Prestamo> listarPrestamos();

    public Prestamo buscarPrestamoPorId(Long id);

    public Prestamo guardarPrestamo(Prestamo prestamo);

    public void eliminarPrestamo(Prestamo prestamo);
}
