package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestAdminContacto {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "9876654321", 4);
		Contacto cont1 = new Contacto("Diaz", telf1, 75.5);
		
		Telefono telf2 = new Telefono("movi", "9879994321", 24);
		Contacto cont2 = new Contacto("Orellana", telf2, 76.1);
		
		AdminContacto admin = new AdminContacto();
		//-----------------------------------------------------------------------------------------------------------------
		Contacto mP = admin.buscarMasPesado(cont1, cont2);
		Telefono telfMP = mP.getTelefono();
		System.out.println("El más pesado es: "+mP.getApellido()+", Peso: "+mP.getPeso()+", Numero: "+telfMP.getNumero());
		//-----------------------------------------------------------------------------------------------------------------
		boolean operador = admin.compararOperadoras(cont1, cont2);
		if(operador == true) {
			System.out.println("Los dos contactos tienen la misma Operadora");
		}else {
			System.out.println("Los dos contactos NO tienen la misma Operadora");
		}
		//-----------------------------------------------------------------------------------------------------------------
		
	}

}
