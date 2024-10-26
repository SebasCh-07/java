package com.krakedev.persistencia.test.producto;

import com.krakedev.persistencia.servicios.AdminProductos;

public class TestEliminar {

	public static void main(String[] args) {
		int codigoEliminar = 22;
		
		try {
			AdminProductos.eliminar(codigoEliminar);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}
	}

}
