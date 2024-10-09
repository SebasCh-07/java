package com.cmc.directorio.entidades;

public class AdminTelefono {

	public void activarMensajeria(Telefono telf) {
		if (telf.getOperadora() == "movi") {
			telf.setTieneWhatsapp(true);
		}
	}

	public int contarMovi(Telefono telf1, Telefono telf2, Telefono telf3) {
		int telfMovi = 0;
		if (telf1.getOperadora() == "movi") {
			telfMovi = telfMovi + 1;
		}
		if (telf2.getOperadora() == "movi") {
			telfMovi = telfMovi + 1;
		}
		if (telf3.getOperadora() == "movi") {
			telfMovi = telfMovi + 1;
		}
		return telfMovi;
	}

	public int contarClaro(Telefono telf1, Telefono telf2, Telefono telf3, Telefono telf4) {
		int telClaro = 0;
		if (telf1.getOperadora() == "claro") {
			telClaro = telClaro + 1;
		}
		if (telf2.getOperadora() == "claro") {
			telClaro = telClaro + 1;
		}
		if (telf3.getOperadora() == "claro") {
			telClaro = telClaro + 1;
		}
		if (telf4.getOperadora() == "claro") {
			telClaro = telClaro + 1;
		}
		return telClaro;
	}
}
