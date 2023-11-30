package com.curso.productos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.productos.model.Producto;

public interface ProductosDAO extends JpaRepository<Producto, Integer>{

}
