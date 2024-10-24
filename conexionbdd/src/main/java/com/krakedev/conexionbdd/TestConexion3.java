package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestConexion3 {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","sebas.2007");
			System.out.println("conexion exitosa");
			
			ps=connection.prepareStatement("insert into productos(codigo,nombre,descripcion,precio,stock)"
					+ "values(?,?,?,?,?)");
			
			ps.setInt(1, 21);
			ps.setString(2, "Borrador");
			ps.setString(3, "borrador de goma para lápiz");
			ps.setBigDecimal(4, new BigDecimal(3.5));
			ps.setInt(5, 12);
			
			
			ps.executeUpdate();
			System.out.println("Ejecuta insert");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
