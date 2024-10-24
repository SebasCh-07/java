package com.krakedev.persistencia.entidades;

import java.util.Date;

public class Estudiantes {
	private String cedula;
	private String nombre;
	private String apellido;
	private String email;
	private Date fecha_nacimiento;
	private Profesores codigo_profesor;
	private int edad;
	
	public Estudiantes() {}

	public Estudiantes(String cedula, String nombre, String apellido, String email) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	public Estudiantes(String cedula, String nombre, String apellido, String email, Date fecha_nacimiento,
			Profesores codigo_profesor, int edad) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.fecha_nacimiento = fecha_nacimiento;
		this.codigo_profesor = codigo_profesor;
		this.edad = edad;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Profesores getCodigo_profesor() {
		return codigo_profesor;
	}

	public void setCodigo_profesor(Profesores codigo_profesor) {
		this.codigo_profesor = codigo_profesor;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Estudiantes [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", codigo_profesor=" + codigo_profesor + ", edad=" + edad
				+ "]";
	}
	
	
	
	
	
}
