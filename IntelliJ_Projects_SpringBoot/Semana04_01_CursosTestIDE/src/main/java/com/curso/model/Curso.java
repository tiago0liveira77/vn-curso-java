package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cursos")
public class Curso {
    @Id
    private int cod_curso;
    private String nombre;
    private int duracion;
    private int precio;

    public Curso() {

    }

    public Curso(int cod_curso, String nombre, int duracion, int precio) {
        this.cod_curso = cod_curso;
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
    }

    public int getCod_curso() {
        return cod_curso;
    }

    public void setCod_curso(int cod_curso) {
        this.cod_curso = cod_curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "cod_curso=" + cod_curso +
                ", nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", precio=" + precio +
                '}';
    }
}
