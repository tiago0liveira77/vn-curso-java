package com.cursojava.cuentaexcepciones;

public class Main {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		Cuenta cuentas[] = new Cuenta[3];
		cuentas[0] = new Cuenta("Tiago", 100, EstadoCuenta.OPERATIVA);
		cuentas[1] = new Cuenta("Tiago", 300, EstadoCuenta.OPERATIVA);
		cuentas[2] = new Cuenta("Tiago", 999, EstadoCuenta.BLOQUEADA);

		for (Cuenta cuenta : cuentas) {
			System.out.println(cuenta.toString());
		}

		//--- Ingreso correcto
		cuentas[0].ingressar(50);
		//--- Retiro correcto
		cuentas[1].retirar(100);
		
		//--- Retiro incorrecto (estaduo cuenta)
		//cuentas[2].retirar(100);
		//--- Saldo insuficiente
		//cuentas[0].retirar(101);
		
		
		try {
			//cuentas[0].retirar(501);
			cuentas[2].retirar(101);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
