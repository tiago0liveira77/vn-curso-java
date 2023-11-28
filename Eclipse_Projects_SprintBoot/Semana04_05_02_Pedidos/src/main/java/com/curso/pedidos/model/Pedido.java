package com.curso.pedidos.model;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pedidos")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPedido;
	
	//@ManyToOne
    //@JoinColumn(name = "codigoProducto", referencedColumnName = "codigoProducto")
	//private ProductoDTO codigoProducto;
	
	private int codigoProducto;
	
	private int unidades;
	private double total;
	private LocalDateTime fechaPedido;
	
	public Pedido() {
		super();
	}

	public Pedido(int idPedido, int codigoProducto, int unidades, double total, LocalDateTime fechaPedido) {
		super();
		this.idPedido = idPedido;
		this.codigoProducto = codigoProducto;
		this.unidades = unidades;
		this.total = total;
		this.fechaPedido = fechaPedido;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public LocalDateTime getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(LocalDateTime fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	
	
	
}
