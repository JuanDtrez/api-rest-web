package com.keepcoding.api.rest.service;

import com.keepcoding.api.rest.dao.ClienteDao;
import com.keepcoding.api.rest.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServiceImpl  implements ClienteService{

    @Autowired
    private ClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> buscarTodos() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente buscarPorId(Long id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Cliente guardar(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public Cliente borrar(Long id) {
        Cliente clienteBorrado = clienteDao.findById(id).orElse(null);
        clienteDao.deleteById(id);
        return clienteBorrado;
    }
}
