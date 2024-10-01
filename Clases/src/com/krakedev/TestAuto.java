package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto("Mustang", 2012, 60000.99);
		Auto auto2 = new Auto("BMW M3 GTR", 2005, 40500);
		
		System.out.println("---Auto---");
		System.out.println("Marca: "+auto1.getMarca());
		System.out.println("Año: "+auto1.getAnio());
		System.out.println("Precio: "+auto1.getPrecio());
		
		System.out.println("---Auto---");
		System.out.println("Marca: "+auto2.getMarca());
		System.out.println("Año: "+auto2.getAnio());
		System.out.println("Precio: "+auto2.getPrecio());
		
		
		//-------------Auto1-------------------
		auto1.setMarca("Chevrolet");
		auto1.setAnio(2015);
		auto1.setPrecio(25600.99);
		//-------------Auto2-------------------
		auto2.setMarca("Porche");
		auto2.setAnio(2019);
		auto2.setPrecio(40700);
		//-------------Consola-----------------
		// Auto 1
		System.out.println("---Auto 1---");
		System.out.println("Marca: "+auto1.getMarca());
		System.out.println("Año: "+auto1.getAnio());
		System.out.println("Precio: "+auto1.getPrecio());
		// Auto 2
		System.out.println("---Auto 2---");
		System.out.println("Marca: "+auto2.getMarca());
		System.out.println("Año: "+auto2.getAnio());
		System.out.println("Precio: "+auto2.getPrecio());
		
	}

}
