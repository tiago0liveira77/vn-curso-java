package com.curso.service;

import java.util.List;

import com.curso.model.Producto;

public interface ProductosService {
	
	List<Producto> getAll();
	double getPrice(int codigoProducto);
	void actualizarStock(int codigoProducto,int unidades);

	
}
