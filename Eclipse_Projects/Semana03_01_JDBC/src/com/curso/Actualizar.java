package com.curso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Actualizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/bdsemana31";
		String user = "root";
		String pdw = "123qwe";
		String query = "update personas set nombre = 'Tiago777' where nombre='Tiago7'";

		try (Connection conexion = DriverManager.getConnection(url, user, pdw);
				Statement sentencias = conexion.createStatement();) {
			if (sentencias.executeUpdate(query) > 0) {
				System.out.println("Registo atualizado");
			} else {
				System.out.println("nada atualizado");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
