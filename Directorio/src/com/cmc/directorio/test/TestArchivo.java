package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestArchivo {

	public static void main(String[] args) {
		Telefono telf = new Telefono("Claro","1234567891",10);
		Contacto cont = new Contacto("Chamorro",telf,59.3);
		AdminContacto admin = new AdminContacto();
		
		Telefono t1 = cont.getTelefono();
		System.out.println("¿Tiene Whatsapp? "+t1.isTieneWhatsapp());
		
		admin.activarUsuario(cont);
		System.out.println("Esta activo? "+cont.isActivo());
		
		//-------------------------------------------------------------------------------
		System.out.println("-----------------------------------------------------");
		
		t1 = cont.getTelefono();
		t1.setTieneWhatsapp(true);
		System.out.println("¿Tiene Whatsapp? "+t1.isTieneWhatsapp());
		
		admin.activarUsuario(cont);
		System.out.println("Esta activo? "+cont.isActivo());
	}

}
