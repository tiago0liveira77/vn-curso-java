package com.cursojava.nocoes001;

import java.util.Arrays;

public class Arraysss {

	    /**
	     * @param args
	     */
	    public static void main(String[] args) {

	        
	        int[] miArray1;
	        //int miArray2[];
	        
	        //tipoDeDato[] nombreArray
	        
	        miArray1 = new int[5]; // número de elementos del array, length,        
	        miArray1[1]= 23;
	        
	    //    miArray1[67]= 45; // SOY NEFASTA PROGRAMAND0

	        // HA ocurrido una excepción y controlo que no termine de forma abrupta
	        
	        //MEnsaje amigable al usuario de que no puedo atenderte en este momento
	        
	        
	        // Recorro un array   usando for-each
	        for (int i:miArray1) {
	            System.out.print(i+ " ");
	        }
	        System.out.println();
	        System.out.println("******************uso métodos de java.util.Arrays*****************");
	        int[] miArray2 = {1,4,3,2,5,6};
	        // la Clase java util.Arrays proporciona métodos útiles para trabajar con arrays nativos
	        
	        //imprimir un array
	        
	        System.out.println(Arrays.toString(miArray2));
	        
	        //ordenar un array
	        Arrays.sort(miArray2); 
	        
	        System.out.println(Arrays.toString(miArray2));    
	        
	        System.out.println("Ejemplo binarySearch");
	        
	        
	        //Buscar un elemento en un array
	        int index = Arrays.binarySearch(miArray2,5);  // Muestra 4 porque el 5 está en el índice 4 del array
	        
	        // Comprobar si dos arrays son iguales
	        int[] array1 = {1,4,3,2,5,6};
	        int[] otroArray = {1,4,3,2,5,6};
	        boolean iguales = Arrays.equals(array1, otroArray);
	           System.out.println(iguales);    //Muestra true
	        
	        
	        System.out.println("index = " + index);
	        // Recorro un array usando for
	        
	        final int ELEMENTOS_ARRAY = miArray2.length;
	        for (int i=0; i<ELEMENTOS_ARRAY; i++) {
	            System.out.print(miArray2[i]+ " ");
	        }
	        System.out.println();
	        
	        int primerElemento = miArray1[0];
	                
	        int ultimoElemento = miArray1[miArray1.length-1];    
	        
	        miArray1[miArray1.length-1] = 999;
	        
	        for (int i:miArray1) {
	            System.out.print(i+ " ");
	        }
	        System.out.println();
	        
	    //  Los arrays tienen sus limitaciones ==>  framework Collections
	        
	    }

	}
