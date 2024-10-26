package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	public Estudiante(String cedula, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		notas = new ArrayList<Nota>();
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public void agregarNota(Nota nuevaNota) {
		if (notas.size() == 0) {
			if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
				notas.add(nuevaNota);
			}
		} else {
			boolean materiaExistente = false;
			for (int i = 0; i < notas.size(); i++) {
				Nota n = notas.get(i);
				Materia materia = nuevaNota.getMateria();
				if (materia.getCodigo().equals(n.getMateria().getCodigo())) {
					materiaExistente = true;
				}
			}
			if (materiaExistente == false) {
				if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
					notas.add(nuevaNota);
				}
			}
		}
	}

	public void modificarNota(String codigo, double nuevaNota) {
		for (int i = 0; i < notas.size(); i++) {
			Nota n = notas.get(i);
			if (codigo.equals(n.getMateria().getCodigo())) {
				if (nuevaNota >= 0 && nuevaNota <= 10) {
					n.setCalificacion(nuevaNota);
					break;
				}else {
					System.out.println("Nota fuera de Rango");
					break;
				}
			} else {
				System.out.println("No se encontro el código");
			}
		}
	}

	public double calcularPromedioNotasEstudiante() {
		double totalNota = 0;
		for (int i = 0; i < notas.size(); i++) {
			Nota n = notas.get(i);
			totalNota = totalNota + n.getCalificacion();
		}
		double Promedio = totalNota / notas.size();
		return Promedio;
	}

	public void mostrar() {
		System.out.println("Nombre: " + nombre + " " + apellido + ", Cedula: " + cedula);
		for (int i = 0; i < notas.size(); i++) {
			Nota n = notas.get(i);
			n.mostrar();
		}
	}

}
