package com.krakedev.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.KrakedevException;
import com.krakedev.persistencia.ClientesBDD;

@Path("services")
public class ServicioClientes {
	
	@Path("m1")
	@GET
	public String saludar() {
		return "Hola Mundo Rest Web Services";
	}

	
	@Path("buscar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente buscar() {
		Cliente cliente = new Cliente("1753999364","Sebastian",2);
		return cliente;
	}
	
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertar (Cliente client) {
		System.out.println(">>>>>>>>>>"+client);
		ClientesBDD cli = new ClientesBDD();
		try {
			cli.insertar(client);
			return Response.ok().build();
		} catch (KrakedevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@Path("act")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actualizar (Cliente client) {
		System.out.println("Actualizar Cliente>>>>>>>"+client);
		ClientesBDD cli = new ClientesBDD();
		try {
			cli.actualizar(client);
			return Response.ok().build();
		} catch (KrakedevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@Path("all")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response obtenerClientes(){
		ClientesBDD cli = new ClientesBDD();
		ArrayList<Cliente> clientes = null;
		try {
			clientes = cli.recuperarTodos();
			return Response.ok(clientes).build();
		} catch (KrakedevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@Path("buscarPorCedula/{cedulaParam}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarPorCedula(@PathParam("cedulaParam") String cedula){
		ClientesBDD cli = new ClientesBDD();
		Cliente cliente = null;
		try {
			cliente = cli.buscarPorPK(cedula);
			return Response.ok(cliente).build();
		} catch (KrakedevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@Path("NumHijos/{hijosParam}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response BuscarPorHijos(@PathParam("hijosParam") int numHijos){
		ClientesBDD cli = new ClientesBDD();
		ArrayList<Cliente> clientes = null;
		try {
			clientes = cli.recuperarNumeroHijo(numHijos);
			return Response.ok(clientes).build();
		} catch (KrakedevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
}


