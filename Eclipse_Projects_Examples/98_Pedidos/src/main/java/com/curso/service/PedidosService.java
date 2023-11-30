package com.curso.service;

import java.util.List;

import com.curso.model.Pedido;

public interface PedidosService {
	List<Pedido> pedidos();
	
	//Recibe el objeto Pedido y lo da de alta.
	//Este objeto pedido será proporcionado por el controller
	//No estara completo porque solo traera el codigo de producto y las unidades
	//En la implementacion tendremos que calcular el coste total a partir de las unidades	
	// y la fecha
	void altaPedido(Pedido pedido);
}
