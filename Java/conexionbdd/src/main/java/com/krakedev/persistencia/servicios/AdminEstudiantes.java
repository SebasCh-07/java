package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Estudiantes;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminEstudiantes {
	private static final Logger LOGGER = LogManager.getLogger(AdminEstudiantes.class);

	public static void insertar(Estudiantes estudiante) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Estudiante a insertar>>>> " + estudiante);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();

			ps = con.prepareStatement(
					"insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor,edad)"
							+ "values(?,?,?,?,?,?,?)");
			ps.setString(1, estudiante.getCedula());
			ps.setString(2, estudiante.getNombre());
			ps.setString(3, estudiante.getApellido());
			ps.setString(4, estudiante.getEmail());
			ps.setDate(5, new java.sql.Date(estudiante.getFecha_nacimiento().getTime()));
			ps.setDouble(6, estudiante.getCodigo_profesor().getCodigo());
			ps.setInt(7, estudiante.getEdad());

			ps.executeUpdate();

		} catch (Exception e) {
			// loggear el error
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error de Infraestructura", e);
				throw new Exception("Error de Infraestructura");
			}
		}
	}

	public static void actualizar(Estudiantes estudiante) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Estudiante a actualizar>>>> " + estudiante);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();

			ps = con.prepareStatement(
					"update estudiantes set nombre=?, apellido=?, email=?, fecha_nacimiento=?, codigo_profesor=?, edad=? "
					+"where cedula=?");
			ps.setString(1, estudiante.getNombre());
			ps.setString(2, estudiante.getApellido());
			ps.setString(3, estudiante.getEmail());
			ps.setDate(4, new java.sql.Date(estudiante.getFecha_nacimiento().getTime()));
			ps.setDouble(5, estudiante.getCodigo_profesor().getCodigo());
			ps.setInt(6, estudiante.getEdad());
			ps.setString(7, estudiante.getCedula());

			ps.executeUpdate();

		} catch (Exception e) {
			// loggear el error
			LOGGER.error("Error al actualizar", e);
			throw new Exception("Error al actualizar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error de Infraestructura", e);
				throw new Exception("Error de Infraestructura");
			}
		}
	}
	
	public static void eliminar(String cedula) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Estudiante a Eliminar a la persona con cedula>>>> " + cedula);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("delete from estudiantes where cedula=?");
			ps.setString(1, cedula);
			ps.executeUpdate();

		} catch (Exception e) {
			// loggear el error
			LOGGER.error("Error al eliminar", e);
			throw new Exception("Error al eliminar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error de Infraestructura", e);
				throw new Exception("Error de Infraestructura");
			}
		}
	}
}
