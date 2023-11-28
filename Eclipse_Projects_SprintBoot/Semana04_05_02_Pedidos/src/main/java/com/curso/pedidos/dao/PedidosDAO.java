package com.curso.pedidos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.pedidos.model.Pedido;

public interface PedidosDAO extends JpaRepository<Pedido, Integer>{

}
