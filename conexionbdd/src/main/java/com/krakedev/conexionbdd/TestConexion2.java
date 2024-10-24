package com.krakedev.conexionbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion2 {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","sebas.2007");
			System.out.println("conexion exitosa");
			
			ps=connection.prepareStatement("insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor,edad)"+
					"values(?,?,?,?,?,?,?)");
			
			ps.setString(1, "6543219875");
			ps.setString(2, "Juan");
			ps.setString(3, "Flores");
			ps.setString(4, "Juanf@gmail.com");
			
			SimpleDateFormat sf=new SimpleDateFormat("yyyy/MM/dd");
			String fechaStr="2007/03/11";
			
			try {
				Date fecha = sf.parse(fechaStr);
				long fechamilis=fecha.getTime();
				java.sql.Date fechaSQL = new java.sql.Date(fechamilis);
				
				ps.setDate(5, fechaSQL);
				ps.setInt(6, 24);
				ps.setInt(7, 17);
				
				ps.executeUpdate();
				System.out.println("Ejecuta insert");
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
