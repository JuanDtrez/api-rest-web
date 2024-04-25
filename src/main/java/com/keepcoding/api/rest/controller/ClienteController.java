package com.keepcoding.api.rest.controller;


import com.keepcoding.api.rest.entity.Cliente;
import com.keepcoding.api.rest.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteService servicio;


    @GetMapping("/clientes")
    public List<Cliente> index(){
        return servicio.buscarTodos();
    }

    @GetMapping("/clientes/{id}")
    public Cliente show(@PathVariable Long id) {
        return servicio.buscarPorId(id);
    }

    @PostMapping("/clientes")
    public Cliente create(@RequestBody Cliente cliente) {
        return servicio.guardar(cliente);

    }

    @PutMapping("/clientes/{id}")
    public Cliente update(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente clienteUpdate = servicio.buscarPorId(id);
        clienteUpdate.setNombre(cliente.getNombre());
        clienteUpdate.setApellido(cliente.getApellido());
        clienteUpdate.setEmail(cliente.getEmail());
        clienteUpdate.setTelefono(cliente.getTelefono());
        clienteUpdate.setCreatedAt(cliente.getCreatedAt());

        return servicio.guardar(clienteUpdate);
    }

    @DeleteMapping("/clientes/{id}")
    public Cliente delete(@PathVariable Long id) {
        return servicio.borrar(id);
    }
}
