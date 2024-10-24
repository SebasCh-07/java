package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar>>>> " + persona);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();

			ps = con.prepareStatement(
					"insert into personas(cedula,nombre,apellido,estado_civil_codigo,numero_hijo,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)"
							+ "values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setInt(5, persona.getNumeroHijos());
			ps.setDouble(6, persona.getEstatura());
			ps.setBigDecimal(7, persona.getCantidadAhorrada());

			ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));

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

	public static void actualizar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a Actualizar>>>> " + persona);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();

			ps = con.prepareStatement(
					"update personas set nombre=?, apellido=?, estado_civil_codigo=?, numero_hijo=?, estatura=?, cantidad_ahorrada=?, fecha_nacimiento=?, hora_nacimiento=? "
					+"where cedula=?");
			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setString(3, persona.getEstadoCivil().getCodigo());
			ps.setInt(4, persona.getNumeroHijos());
			ps.setDouble(5, persona.getEstatura());
			ps.setBigDecimal(6, persona.getCantidadAhorrada());

			ps.setDate(7, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(8, new Time(persona.getHoraNacimiento().getTime()));

			ps.setString(9, persona.getCedula());
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
		LOGGER.trace("Persona a Eliminar a la persona con cedula>>>> " + cedula);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("delete from personas where cedula=?");
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
