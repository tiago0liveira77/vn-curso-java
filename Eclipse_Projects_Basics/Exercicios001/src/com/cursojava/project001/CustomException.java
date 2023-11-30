package com.cursojava.project001;

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
				msg = "Cuantidad negativa";
				break;
			case 2:
				msg = "Stock insuficiente";
				break;
			default: 
				msg = "Unknow Error";
				break;
			
		}
		return msg;
	}
}
