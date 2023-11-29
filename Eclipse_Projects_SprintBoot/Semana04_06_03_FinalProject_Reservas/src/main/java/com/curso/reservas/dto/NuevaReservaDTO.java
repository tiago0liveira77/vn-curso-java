package com.curso.reservas.dto;

public class NuevaReservaDTO {
	private int idVuelo;
	private int idHotel;
	private String cliente;
	private String dni;
	private int personas;

	public NuevaReservaDTO() {
		super();
	}

	public NuevaReservaDTO(int idVuelo, int idHotel, String cliente, String dni, int personas) {
		super();
		this.idVuelo = idVuelo;
		this.idHotel = idHotel;
		this.cliente = cliente;
		this.dni = dni;
		this.personas = personas;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getPersonas() {
		return personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas;
	}

}
