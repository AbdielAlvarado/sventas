package com.sventas.sventas.repository;

import com.sventas.sventas.model.Cliente;

import java.util.Optional;

public interface IClienteRepository {
    Cliente save(Cliente cliente);

    Optional<Cliente> findById(Integer id);
}
