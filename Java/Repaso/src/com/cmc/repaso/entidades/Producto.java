package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		} else if (precio < 0) {
			this.precio = precio * -1;
		}
	}
	
	public double calcularPrecioPromo(double porcentajeDescuento) {
		double decuento = (porcentajeDescuento/100)*precio;
		return precio - decuento;
	}

}
