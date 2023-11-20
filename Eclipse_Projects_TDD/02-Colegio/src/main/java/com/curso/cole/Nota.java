package com.curso.cole;

import java.util.Objects;

public class Nota {
	private double valor;
	private String asignatura;
	
	public Nota() {
		super();

	}
	
	public Nota(double valor, String asignatura) {
		super();
		this.valor = valor;
		this.asignatura = asignatura;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(asignatura, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nota other = (Nota) obj;
		return Objects.equals(asignatura, other.asignatura)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

	public boolean esMismaAsignatura(Nota otra) {
		if(this.getAsignatura().equals(otra.getAsignatura()))
			return true;
		return false;
	}
	
	public boolean esMayor(Nota otra) {
		if(this.esMismaAsignatura(otra)) {
			if(this.getValor() > otra.getValor())
				return true;
			else 
				return false;
		} 
		throw new RuntimeException("Diferentes Asignaturas");
	}
	
	public Tipo getTipo() {
		if(getValor()>=0 && getValor()<3) {
			return Tipo.FRACO;
		} else if(getValor()>=3 && getValor()<5) {
			return Tipo.INSUFICIENTE;
		} else if(getValor()>=5 && getValor()<6) {
			return Tipo.SUFICIENTE;
		} else if(getValor()>=6 && getValor()<8) {
			return Tipo.BOM;
		} else if(getValor()>=8 && getValor()<10) {
			return Tipo.MUITOBOM;
		} else if(getValor()==10) {
			return Tipo.PERFECTO;
		}
		return Tipo.INVALID;
	} 
	
	
}
