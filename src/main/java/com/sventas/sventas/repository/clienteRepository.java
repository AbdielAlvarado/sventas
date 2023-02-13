package com.sventas.sventas.repository;

import com.sventas.sventas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clienteRepository extends JpaRepository<Cliente, Integer> {
}
