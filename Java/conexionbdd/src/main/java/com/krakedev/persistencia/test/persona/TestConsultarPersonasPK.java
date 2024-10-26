package com.krakedev.persistencia.test.persona;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultarPersonasPK {

	public static void main(String[] args) {
		try {
			Persona p = AdminPersonas.buscarPorCedula("1755635495");
			System.out.println(p);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}

}
