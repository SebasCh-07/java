package com.krakedev.persistencia.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Convertidor {
	private static final String FORMATO_FECHA = "yyyy/MM/dd";
	private static final String FORMATO_HORA = "hh:m";
	private static final Logger LOGGER = LogManager.getLogger(Convertidor.class);
	

	public static Date convertirFecha(String fechaStr) throws Exception {
		SimpleDateFormat sf = new SimpleDateFormat(FORMATO_FECHA);
		Date fechaDate = null;
		try {
			LOGGER.trace("Convirtiendo fecha "+fechaStr);
			fechaDate = sf.parse(fechaStr);
			LOGGER.trace("Fecha convertida "+fechaDate);
		} catch (ParseException e) {
			LOGGER.error("La fecha no tiene un formato correcto "+fechaStr,e);
			throw new Exception("La fecha no tiene un formato correcto "+fechaStr);
		}
		return fechaDate;
	}

	public static Date convertirHora(String HoraStr) throws Exception {
		SimpleDateFormat sf = new SimpleDateFormat(FORMATO_HORA);
		Date HoraDate = null;
		try {
			HoraDate = sf.parse(HoraStr);
		} catch (ParseException e) {
			LOGGER.error("La hora no tiene un formato correcto "+HoraStr,e);
			throw new Exception("La hora no tiene un formato correcto "+HoraStr);
		}
		return HoraDate;
	}
}
