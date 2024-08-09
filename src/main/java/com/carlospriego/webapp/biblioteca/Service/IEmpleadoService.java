package com.carlospriego.webapp.biblioteca.Service;

import java.util.List;

import com.carlospriego.webapp.biblioteca.Model.Empleado;

public interface IEmpleadoService {
    
    public List<Empleado> listarEmpleados();

    public Empleado guardarEmpleado(Empleado empleado);

    public Empleado buscarEmpleadoPorId(Long nit);

    public void eliminarEmpleado(Empleado empleado);    
}
