package com.krakedev.evaluacion;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	public Directorio() {
		contactos = new ArrayList<Contacto>();
		fechaModificacion = new Date();
		correctos = new ArrayList<Contacto>();
		incorrectos = new ArrayList<Contacto>();
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public boolean agregarContacto(Contacto cont) {
		for (int i = 0; i < contactos.size(); i++) {
			Contacto c1 = contactos.get(i);
			if (cont.getCedula().equals(c1.getCedula())) {
				return false;
			}
		}
		contactos.add(cont);
		return true;

	}

	public Contacto buscarPorCedula(String cedula) {
		for (int i = 0; i < contactos.size(); i++) {
			Contacto cont = contactos.get(i);
			if (cedula.equals(cont.getCedula())) {
				return cont;
			}
		}
		return null;
	}

	public String consultarUltimaModificacion() {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		String fechaFormateada = formato.format(fechaModificacion);
		return fechaFormateada;
	}

	public int contarPerdidos() {
		int sinDireccion = 0;
		for (int i = 0; i < contactos.size(); i++) {
			Contacto c1 = contactos.get(i);
			if (c1.getDireccion() == null) {
				sinDireccion += 1;
			}
		}
		return sinDireccion;
	}

	public int contarFijos() {
		int fijos = 0;
		for (int i = 0; i < contactos.size(); i++) {
			Contacto c1 = contactos.get(i);
			ArrayList<Telefono> telf1 = c1.getTelefonos();
			for (int o = 0; o < telf1.size(); o++) {
				Telefono telf = telf1.get(o);
				if (telf.getTipo().equalsIgnoreCase("convencional") && telf.getEstado().equals("C")) {
					fijos += 1;
				}

			}
		}
		return fijos;
	}

	public void depurar() {
		for (int i = 0; i < contactos.size(); i++) {
			Contacto c1 = contactos.get(i);
			if (c1.getDireccion() == null) {
				incorrectos.add(c1);
			} else if (c1.getDireccion() != null) {
				correctos.add(c1);
			}
		}
		contactos.clear();
	}

}
