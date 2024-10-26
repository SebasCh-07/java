package com.krakedev.test;

import com.krakedev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha fecha1 = new Fecha(2007,06,01);
		System.out.println("Mi cumpleaños es el: "+fecha1.getAnio()+"/"+fecha1.getMes()+"/"+fecha1.getDia());
		
		System.out.println("----------------------------------------------------------------------------");
		
		fecha1.setAnio(2000);
		fecha1.setMes(12);
		fecha1.setDia(12);

		System.out.println(fecha1.getAnio());
	}

}
