package com.cmc.repaso.entidades;

public class Estudiante {
	public String nombre;
	public double nota;
	public String tipo;

	public Estudiante(String nombre) {
		this.nombre = nombre;
	}

	public void calificar(double nota) {
		this.nota = nota;
		if (nota < 8) {
			tipo = "F";
			System.out.println(nombre+" Reprobaste: " + nota +" "+tipo);
		} else if (nota >= 8) {
			tipo = "A";
			System.out.println(nombre+" Aprobaste: " + nota + " "+tipo);
		}
	}
}
