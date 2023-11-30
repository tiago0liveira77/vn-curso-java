package com.cursojava.nocoes002;

public class Casa {

        public static final int MAX_NUMERO_PLANTAS =3;
        //la referencia catastral es final, lo que significa que una vez que se le
        // asigna un valor, no puede ser cambiado
        private final String referenciaCatastral;
        private String direccion;
        private int numeroPlantas;
        //En el constructor de Casa se tiene que asisgnar impepinablemente la referenciaCatastral
        public Casa(String referenciaCatastral, String direccion, int numeroPlantas) {
                super();
                this.referenciaCatastral = referenciaCatastral;
                this.setDireccion(direccion);
                this.setNumeroPlantas(numeroPlantas);
        }
        public String getReferenciaCatastral() {
                return referenciaCatastral;
        }
        public String getDireccion() {
                return direccion;
        }
        public void setDireccion(String direccion) {
                this.direccion = direccion;
        }
        public int getNumeroPlantas() {
                return numeroPlantas;
        }
        public void setNumeroPlantas(int numeroPlantas) {
                if (numeroPlantas > MAX_NUMERO_PLANTAS) {
                        System.err.println("No se puede asignar un número de plantas mayor que "+ MAX_NUMERO_PLANTAS);
                        throw new IllegalArgumentException("Numero de plantas excede del máximo permitido");
                }
                this.numeroPlantas = numeroPlantas;
        }
        public static int getMaxNumeroPlantas() {
                return MAX_NUMERO_PLANTAS;
        }

        public static void main(String[] args) {
                Casa casa = new Casa("1234457AB","mi dirección",22);
                
        }        
        
}