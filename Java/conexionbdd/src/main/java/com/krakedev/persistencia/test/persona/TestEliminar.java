package com.krakedev.persistencia.test.persona;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		
		String cedulaEliminar = "1714526548";
	
		try {
			AdminPersonas.eliminar(cedulaEliminar);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}
		
	}

}
