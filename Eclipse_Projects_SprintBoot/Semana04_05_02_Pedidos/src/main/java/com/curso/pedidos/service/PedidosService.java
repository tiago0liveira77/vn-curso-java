package com.curso.pedidos.service;

import java.util.List;

import com.curso.pedidos.model.Pedido;

public interface PedidosService {
	List<Pedido> addPedidos(Pedido pedido);
	List<Pedido> getPedidos();
}
