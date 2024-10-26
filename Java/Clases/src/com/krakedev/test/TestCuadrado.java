package com.krakedev.test;

import com.krakedev.Cuadradop;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadradop ladoC1 = new Cuadradop(9);
		Cuadradop ladoC2 = new Cuadradop(8);
		Cuadradop ladoC3 = new Cuadradop(7);
		
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("El Area de C1: "+ladoC1.calcularArea()+" Perimetro de C1: "+ladoC1.calcularPerimetro());
		System.out.println("El Area de C1: "+ladoC2.calcularArea()+" Perimetro de C1: "+ladoC2.calcularPerimetro());
		System.out.println("El Area de C1: "+ladoC3.calcularArea()+" Perimetro de C1: "+ladoC3.calcularPerimetro());
		System.out.println("----------------------------------------------------------------------------------------");
		
		
		double areaC1;
		double periC1;

		double areaC2;
		double periC2;

		double areaC3;
		double periC3;

		ladoC1.setLado(4);
		ladoC2.setLado(3);
		ladoC3.setLado(2);

		areaC1 = ladoC1.calcularArea();
		periC1 = ladoC1.calcularPerimetro();
		System.out.println("El Area de C1: "+areaC1+" Perimetro de C1: "+periC1);
		
		areaC2 = ladoC2.calcularArea();
		periC2 = ladoC2.calcularPerimetro();
		System.out.println("El Area de C2: "+areaC2+" Perimetro de C2: "+periC2);
		
		areaC3 = ladoC3.calcularArea();
		periC3 = ladoC3.calcularPerimetro();
		System.out.println("El Area de C3: "+areaC3+" Perimetro de C3: "+periC3);
		
	}

}
