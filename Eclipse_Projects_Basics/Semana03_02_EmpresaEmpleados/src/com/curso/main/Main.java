package com.curso.main;

import java.sql.Date;
import java.util.List;

import com.curso.model.Empleado;
import com.curso.service.EmpleadoService;

public class Main {
	
	static EmpleadoService es = new EmpleadoService();
	static List<Empleado> empleados = null;
	
	public static void insertarEmpleado() {
		Date mdate = Date.valueOf("1997-11-22");
		Empleado nuevo = new Empleado(999, "Manel", "Simoes", 400, mdate);
		es.insertar(nuevo);
		empleados = es.select();
	}
	
	public static void borrarEmpleado() {
		if(!empleados.isEmpty()) {
			es.borrar(empleados.get(empleados.size()-1));
		}
		empleados = es.select();
	}
	
	public static void actualizarEmpleado() {
		if(!empleados.isEmpty()) {
			Date mdate = Date.valueOf("1970-01-01");
			Empleado e = empleados.get(empleados.size()-1);
			e.setNombre("Nombre editado");
			e.setApelido("Apelido editado");
			e.setSalario(999);
			e.setFecha_nascimento(mdate);
			es.atualizar(e);
			
		}
	}
	

	public static void main(String[] args) {
	
		//insertarEmpleado();
		
		//borrarEmpleado()
		
		empleados = es.select();
		
		actualizarEmpleado();
		
		empleados = es.select();
		
		for (Empleado e : empleados) {
			System.out.println(e.toString());
		}
		
		
	}

}
