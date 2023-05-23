package com.example.demo.repo;

import com.example.demo.modelo.Ordenes;
import com.example.demo.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrdenes extends JpaRepository<Ordenes,Integer> {
}
