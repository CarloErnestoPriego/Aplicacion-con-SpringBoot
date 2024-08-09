package com.carlospriego.webapp.biblioteca.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlospriego.webapp.biblioteca.Model.Cliente;
import com.carlospriego.webapp.biblioteca.Repository.ClienteRepository;

@Service
public class ClienteService implements IClienteService{
    
    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public Cliente buscarClientePorId(Long nit){
        return clienteRepository.findById(nit).orElse(null);
    }

    @Override
    public void eliminarCliente(Cliente cliente){

    }

    @Override
    public Cliente guardarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> listarCliente(){
        return clienteRepository.findAll();
    }
}
