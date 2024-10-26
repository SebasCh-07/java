package com.krakedev.persistencia.test.persona;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("U", "Union Libre");
		Persona p = new Persona("1714526548", "Julio", "Jaramillo", ec);
		try {
			
			Date fechaNacimiento = Convertidor.convertirFecha("2000/12/23");
			p.setFechaNacimiento(fechaNacimiento);
			Date horaNacimiento = Convertidor.convertirHora("10:20");
			p.setHoraNacimiento(horaNacimiento);
			
			p.setCantidadAhorrada(new BigDecimal(1230.45));
			p.setNumeroHijos(50);
			
			AdminPersonas.insertar(p);
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}

	}

}
