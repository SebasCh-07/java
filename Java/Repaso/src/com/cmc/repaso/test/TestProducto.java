package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1 = new Producto();
		Producto p2 = new Producto();

		p1.setNombre("Banana");
		p1.setPrecio(-5.4);
		double totalP1 = p1.calcularPrecioPromo(15);

		p2.setNombre("Peras");
		p2.setPrecio(3.2);
		double totalP2 = p2.calcularPrecioPromo(20);
		
		System.out.println("Precio de "+p1.getNombre()+" con un decuento de 15%: "+totalP1);
		System.out.println("Precio de "+p2.getNombre()+" con un decuento de 20%: "+totalP2);

	}

}
