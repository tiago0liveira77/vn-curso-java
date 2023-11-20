package com.curso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Seleccionar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/bdsemana31";
		String user = "root";
		String pdw = "123qwe";
		String query = "select * from personas";

		try (Connection conexion = DriverManager.getConnection(url, user, pdw);
				Statement sentencias = conexion.createStatement();
				ResultSet rs = sentencias.executeQuery(query);
				) {			
				while(rs.next()) {
					System.out.println("Nombre: " + rs.getString("nombre") + " \t EDAD: " + rs.getInt("edad"));
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
