package com.krakedev;

public class Calculadora {
	public int sumar(int valor1, int valor2) {
		int resultado;
		resultado = valor1 + valor2;
		return resultado;
	}

	public double restar(double valor1, double valor2) {
		double resultado;
		resultado = valor1 - valor2;
		return resultado;
	}

	public double multiplicar(double valor1, double valor2) {
		double producto = valor1 * valor2;
		return producto;
	}

	public double dividir(double dividendo, double divisor) {
		double cociente = dividendo / divisor;
		return cociente;
	}

	public double promediar(double valor1, double valor2, double valor3) {
		double promedio = (valor1 + valor2 + valor3) / 3;
		return promedio;
	}
	
	public void mostrarResultado() {
		System.out.println("Ahorita no joven, Sali al almuerzo. Regreso en 15 minutos");
	}
}
