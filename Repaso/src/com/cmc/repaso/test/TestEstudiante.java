package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante est1 = new Estudiante("Sebastián");
		Estudiante est2 = new Estudiante("Juan");
		Estudiante est3 = new Estudiante("José");
		
		est1.calificar(7);
		est2.calificar(9);
		est3.calificar(8.5);
	}

}
