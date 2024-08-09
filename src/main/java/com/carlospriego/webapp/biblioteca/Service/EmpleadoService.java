package com.carlospriego.webapp.biblioteca.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlospriego.webapp.biblioteca.Model.Empleado;
import com.carlospriego.webapp.biblioteca.Repository.EmpleadoRepository;

@Service
public class EmpleadoService implements IEmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    @Override
    public Empleado buscarEmpleadoPorId(Long nit){
        return empleadoRepository.findById(nit).orElse(null);
    }

    @Override
    public void eliminarEmpleado(Empleado empleado){

    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll();
    }
}
