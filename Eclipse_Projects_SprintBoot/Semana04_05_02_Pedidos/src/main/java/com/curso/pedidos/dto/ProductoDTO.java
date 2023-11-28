package com.curso.pedidos.dto;

public class ProductoDTO {
	private int codigoProducto;
	private String producto;
	private double precioUnitaro;
	private int stock;
	
	public ProductoDTO() {
		super();
	}

	public ProductoDTO(int codigoProducto, String producto, double precioUnitaro, int stock) {
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


