package com.progII.clase01.repository;

import com.progII.clase01.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    // No additional methods needed; JpaRepository provides basic CRUD operations
}
