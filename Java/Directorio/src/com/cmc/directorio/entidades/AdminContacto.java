package com.cmc.directorio.entidades;

public class AdminContacto {

	public Contacto buscarMasPesado(Contacto cont1, Contacto cont2) {
		if (cont1.getPeso() > cont2.getPeso()) {
			return cont1;
		} else {
			return cont2;
		}
	}

	public boolean compararOperadoras(Contacto cont1, Contacto cont2) {
		Telefono telf1 = cont1.getTelefono();
		Telefono telf2 = cont2.getTelefono();
		if (telf1.getOperadora() == telf2.getOperadora()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void activarUsuario(Contacto cont) {
		Telefono telf = cont.getTelefono();
		if(telf.isTieneWhatsapp()==true) {
			cont.setActivo(true);
		}
	}
	
}
