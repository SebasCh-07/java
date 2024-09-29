package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		// producto A---------------------
		productoA.nombre = "Paracetamol";
		productoA.descripcion = "pastilla";
		productoA.precio = 2.5;
		productoA.stockActual = 10;
		// producto B---------------------
		productoB.nombre = "Buprex";
		productoB.descripcion = "Jarabe";
		productoB.precio = 9.6;
		productoB.stockActual = 15;
		// producto C---------------------
		productoC.nombre = "Finalín";
		productoC.descripcion = "Pastilla para la Cabeza";
		productoC.precio = 3.2;
		productoC.stockActual = 9;
		// -----------Consola-------------------
		// ------Producto A --------
		System.out.println("--->Producto A");
		System.out.println("Nombre: " + productoA.nombre);
		System.out.println("Descripción: " + productoA.descripcion);
		System.out.println("Precio: " + productoA.precio);
		System.out.println("Stock: " + productoA.stockActual);
		// ------Producto B --------
		System.out.println("--->Producto B");
		System.out.println("Nombre: " + productoB.nombre);
		System.out.println("Descripción: " + productoB.descripcion);
		System.out.println("Precio: " + productoB.precio);
		System.out.println("Stock: " + productoB.stockActual);
		// ------Producto C --------
		System.out.println("--->Producto C");
		System.out.println("Nombre: " + productoC.nombre);
		System.out.println("Descripción: " + productoC.descripcion);
		System.out.println("Precio: " + productoC.precio);
		System.out.println("Stock: " + productoC.stockActual);
	}

}
