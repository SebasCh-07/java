package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calcu = new Calculadora();

		int resultadoSuma = calcu.sumar(5, 3);
		System.out.println("RESULTADO SUMA: " + resultadoSuma);

		// -------------------------------------------------

		double resultadoResta = calcu.restar(10, 3);
		System.out.println("RESULTADO RESTA: " + resultadoResta);
		
		//---------------------------------------------------
		
		double producto = calcu.multiplicar(10, 5);
		System.out.println("RSULTADO MULTIPLICACION: "+producto);
		
		//---------------------------------------------------
		
		double cociente = calcu.dividir(10, 2);
		System.out.println("RSULTADO DIVISION: "+cociente);
		
		//----------------------------------------------------
		
		double promedio = calcu.promediar(10, 8, 9);
		System.out.println("RSULTADO PROMEDIO: "+promedio);
		
		//----------------------------------------------------
		calcu.mostrarResultado();

	}

}
