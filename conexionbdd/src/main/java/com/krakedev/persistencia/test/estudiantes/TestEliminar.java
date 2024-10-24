package com.krakedev.persistencia.test.estudiantes;

import com.krakedev.persistencia.servicios.AdminEstudiantes;

public class TestEliminar {

	public static void main(String[] args) {
		
		String cedulaEliminar = "1526448796";
		try {
			AdminEstudiantes.eliminar(cedulaEliminar);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}
	}

}
