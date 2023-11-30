package com.curso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/bdsemana31";
		String user = "root";
		String pdw = "123qwe";
		String query = "insert into personas(nombre, edad) " + "values ('Tiago7', 22)";

		try (Connection conexion = DriverManager.getConnection(url, user, pdw);
				Statement sentencias = conexion.createStatement()) {

			sentencias.executeUpdate(query);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
