package com.krakedev.persistencia.test.persona;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultaPersonas {

	public static void main(String[] args) {
		try {
			ArrayList<Persona> p = AdminPersonas.buscarPorNombre("Rosalia");
			System.out.println(p);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
