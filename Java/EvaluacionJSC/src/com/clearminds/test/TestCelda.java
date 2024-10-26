package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {
	public static void main(String[] args) {
		Celda celda=new Celda("A1");
		System.out.println(celda.getProducto().getNombre());
		/*
		*La línea 8 es la que ocaciona el NullPointer porque al rato de llamar a celda.getProducto().getNombre() se esta invocando 
		*a un null.get ya que la clase Producto tiene un valor por defecto de Null, es otras palabras, celda.getProducto trata
		*de invocar a una clase que tiene varios atributos por lo cual solo le retorna null y sobre es null se hace otro .get
		*/ 
		
		System.out.println("CELDA:"+celda.getProducto());
		System.out.println("Nombre Producto:"+celda.getProducto().getNombre());
		System.out.println("Precio Producto:"+celda.getProducto().getPrecio());
		System.out.println("C�digo Producto:"+celda.getProducto().getCodigo());
		System.out.println("STOCK:"+celda.getStock());
		System.out.println("*************************************");
	}
}
