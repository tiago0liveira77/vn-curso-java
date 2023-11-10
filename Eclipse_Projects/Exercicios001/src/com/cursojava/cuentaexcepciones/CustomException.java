package com.cursojava.cuentaexcepciones;

public class CustomException extends Exception{
	private int codigoError;

	public CustomException(int codigoError) {
		super();
		this.codigoError = codigoError;
	}
	
	@Override
	public String getMessage() {
		String msg = "";
		switch(codigoError) {
			case 1:
				msg = "No tiene saldo suficiente";
				break;
			case 2:
				msg = "Cuantidad Negativa";
				break;
			default: 
				msg = "Unknow Error";
				break;
			
		}
		return msg;
	}
	
	
}
