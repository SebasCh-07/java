package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void agregarCelda(Celda CodigoCelda) {
		Celda c1 = new Celda(CodigoCelda.getCodigo());
		celdas.add(c1);
	}

	public void mostrarConfiguracion() {
		for (int i = 0; i < celdas.size(); i++) {
			Celda c1;
			c1 = celdas.get(i);
			System.out.println("Celda " + (i + 1) + ": " + c1.getCodigo());
		}
	}

	public Celda buscarCelda(String codigoCelda) {
		for (int i = 0; i < celdas.size(); i++) {
			if (codigoCelda.equals(celdas.get(i).getCodigo())) {
				return celdas.get(i);
			}
		}
		return null;
	}

	public void cargarProducto(Producto p1, String codigoCelda, int items) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(p1, items);
		}
	}

	public void mostrarProductos() {
		for (int i = 0; i < celdas.size(); i++) {
			Celda c1 = celdas.get(i);
			Producto p1 = c1.getProducto();
			if (p1 != null) {
				System.out.println("Codigo:" + c1.getCodigo() + " Stock:" + c1.getStock() + " Producto:"
						+ p1.getNombre() + " Precio:" + p1.getPrecio());
			} else {
				System.out.println("Codigo:" + c1.getCodigo() + " Stock:" + c1.getStock() + " Sin Producto asignado");
			}
		}
		System.out.println("Saldo: "+saldo);
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		for (int i = 0; i < celdas.size(); i++) {
			Celda c1 = celdas.get(i);
			Producto p1 = c1.getProducto();
			if (codigoCelda.equals(c1.getCodigo())) {
				return p1;
			}
		}
		return null;
	}

	public double consultarPrecio(String codigoCelda) {
		for (int i = 0; i < celdas.size(); i++) {
			Celda c1 = celdas.get(i);
			Producto p1 = c1.getProducto();
			if (codigoCelda.equals(c1.getCodigo())) {
				return p1.getPrecio();
			}
		}
		return 0.0;
	}

	public Celda buscarCeldaProducto(String codigoProdcuto) {
		for (int i = 0; i < celdas.size(); i++) {
			Celda c1 = celdas.get(i);
			Producto p1 = c1.getProducto();
			if (p1 != null) {
				if (codigoProdcuto.equals(p1.getCodigo())) {
					return c1;
				}
			}
		}
		return null;
	}
	
	public void incrementarProductos(String codigoProdcuto, int items) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProdcuto);
		if(celdaEncontrada != null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock()+items);
		}
	}
	
	public void vender(String codigoCelda) {
		for (int i = 0; i < celdas.size(); i++) {
			if (codigoCelda.equals(celdas.get(i).getCodigo())) {
				Celda c1 = celdas.get(i);
				Producto p1 = c1.getProducto();
				c1.setStock(c1.getStock()-1);
				saldo = saldo + p1.getPrecio();
			}
		}
	}
	
	public double venderConCambio(String codigoCelda, double valorIngresado) {
		for (int i = 0; i < celdas.size(); i++) {
			if (codigoCelda.equals(celdas.get(i).getCodigo())) {
				Celda c1 = celdas.get(i);
				Producto p1 = c1.getProducto();
				c1.setStock(c1.getStock()-1);
				saldo = saldo + p1.getPrecio();
				return valorIngresado-p1.getPrecio();
			}
		}
		return 0.0;
	}
	
	public ArrayList<Producto> buscarMenores(double limite){
		ArrayList<Producto> menores = new ArrayList<Producto>();
		Producto p1 = null;
		for (int i = 0; i < celdas.size(); i++) {
			Celda c1 = celdas.get(i);
			p1 = c1.getProducto();
			if (p1.getPrecio() < limite) {
				menores.add(p1);
			}
		}

		return menores;
	}

}
