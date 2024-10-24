package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.EstadoCivil;
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
							+ "where cedula=?");
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

	public static ArrayList<Persona> buscarPorNombre(String nombreBusqueda) throws Exception {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("select * from personas where nombre like ?");
			ps.setString(1, "%" + nombreBusqueda + "%");

			rs = ps.executeQuery();

			while (rs.next()) {
				String nombre = rs.getString("nombre");
				String cedula = rs.getString("cedula");
				String apellido = rs.getString("apellido");
				int estatura = rs.getInt("estatura");
				Date fecha = rs.getDate("fecha_nacimiento");
				Time hora = rs.getTime("hora_nacimiento");
				String cantidadAhorroString = rs.getString("cantidad_ahorrada").replace("$", "").replace(".", "").replace(",", "."); 
				BigDecimal cantidadAhorrada = new BigDecimal(cantidadAhorroString);
				int NumeroHijo = rs.getInt("numero_hijo");
				String estadoCivil = rs.getString("Estado_civil_codigo");
				ps = con.prepareStatement("select * from estado_civil where codigo = ?");
				ps.setString(1, estadoCivil);
				rs = ps.executeQuery();
				EstadoCivil ec = new EstadoCivil();

				while (rs.next()) {
					String codigo = rs.getString("codigo");
					String descripcion = rs.getString("descripcion");
					ec.setCodigo(codigo);
					ec.setDescripcion(descripcion);
				}

				Persona p = new Persona();
				p.setCedula(cedula);
				p.setNombre(nombre);
				p.setApellido(apellido);
				p.setEstatura(estatura);
				p.setFechaNacimiento(fecha);
				p.setHoraNacimiento(hora);
				p.setCantidadAhorrada(cantidadAhorrada);
				p.setNumeroHijos(NumeroHijo);
				p.setEstadoCivil(ec);
				personas.add(p);
			}

		} catch (Exception e) {
			LOGGER.error("Error al consultar por nombre", e);
			throw new Exception("Error al consultar por nombre");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error de Infraestructura", e);
				throw new Exception("Error de Infraestructura");
			}
		}
		return personas;
	}

	public static Persona buscarPorCedula(String cedula) throws Exception {
		Persona personas = new Persona();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("select * from personas where cedula = ?");
			ps.setString(1, cedula);

			rs = ps.executeQuery();

			if (rs.next()) {
				String nombre = rs.getString("nombre");
				String ced = rs.getString("cedula");
				String apellido = rs.getString("apellido");
				int estatura = rs.getInt("estatura");
				Date fecha = rs.getDate("fecha_nacimiento");
				Time hora = rs.getTime("hora_nacimiento");
				String cantidadAhorroString = rs.getString("cantidad_ahorrada").replace("$", "").replace(".", "").replace(",", "."); 
				BigDecimal cantidadAhorrada = new BigDecimal(cantidadAhorroString);
				int NumeroHijo = rs.getInt("numero_hijo");
				String estadoCivil = rs.getString("Estado_civil_codigo");
				ps = con.prepareStatement("select * from estado_civil where codigo = ?");
				ps.setString(1, estadoCivil);
				rs = ps.executeQuery();
				EstadoCivil ec = new EstadoCivil();

				while (rs.next()) {
					String codigo = rs.getString("codigo");
					String descripcion = rs.getString("descripcion");
					ec.setCodigo(codigo);
					ec.setDescripcion(descripcion);
				}

				personas.setCedula(ced);
				personas.setNombre(nombre);
				personas.setApellido(apellido);
				personas.setEstatura(estatura);
				personas.setFechaNacimiento(fecha);
				personas.setHoraNacimiento(hora);
				personas.setCantidadAhorrada(cantidadAhorrada);
				personas.setNumeroHijos(NumeroHijo);
				personas.setEstadoCivil(ec);
			}

		} catch (Exception e) {
			LOGGER.error("Error al consultar por nombre", e);
			throw new Exception("Error al consultar por nombre");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error de Infraestructura", e);
				throw new Exception("Error de Infraestructura");
			}
		}
		return personas;
	}
}
