package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "1254875632", 15);
		Telefono telf2 = new Telefono("claro", "9875692417", 5) ;
		Telefono telf3 = new Telefono("claro", "1254845412", 12) ;
		Telefono telf4 = new Telefono("claro", "1254545412", 12) ;
		
		AdminTelefono admin = new AdminTelefono();
		int totalClaro = admin.contarClaro(telf1, telf2, telf3, telf4);
		
		System.out.println("El total de operadoras Claro es: "+totalClaro);
	}

}
