package com.cursojava.threads;

import java.util.concurrent.Callable;

public class ContadorCallable implements Callable<Integer> {

    private int contador;
    private int retardo;
    private int valor;

    /**
     * Constructor de la clase ContadorRunnable.
     *
     * @param retardo tiempo de retardo
     * @param valor   valor máximo del contador
     */
    public ContadorCallable(int retardo, int valor) {
        this.contador = 0;
        this.retardo = retardo;
        this.valor = valor;
    }
	@Override
	public Integer call() throws Exception {
		 while (contador < valor) {
	            contador++;

	            try {
	                Thread.sleep(retardo);

	            } catch (InterruptedException ex) {
	                System.err.println("Error al parar el hilo");
	                System.out.println("Exception HILO" + Thread.currentThread().getName());
	                Thread.currentThread().interrupt(); // Buena práctica reinterrumpir el hilo

	            } finally {
	                System.out.println("Estoy en el HILO: ---------------"
	                        + Thread.currentThread().getName()
	                        + " ------------------" + contador);
	                Thread.currentThread().getName();
	            }
	            
	        }
	        return contador;
	    }

	}