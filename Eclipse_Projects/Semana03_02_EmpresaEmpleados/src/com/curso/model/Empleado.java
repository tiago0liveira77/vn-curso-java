package com.curso.model;

import java.sql.Date;

public class Empleado {
	int id;
	String nombre;
	String apelido;
	double salario;
	Date fecha_nascimento;
	
	public Empleado() {
		super();
	}

	public Empleado(int id, String nombre, String apelido, double salario, Date fecha_nascimento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apelido = apelido;
		this.salario = salario;
		this.fecha_nascimento = fecha_nascimento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getFecha_nascimento() {
		return fecha_nascimento;
	}

	public void setFecha_nascimento(Date fecha_nascimento) {
		this.fecha_nascimento = fecha_nascimento;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apelido=" + apelido + ", salario=" + salario
				+ ", fecha_nascimento=" + fecha_nascimento + "]";
	}	
	
	
}
