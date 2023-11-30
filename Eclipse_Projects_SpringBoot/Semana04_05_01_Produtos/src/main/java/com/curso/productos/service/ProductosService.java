package com.curso.productos.service;

import java.util.List;

import com.curso.productos.model.Producto;

public interface ProductosService {
	List<Producto> getProductos();
	Producto getProducto(int codigoProducto);
	double getProductoPrice(int codigoProducto);
	int getProductoStock(int codigoProducto);
	List<Producto> addProductos(Producto producto);
	List<Producto> updProductos(Producto producto);
	List<Producto> updProductos(int codigoProducto, int unidades, boolean operation);
}
