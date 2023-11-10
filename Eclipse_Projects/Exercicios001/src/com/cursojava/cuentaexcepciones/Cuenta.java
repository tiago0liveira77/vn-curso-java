package com.cursojava.cuentaexcepciones;

public class Cuenta {
	private String titular;
	private double saldo;
	private EstadoCuenta estado;
	
	public Cuenta(String titular, double saldo, EstadoCuenta estado) {
		super();
		this.titular = titular;
		this.saldo = saldo;
		this.estado = estado;
	}

	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public EstadoCuenta getEstadoCuenta() {
		return estado;
	}
	public void setEstadoCuenta(EstadoCuenta estadoP) {
		this.estado = estadoP;
	}
	
	public void ingressar(double value) {
		if (value < 0)
			throw new IllegalArgumentException("Cantidad negativa");
		if (estado != EstadoCuenta.OPERATIVA)
			throw new IllegalStateException("Estado de Cuenta Incorrecto");
		
		saldo += value;
		System.out.println("Ingresso correcto de: +" + value);
		System.out.println(this.toString());
	}
	
	public void retirar(double value) throws CustomException {
		if (value < 0)
			throw new IllegalArgumentException("Cantidad negativa");
		if (estado != EstadoCuenta.OPERATIVA)
			throw new IllegalStateException("Estado de Cuenta Incorrecto");
		if (value > saldo)
			throw new CustomException(1);
		
		saldo -= value;
		System.out.println("Retiro correcto de: -"+value);
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", saldo=" + saldo + ", estado=" + estado + "]";
	}
	
	
	
	
	
}
