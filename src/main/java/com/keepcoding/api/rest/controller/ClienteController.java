package com.keepcoding.api.rest.controller;


import com.keepcoding.api.rest.entity.Cliente;
import com.keepcoding.api.rest.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
