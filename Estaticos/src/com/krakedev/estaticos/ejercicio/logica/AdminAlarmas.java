package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;

public class AdminAlarmas {
	private ArrayList<Alarma> alarmas;
	
	
	public AdminAlarmas() {
		super();
		alarmas = new ArrayList<Alarma>();
	}

	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}

	public void agregarAlarmas(Alarma alarma) {
		alarmas.add(alarma);
	}
	
	
}
