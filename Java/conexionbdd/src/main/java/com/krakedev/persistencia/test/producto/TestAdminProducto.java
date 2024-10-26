package com.krakedev.persistencia.test.producto;

import java.math.BigDecimal;

import com.krakedev.persistencia.entidades.Producto;
import com.krakedev.persistencia.servicios.AdminProductos;

public class TestAdminProducto {

	public static void main(String[] args) {
		Producto pr = new Producto();
		try {
			pr.setCodigo(23);
			pr.setNombre("Cuadernos");
			pr.setDescripcion("Universitario de 100 hojas");
			pr.setPrecio(new BigDecimal(4.5));
			pr.setStock(21);
			
			AdminProductos.insertar(pr);
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}

	}

}
