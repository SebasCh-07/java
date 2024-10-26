package com.krakedev.inventario.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.inventario.entidades.Categoria;
import com.krakedev.inventario.entidades.Producto;

@Path("productos")
public class ServiciosProducto {
	
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Producto product) {
		System.out.println("Isertando Producto >>>>>>>> "+product);
	}
	
	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar (Producto product) {
		System.out.println("Actualizanzo Producto >>>>>>>>>>>>> "+product);
	}
	
	@Path("consultar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Producto> recuperarTodos() {
	
		Categoria c1 = new Categoria(01,"Tecnologia");
		Producto p1 = new Producto("A1","Audifonos",c1,42.6,5);
		
		Categoria c2 = new Categoria(02,"Alimento");
		Producto p2 = new Producto("B1","Manzanas",c2,5.8,40);
		
		Categoria c3 = new Categoria(03,"Plantas");
		Producto p3 = new Producto("C1","Girasol",c3,2.5,10);
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		productos.add(p1);
		productos.add(p2);
		productos.add(p3);
		
		return productos;
	}
	
	
	
	
	
}
