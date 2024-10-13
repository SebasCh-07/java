package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;

	
	
	public Banco() {
		clientes = new ArrayList<Cliente>();
		prestamos = new ArrayList<Prestamo>();
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
	public Cliente buscarCliente(String cedula) {
		for(int i = 0; i<clientes.size(); i++) {
			Cliente client = clientes.get(i);
			if (client.getCedula().equals(cedula)) {
				return client;
			}
		}
		return null;
	}
	
	public void registrarCliente(Cliente client) {
		String cedula = client.getCedula();
		Cliente clienteEncontrado = buscarCliente(cedula);
		if(clienteEncontrado == null) {
			clientes.add(client);
			System.out.println("Cliente registrado: "+client.getNombre()+" "+client.getApellido());
		}else {
			System.out.println("Cliente ya existe: "+cedula);
		}
	}
	
	public void asignarPrestamo(String cedula, Prestamo prestamo) {
		Cliente clienteEncontrado = buscarCliente(cedula);
		if(clienteEncontrado != null) {
			CalculadoraAmortizacion.generarTabla(prestamo);
			clienteEncontrado.getPrestamos().add(prestamo);
		}else {
			System.out.println("No es Cliente del Banco");
		}
	}
	
	public ArrayList<Prestamo> buscarPrestamos(String cedula){
		Cliente client = buscarCliente(cedula);
		if (client.getPrestamos() != null) {
			return client.getPrestamos();
		}else {
			return null;
		}
		
	}

}
