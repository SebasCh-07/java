package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin = new AdminPersonas();
		admin.agregar(new Persona("Mario","Benedetti",50));
		admin.agregar(new Persona("Jose","Correa",25));
		admin.agregar(new Persona("Bruno","Bross",36));
		
		admin.imprimir();
		
		Persona p1 = admin.buscarPorNombre("Jose");
		if(p1 != null) {
			System.out.println("ENCONTRADO: "+p1.getApellido()+" "+p1.getEdad());
		}else {
			System.out.println("PERSONA NO ENCONTRADA");
		}
		
		ArrayList<Persona> mayores=admin.buscarMayores(25);
		
		System.out.println("MAYORES: "+mayores.size());
	}

	

	
	
	
	
	
}
