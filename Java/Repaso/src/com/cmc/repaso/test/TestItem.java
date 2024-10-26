package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i1 = new Item();
		Item i2 = new Item();
		
		i1.setNombre("Audífonos");
		i1.setProductosActuales(20);
		i1.imprimir();
		
		//-------------------------------------
		System.out.println("----------------------------------------");
		
		i2.setNombre("Camara");
		i2.setProductosActuales(20);
		i2.vender(8);
		i2.devolver(3);
		i2.imprimir();
	}

}
