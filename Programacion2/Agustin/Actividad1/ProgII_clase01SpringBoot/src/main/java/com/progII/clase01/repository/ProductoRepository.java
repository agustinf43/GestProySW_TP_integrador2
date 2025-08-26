package com.progII.clase01.repository;

import com.progII.clase01.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository  extends JpaRepository<Producto, Integer> {
    // No additional methods needed; JpaRepository provides basic CRUD operations
}
