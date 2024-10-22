package com.krakedev.estaticos.ejercicio.test;

import com.krakedev.estaticos.ejercicio.utils.DiasSemana;
import com.krakedev.estaticos.ejercicio.utils.Util;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;

public class TestAlarma {

	public static void main(String[] args) {
		Alarma a1 = new Alarma(DiasSemana.LUNES,4,30);
		Alarma a2 = new Alarma(DiasSemana.JUEVES,4,50);
		Alarma a3 = new Alarma(DiasSemana.DOMIGO,5,20);
		Alarma a4 = new Alarma(DiasSemana.SABADO,7,10);
		
		AdminAlarmas admin = new AdminAlarmas();
		admin.agregarAlarmas(a1);
		admin.agregarAlarmas(a2);
		admin.agregarAlarmas(a3);
		admin.agregarAlarmas(a4);
		
		ArrayList<Alarma> alarmas= admin.getAlarmas();
		System.out.println(alarmas);
		
		for(int i = 0; i<alarmas.size();i++) {
			Alarma a = alarmas.get(i);
			String dia = Util.formatearDia(a.getDia());
			String hora = Util.formatearHora(a.getHora());
			System.out.println(dia+", "+hora+":"+a.getMinuto());
		}
	}

}
