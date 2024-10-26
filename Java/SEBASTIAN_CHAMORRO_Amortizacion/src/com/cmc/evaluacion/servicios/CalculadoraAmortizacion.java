package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {
	public static double calcularCuota(Prestamo prestamo) {
		double interes = prestamo.getInteres();
		double monto = prestamo.getMonto();
		int plazo = prestamo.getPlazo();

		double interesMensual = (interes / 12) / 100;

		double cuota = (monto * interesMensual) / (1 - (Math.pow((1 + interesMensual), -plazo)));

		return cuota;
	}

	public static void generarTabla(Prestamo prestamo) {
		double cuotaP = calcularCuota(prestamo);
		for (int i = 0; i < prestamo.getPlazo(); i++) {
			Cuota cuota = new Cuota(i + 1);
			cuota.setCuota(cuotaP);
			ArrayList<Cuota> listaCuotas = prestamo.getCuotas();
			listaCuotas.add(cuota);
			listaCuotas.get(i).setInicio(prestamo.getMonto());
			
            if (i == 0 || i == prestamo.getPlazo()) {
            	calcularValoresCuota(prestamo.getInteres(), listaCuotas.get(i), null);
            }else if(i != 0) {
            	calcularValoresCuota(prestamo.getInteres(), listaCuotas.get(i-1), listaCuotas.get(i));
            }
			

			if (i == prestamo.getPlazo()-1) {
				calcularValoresCuota(prestamo.getInteres(), listaCuotas.get(i), null);
				Cuota c1 = listaCuotas.get(i);
				double saldo = c1.getSaldo();
				double cuo = c1.getCuota();
				c1.setCuota(cuo + saldo);
				c1.setSaldo(0.0);
				
			}
		}
	}

	public static void calcularValoresCuota(double interesPrestamo, Cuota cuota1, Cuota cuota2) {
		double inicio = cuota1.getInicio();
		double cuota = cuota1.getCuota();
		double interes = ((interesPrestamo / 12) / 100) * inicio;
		double abonoCapital = cuota - interes;
		double saldo = inicio - abonoCapital;

		cuota1.setAbonoCapital(abonoCapital);
		cuota1.setInteres(interes);
		cuota1.setSaldo(saldo);
		if (cuota2 != null) {
			cuota2.setInicio(saldo);
		}

	}

	public static void mostrarTabla(Prestamo prestamo) {
		ArrayList<Cuota> cuota = prestamo.getCuotas();
		System.out.println("Número | Cuota | Inicio | Interés | Abono | Saldo");
		for (int i = 0; i < cuota.size(); i++) {
			cuota.get(i).mostrarPrestamo();
			;
		}
	}

}
