package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		telefonos = new ArrayList<Telefono>();
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void imprimir() {
		System.out.println("***" + nombre + " " + apellido + "***");
		if (direccion != null) {
			System.out.println("Direccion: " + direccion.getCallePrincipal() + " y " + direccion.getCalleSecundaria());
		} else {
			System.out.println("No tiene asociada una dirección");
		}
	}

	public void agregarTelefono(Telefono telf) {
		telefonos.add(telf);
	}

	public void mostrarTelefonos() {
		System.out.println("Teléfonos con estado 'C': ");
		for (int i = 0; i < telefonos.size(); i++) {
			Telefono telf = telefonos.get(i);
			if (telf.getEstado().equals("C")) {
				System.out.println("Número: " + telf.getNumero() + ", Tipo: " + telf.getTipo());
			}
		}
	}

	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> estadoE = new ArrayList<Telefono>();
		for (int i = 0; i < telefonos.size(); i++) {
			Telefono telf = telefonos.get(i);
			if (telf.getEstado().equals("E")) {
				estadoE.add(telf);
			}
		}
		return estadoE;
	}

	public void imprimir2() {
		System.out.println("Información del Contacto:");
		System.out.println("Cédula: " + cedula);
		System.out.println("Nombre: " + nombre + " " + apellido);
		System.out.println("Dirección: ");
		if (direccion != null) {
			System.out.println("  Calle Principal: "+direccion.getCallePrincipal());
			System.out.println("  Calle Secundaria: "+direccion.getCalleSecundaria());
		}else {
			System.out.println("No tiene asociada una dirección");
		}
	}
}
