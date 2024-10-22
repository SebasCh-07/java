package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	public static String formatearHora (int numero) {
		String valor = numero+"";
		if (valor.length() == 1) {
			return "0"+valor;
		}
		return valor;
	}
	
	public static String formatearDia(int numero) {
		if (numero == 0) {
			return "Lunes";
		}else if (numero == 1) {
			return "Martes";
		}else if (numero == 2) {
			return "Miércoles";
		}else if (numero == 3) {
			return "Jueves";
		}else if (numero == 4) {
			return "Viernes";
		}else if (numero == 5) {
			return "Sabado";
		}else {
			return "Domingo";
		}
	}
	
	
}
