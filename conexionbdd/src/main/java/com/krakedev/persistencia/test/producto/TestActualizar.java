package com.krakedev.persistencia.test.producto;

import java.math.BigDecimal;

import com.krakedev.persistencia.entidades.Producto;
import com.krakedev.persistencia.servicios.AdminProductos;

public class TestActualizar {

	public static void main(String[] args) {
		Producto pr= new Producto();
		try {

			pr.setCodigo(23);
			pr.setNombre("Cuadernos");
			pr.setDescripcion("Universitario de 60 hojas");
			pr.setPrecio(new BigDecimal(3.5));
			pr.setStock(15);
			
			AdminProductos.actualizar(pr);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}

	}

}
