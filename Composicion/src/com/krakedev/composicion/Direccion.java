package com.krakedev.composicion;

public class Direccion {
	private String callePrincipal;
	private String calleSecudaria;
	private String numero;
	private double latitud;
	private double longitud;
	
	
	
	public Direccion(String callePrincipal, String calleSecudaria, String numero) {
		this.callePrincipal = callePrincipal;
		this.calleSecudaria = calleSecudaria;
		this.numero = numero;
	}
	
	public Direccion() {}

	public String getCallePrincipal() {
		return callePrincipal;
	}

	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}

	public String getCalleSecudaria() {
		return calleSecudaria;
	}

	public void setCalleSecudaria(String calleSecudaria) {
		this.calleSecudaria = calleSecudaria;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

}
