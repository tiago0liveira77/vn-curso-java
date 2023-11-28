package com.curso.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.productos.model.Producto;
import com.curso.productos.service.ProductosService;

@RestController
public class ProductosController {
	@Autowired
	ProductosService service;
	
	/**
	 * Obtener todos los productos
	 * @return
	 */
	@GetMapping(value="productos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> getProductos(){
		return service.getProductos();
	}
	
	@GetMapping(value="productos/{codprod}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Producto getProducto(@PathVariable("codprod") int codigoProducto){
		return service.getProducto(codigoProducto);
	}
	
	@GetMapping(value="producto/price/{codprod}", produces = MediaType.APPLICATION_JSON_VALUE)
	public double getProductoPrice(@PathVariable("codprod") int codigoProducto){
		return service.getProductoPrice(codigoProducto);
	}
	
	@GetMapping(value="producto/stock/{codprod}", produces = MediaType.APPLICATION_JSON_VALUE)
	public double getProductoStock(@PathVariable("codprod") int codigoProducto){
		return service.getProductoStock(codigoProducto);
	}
	
	@PostMapping(value="productos", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> addProducto(@RequestBody Producto producto){
		return service.addProductos(producto);
	}
	
	@PutMapping(value="productos", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> updProducto(@RequestBody Producto producto){
		return service.updProductos(producto);
	}
	
	@PutMapping(value="productos/{codprod}/{unidades}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> updProductoRestock(@PathVariable("codprod") int codprod, @PathVariable("unidades") int unidades){
		return service.updProductos(codprod, unidades, true);
	}
	
	@PutMapping(value="productos/pedidos/{codprod}/{unidades}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> updProductoVenda(@PathVariable("codprod") int codprod, @PathVariable("unidades") int unidades){
		return service.updProductos(codprod, unidades, false);
	}
}
