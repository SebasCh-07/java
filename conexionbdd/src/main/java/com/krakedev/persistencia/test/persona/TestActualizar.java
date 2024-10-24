package com.krakedev.persistencia.test.persona;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		
		EstadoCivil ec = new EstadoCivil("C", "Casado");
		Persona p = new Persona("1714526548", "Mario", "Jaramillo", ec);
		try {

			Date fechaNacimiento = Convertidor.convertirFecha("1995/11/23");
			p.setFechaNacimiento(fechaNacimiento);
			Date horaNacimiento = Convertidor.convertirHora("05:20");
			p.setHoraNacimiento(horaNacimiento);
			p.setEstatura(1.75);

			p.setCantidadAhorrada(new BigDecimal(600.45));
			p.setNumeroHijos(5);

			AdminPersonas.actualizar(p);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}

	}

}
