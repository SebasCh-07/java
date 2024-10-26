package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
		
		SimpleDateFormat sf=new SimpleDateFormat("yyyy/MM/dd hh:m:ss");
		String fechaStr="2020/03/22 10:05:04";
		try {
			Date fecha = sf.parse(fechaStr);
			System.out.println(fecha);
			long fechamilis=fecha.getTime();
			System.out.println(fechamilis);
			
			java.sql.Date fechaSQL = new java.sql.Date(fechamilis);
			System.out.println(fechaSQL);
			
			Time timeSQL= new Time(fechamilis);
			System.out.println(timeSQL);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
