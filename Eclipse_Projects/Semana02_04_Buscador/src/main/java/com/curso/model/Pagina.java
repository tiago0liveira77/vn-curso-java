package com.curso.model;

public class Pagina {
	 private String direccion;
     private String tematica;
     private String descripcion;
     
     // constructor
     public Pagina(String direccion, String tematica, String descripcion) {
             super();
             this.direccion = direccion;
             this.tematica = tematica;
             this.descripcion = descripcion;
     }
     
     // getter y setter
     public String getDireccion() {
             return direccion;
     }

     public void setDireccion(String direccion) {
             this.direccion = direccion;
     }

     public String getTematica() {
             return tematica;
     }

     public void setTematica(String tematica) {
             this.tematica = tematica;
     }

     public String getDescripcion() {
             return descripcion;
     }

     public void setDescripcion(String descripcion) {
             this.descripcion = descripcion;
     }
}
