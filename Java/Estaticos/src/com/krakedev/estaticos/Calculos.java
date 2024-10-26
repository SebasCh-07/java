package com.krakedev.estaticos;

public class Calculos {
	// final hace que el valor no se puede cambiar, es decir, convierte la variable en costante 
	private final double IVA = 12;
	
	public double calcularIva(double monto) {
		return monto*IVA/100;
	}
	
	
	
	
}
