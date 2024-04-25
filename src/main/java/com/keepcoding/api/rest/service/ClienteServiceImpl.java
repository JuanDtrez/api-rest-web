package com.keepcoding.api.rest.service;

import com.keepcoding.api.rest.dao.ClienteDao;
import com.keepcoding.api.rest.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl  implements ClienteService{

    private ClienteDao clienteDao;

    @Override
    public List<Cliente> buscarTodos() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public Cliente guardar(Cliente cliente) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
