package com.krakedev.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.KrakedevException;
import com.krakedev.utils.ConexionBDD;

public class ClientesBDD {
	
	public void insertar(Cliente client) throws KrakedevException {
		Connection con = null; 
		try {
			con = ConexionBDD.obtenerConexion();
			PreparedStatement ps =con.prepareStatement("insert into clientes(cedula,nombre,numeroHijos)"
					+ "values(?,?,?)");
			ps.setString(1, client.getCedula());
			ps.setString(2, client.getNombre());
			ps.setInt(3, client.getNumeroHijos());
			
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakedevException("Error al insertar el cliente. Detalle: "+e.getMessage());
		} catch (KrakedevException e) {
			throw e;
		}finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void actualizar(Cliente client) throws KrakedevException{
		Connection con = null; 
		try {
			con = ConexionBDD.obtenerConexion();
			PreparedStatement ps =con.prepareStatement("update clientes set nombre=?, numeroHijos=?"
					+ " where cedula=?");
			ps.setString(3, client.getCedula());
			ps.setString(1, client.getNombre());
			ps.setInt(2, client.getNumeroHijos());
			
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakedevException("Error al actualizar el cliente. Detalle: "+e.getMessage());
		} catch (KrakedevException e) {
			throw e;
		}
	}
	
	public ArrayList<Cliente> recuperarTodos() throws KrakedevException{
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Connection con = null; 
		PreparedStatement ps = null;
		ResultSet rs=null;
		Cliente client = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps =con.prepareStatement("select cedula,nombre,numeroHijos from clientes");
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				int numeroHijos = rs.getInt("numeroHijos");
				
				client = new Cliente(cedula,nombre,numeroHijos);
				
				clientes.add(client);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakedevException("Error al consultar. Detalle: "+e.getMessage());
		} catch (KrakedevException e) {
			throw e;
		}
		
		return clientes;
	} 
	
	public Cliente buscarPorPK(String CedulaBusqueda) throws KrakedevException{
		Connection con = null; 
		PreparedStatement ps = null;
		ResultSet rs=null;
		Cliente client = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps =con.prepareStatement("select cedula,nombre,numeroHijos from clientes where cedula = ?");
			ps.setString(1, CedulaBusqueda);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				int numeroHijos = rs.getInt("numeroHijos");
				
				client = new Cliente(cedula,nombre,numeroHijos);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakedevException("Error al consultar. Detalle: "+e.getMessage());
		} catch (KrakedevException e) {
			throw e;
		}
		
		return client;
	} 
	
	
	public ArrayList<Cliente> recuperarNumeroHijo(int numeroHijosBsucar) throws KrakedevException{
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Connection con = null; 
		PreparedStatement ps = null;
		ResultSet rs=null;
		Cliente client = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps =con.prepareStatement("select cedula,nombre,numeroHijos from clientes where numeroHijos >= ?");
			ps.setInt(1, numeroHijosBsucar);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				int numeroHijos = rs.getInt("numeroHijos");
				
				client = new Cliente(cedula,nombre,numeroHijos);
				
				clientes.add(client);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakedevException("Error al consultar. Detalle: "+e.getMessage());
		} catch (KrakedevException e) {
			throw e;
		}
		
		return clientes;
	} 
	
	
}
