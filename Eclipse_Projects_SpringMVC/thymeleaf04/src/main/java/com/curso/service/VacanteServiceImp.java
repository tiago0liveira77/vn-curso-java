package com.curso.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.model.Vacante;
@Service
public class VacanteServiceImp implements VacanteService{

	List<Vacante> lista = new LinkedList<Vacante>();
	
	@Override
	public	List<Vacante> getVacantes(){
		// Creamos la oferta de Trabajo 1.
		Vacante vacante1 = new Vacante();
		vacante1.setId(1);
		vacante1.setNombre("Ingeniero "); // Titulo de la vacante
		vacante1.setDescripcion("Solicitamos Ing. caminos para diseñar puente peatonal.");
		vacante1.setSalario(3500.0);
		vacante1.setDestacado(1);
		vacante1.setImagen("empresa1.png");
					
		// Creamos la oferta de Trabajo 2.
		Vacante vacante2 = new Vacante();
		vacante2.setId(2);
		vacante2.setNombre("Contable");
		vacante2.setDescripcion("Empresa multinacional solicita contable con 5 años de experiencia.");
		vacante2.setSalario(2100.0);
		vacante2.setDestacado(0);
		vacante2.setImagen("empresa2.png");
		
		// Creamos la oferta de Trabajo 3.
		Vacante vacante3 = new Vacante();
		vacante3.setId(3);
		vacante3.setNombre("Electricista");
		vacante3.setDescripcion("Empresa solicita electricista para mantenimiento de la instalación eléctrica.");
		vacante3.setSalario(1800.0);
		vacante3.setDestacado(0);
		
		// Creamos la oferta de Trabajo 4.
		Vacante vacante4 = new Vacante();
		vacante4.setId(4);
		vacante4.setNombre("Diseñador Gráfico");
		vacante4.setDescripcion("Solicitamos Diseñador Gráfico titulado para diseñar publicidad de la empresa.");
		vacante4.setSalario(2000.0);
		vacante4.setDestacado(1);
		vacante4.setImagen("empresa3.png");
		
		/**
		 * Agregamos los 4 objetos de tipo Vacante a la lista ...
		 */
		lista.add(vacante1);			
		lista.add(vacante2);
		lista.add(vacante3);
		lista.add(vacante4);

	return lista;
	}

}
