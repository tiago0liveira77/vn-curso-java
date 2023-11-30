package com.curso.productos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoProducto;
	private String producto;
	private double precioUnitaro;
	private int stock;

	public Producto() {
		super();
	}

	public Producto(int codigoProducto, String producto, double precioUnitaro, int stock) {
		super();
		this.codigoProducto = codigoProducto;
		this.producto = producto;
		this.precioUnitaro = precioUnitaro;
		this.stock = stock;
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getPrecioUnitaro() {
		return precioUnitaro;
	}

	public void setPrecioUnitaro(double precioUnitaro) {
		this.precioUnitaro = precioUnitaro;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
