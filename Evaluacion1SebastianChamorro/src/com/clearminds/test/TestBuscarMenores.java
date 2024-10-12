package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
		maquina.agregarCelda(new Celda("A2"));
		maquina.agregarCelda(new Celda("B1"));
		maquina.agregarCelda(new Celda("B2"));
		maquina.agregarCelda(new Celda("C1"));
		maquina.agregarCelda(new Celda("C2"));

		Producto producto = new Producto("KE34", "Papitas", 0.85);
		maquina.cargarProducto(producto, "A1", 4);

		Producto producto2 = new Producto("D456", "Doritos", 0.70);
		maquina.cargarProducto(producto2, "B1", 6);

		Producto producto3 = new Producto("KJ54", "Golpe", 0.65);
		maquina.cargarProducto(producto3, "A2", 4);

		Producto producto4 = new Producto("S656", "Doritos FlamigHot", 0.60);
		maquina.cargarProducto(producto4, "B2", 5);

		Producto producto5 = new Producto("KJH5", "Rufles", 0.80);
		maquina.cargarProducto(producto5, "C1", 4);

		Producto producto6 = new Producto("D626", "Cheetos", 0.50);
		maquina.cargarProducto(producto6, "C2", 6);

		ArrayList<Producto> menores = maquina.buscarMenores(0.70);
		System.out.println("Productos Menores: " + menores.size());
		for (int i = 0; i < menores.size(); i++) {
			System.out.println("Nombre: "+menores.get(i).getNombre()+" Precio: "+menores.get(i).getPrecio());
		}

	}

}
