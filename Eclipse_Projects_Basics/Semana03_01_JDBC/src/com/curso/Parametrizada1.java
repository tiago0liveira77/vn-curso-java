package com.curso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Parametrizada1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/bdsemana31";
		String user = "root";
		String pdw = "123qwe";
		String query = "select * from personas where edad<?";
		int valor = 23;

		try (Connection conexion = DriverManager.getConnection(url, user, pdw);
				PreparedStatement preSentencia = conexion.prepareStatement(query)) {
			preSentencia.setInt(1, valor);
			ResultSet rs = preSentencia.executeQuery();
			while (rs.next()) {
				System.out.println("Nombre: " + rs.getString("nombre") + " \t EDAD: " + rs.getInt("edad"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
