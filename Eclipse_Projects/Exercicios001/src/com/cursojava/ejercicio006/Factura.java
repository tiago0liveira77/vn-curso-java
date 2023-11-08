package com.cursojava.ejercicio006;

public class Factura implements Imprimible{
	int nFactura;
	int codCli;
		
	public Factura(int nFactura, int codCli) {
		super();
		this.nFactura = nFactura;
		this.codCli = codCli;
	}
	@Override
	public void informeLargo() {
		System.out.println("NFatura " + this.nFactura + " CodCli + " + this.codCli);
	}
	@Override
	public void informeCorto() {
		System.out.println("NFatura " + this.nFactura);
	}
	
	
}
