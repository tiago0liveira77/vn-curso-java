package com.cursojava.nocoes;

public class Primitivos {

	public static void main(String[] args) {
		/* PRIMITIVOS
		 * byte [-128 ; 127] = 1 byte = 8 bits
		 * short [-32.768 ; 32.767] = 2 byte = 16 bits
		 * int [-2.147.483.648 ; 2.147.483.647] = 4 byte = 32 bits
		 * long [-9.223.372.036.854.776.808 ; 9.223.372.036.854.776.807] = 8 byte = 64 bits
		 * 
		 * float   4 bytes
		 * double  8 bytes
		 * 
		 * char    2 bytes
		 * boolean 1 byte
		 * 
		 * 
		 * */
		
		byte maxByte = Byte.MAX_VALUE;
		short maxShort = Short.MAX_VALUE;
		int maxInt = Integer.MAX_VALUE;
		long maxLong = Long.MAX_VALUE;
		
		float maxFloat = Float.MAX_VALUE;
		double maxDouble = Double.MAX_VALUE;
		
		System.out.println(maxByte);
		System.out.println(maxShort);
		System.out.println(maxInt);
		System.out.println(maxLong);
		
		System.out.println(maxFloat);
		System.out.println(maxDouble);
		
		
	}

}
