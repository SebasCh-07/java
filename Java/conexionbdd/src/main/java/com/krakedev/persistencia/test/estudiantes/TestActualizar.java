package com.krakedev.persistencia.test.estudiantes;

import java.util.Date;

import com.krakedev.persistencia.entidades.Estudiantes;
import com.krakedev.persistencia.entidades.Profesores;
import com.krakedev.persistencia.servicios.AdminEstudiantes;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		Profesores pr = new Profesores(23, "Rocio Davila");
		Estudiantes est = new Estudiantes("1526448796","Joselo","Miraflores","MirafJose@gmail.com");
		
		try {
			
			Date fechaNacimiento = Convertidor.convertirFecha("2006/10/23");
			est.setFecha_nacimiento(fechaNacimiento);
			est.setCodigo_profesor(pr);
			est.setEdad(18);
		
			AdminEstudiantes.actualizar(est);
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}

	}

}
