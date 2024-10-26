package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("Movi","123456789",10);
		Contacto c = new Contacto("Pillajo", telf, 80.2);
		
		Telefono t1 = c.getTelefono();
		System.out.println("Apellido:"+c.getApellido()+" Operadora:"+t1.getOperadora()+" Numero:"+t1.getNumero()+" Peso:"+c.getPeso());
		
		
	}

}
