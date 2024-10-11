package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProductoNull {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto prod=maquina.buscarProductoEnCelda("A1");
		System.out.println("Producto encontrado:"+prod.getNombre());
		/*el error esta en prod.getNombre ya que convoca a un null.get, basicamente, 
		 *el codigo Producto prod=maquina.buscarProductoEnCelda("A1"); trata de recuperar el Producto con el codigo de la celda
		 *pero la celda que encontro aun no tiene valores determinados para su producto por lo que el valor por defecto es null
		 *por lo tanto la variable prod es null 
		 */
		
		
		
		
	}
}
