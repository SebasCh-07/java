package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Producto;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminProductos {
	private static final Logger LOGGER = LogManager.getLogger(AdminProductos.class);

	public static void insertar(Producto producto) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Estudiante a insertar>>>> " + producto);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();

			ps = con.prepareStatement(
					"insert into productos(codigo,nombre,descripcion,precio,stock)"
							+ "values(?,?,?,?,?)");
			ps.setInt(1, producto.getCodigo());
			ps.setString(2, producto.getNombre());
			ps.setString(3, producto.getDescripcion());
			ps.setBigDecimal(4, producto.getPrecio());
			ps.setInt(5, producto.getStock());

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

	public static void actualizar(Producto producto) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Estudiante a actualizar>>>> " + producto);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();

			ps = con.prepareStatement(
					"update productos set nombre=?, descripcion=?, precio=?, stock=? "
					+"where codigo=?");
			ps.setString(1, producto.getNombre());
			ps.setString(2, producto.getDescripcion());
			ps.setBigDecimal(3, producto.getPrecio());
			ps.setInt(4, producto.getStock());

			ps.setInt(5, producto.getCodigo());

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
	
	public static void eliminar(int codigo) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Producto a eliminar con codigo>>>> " + codigo);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("delete from productos where codigo=?");
			ps.setInt(1, codigo);
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
