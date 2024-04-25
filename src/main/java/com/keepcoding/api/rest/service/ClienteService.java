package com.keepcoding.api.rest.service;

import com.keepcoding.api.rest.entity.Cliente;

import java.util.List;

public interface ClienteService {
    // metodo para devolver todos los registros
    public List<Cliente> buscarTodos();
    // metodo para buscar un registro por id
    public Cliente buscarPorId(Long id);
    // metodo para registro
    public Cliente guardar(Cliente cliente);
    // metodo para eliminar
    public Cliente borrar(Long id);
}
