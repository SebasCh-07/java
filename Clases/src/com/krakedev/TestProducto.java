package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		// producto A---------------------
		productoA.setNombre("Paracetamol");
		productoA.setDescripcion("pastilla");
		productoA.setPrecio(2.5);
		productoA.setStockActual(10);
		// producto B---------------------
		productoB.setNombre("Buprex");
		productoB.setDescripcion("Jarabe");
		productoB.setPrecio(9.6);
		productoB.setStockActual(15);
		// producto C---------------------
		productoC.setNombre("Finalín");
		productoC.setDescripcion("Pastilla para la Cabeza");
		productoC.setPrecio(3.2);
		productoC.setStockActual(9);
		// -----------Consola-------------------
		// ------Producto A --------
		System.out.println("--->Producto A");
		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripción: " + productoA.getDescripcion());
		System.out.println("Precio: " + productoA.getPrecio());
		System.out.println("Stock: " + productoA.getStockActual());
		// ------Producto B --------
		System.out.println("--->Producto B");
		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripción: " + productoB.getDescripcion());
		System.out.println("Precio: " + productoB.getPrecio());
		System.out.println("Stock: " + productoB.getStockActual());
		// ------Producto C --------
		System.out.println("--->Producto C");
		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripción: " + productoC.getDescripcion());
		System.out.println("Precio: " + productoC.getPrecio());
		System.out.println("Stock: " + productoC.getStockActual());
	}

}
