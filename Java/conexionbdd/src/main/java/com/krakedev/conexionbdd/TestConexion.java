package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","sebas.2007");
			System.out.println("conexion exitosa");
			
			ps=connection.prepareStatement("insert into personas(cedula,nombre,apellido,estado_civil_codigo,numero_hijo,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)"
					+ "values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, "1755635495");
			ps.setString(2, "Rosalia");
			ps.setString(3, "Andrade");
			ps.setString(4, "U");
			ps.setInt(5, 2);
			ps.setDouble(6, 1.75);
			ps.setBigDecimal(7, new BigDecimal(1200.45));
			
			SimpleDateFormat sf=new SimpleDateFormat("yyyy/MM/dd hh:m:ss");
			String fechaStr="2020/03/22 10:05:04";
			
			try {
				Date fecha = sf.parse(fechaStr);
				long fechamilis=fecha.getTime();
				java.sql.Date fechaSQL = new java.sql.Date(fechamilis);
				Time timeSQL= new Time(fechamilis);
				
				ps.setDate(8, fechaSQL);
				ps.setTime(9, timeSQL);
				
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
