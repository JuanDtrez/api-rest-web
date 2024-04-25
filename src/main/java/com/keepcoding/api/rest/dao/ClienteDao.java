package com.keepcoding.api.rest.dao;


import com.keepcoding.api.rest.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteDao extends CrudRepository <Cliente, Long> {

}

