package com.curso.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.curso.model.Empleado;

public class EmpleadoService {
	String url = "jdbc:mysql://localhost:3306/seman03_ex1_empresa";
	String user = "root";
	String pdw = "123qwe";

	public void insertar(Empleado empleado) {
		String query = "INSERT INTO empleados(nombre, apelido, salario, fecha_nascimento) VALUES (?, ?, ?, ?)";
		try ( Connection conexion = DriverManager.getConnection(url, user, pdw);
			PreparedStatement preSentencia = conexion.prepareStatement(query)){
			
			preSentencia.setString(1, empleado.getNombre());
			preSentencia.setString(2, empleado.getApelido());
			preSentencia.setDouble(3, empleado.getSalario());
			preSentencia.setDate(4, empleado.getFecha_nascimento());
			preSentencia.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void borrar(Empleado empleado) {
		String query = "DELETE FROM empleados where id = ?";
		try ( Connection conexion = DriverManager.getConnection(url, user, pdw);
			PreparedStatement preSentencia = conexion.prepareStatement(query)){
			preSentencia.setInt(1, empleado.getId());
			preSentencia.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Empleado> select() {
		List<Empleado> empleados = new ArrayList<>();
		String query = "select * from empleados";
		try {
			Connection conexion = DriverManager.getConnection(url, user, pdw);
			PreparedStatement preSentencia = conexion.prepareStatement(query);
			ResultSet rs = preSentencia.executeQuery();
			while (rs.next()) {
				Empleado empleado = new Empleado();
				empleado.setId(rs.getInt("id"));
				empleado.setNombre(rs.getString("nombre"));
				empleado.setApelido(rs.getString("apelido"));
				empleado.setSalario(rs.getDouble("salario"));
				empleado.setFecha_nascimento(rs.getDate("fecha_nascimento")); 
				empleados.add(empleado);
			}
			return empleados;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empleados;
	}
	
	public void atualizar(Empleado empleado) {
		String query = "UPDATE empleados set nombre = ?, apelido = ?, salario = ?, fecha_nascimento = ? where id = ?";
		try ( Connection conexion = DriverManager.getConnection(url, user, pdw);
			PreparedStatement preSentencia = conexion.prepareStatement(query)){
			
			preSentencia.setString(1, empleado.getNombre());
			preSentencia.setString(2, empleado.getApelido());
			preSentencia.setDouble(3, empleado.getSalario());
			preSentencia.setDate(4, empleado.getFecha_nascimento());
			preSentencia.setInt(5, empleado.getId());
			preSentencia.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<String> selectNombres() {
		List<String> empleadosNombre = new ArrayList<>();
		String query = "select * from empleados";
		try {
			Connection conexion = DriverManager.getConnection(url, user, pdw);
			PreparedStatement preSentencia = conexion.prepareStatement(query);
			ResultSet rs = preSentencia.executeQuery();
			while (rs.next()) {
				empleadosNombre.add(rs.getString("nombre"));
			}
			return empleadosNombre;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empleadosNombre;
	}
	
	public List<Double> selectSalario() {
		List<Double> empleadosSalario = new ArrayList<>();
		String query = "select * from empleados";
		try {
			Connection conexion = DriverManager.getConnection(url, user, pdw);
			PreparedStatement preSentencia = conexion.prepareStatement(query);
			ResultSet rs = preSentencia.executeQuery();
			while (rs.next()) {
				empleadosSalario.add(rs.getDouble("salario"));
			}
			return empleadosSalario;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empleadosSalario;
	}
	
}
