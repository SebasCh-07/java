package com.krakedev.herencia;

public class testHerencia {

	public static void main(String[] args) {
		Perro p=new Perro();
		p.dormir();
		Animal a=new Animal();
		System.out.println(a.hashCode());
		
		p.ladrar();
	}

}
