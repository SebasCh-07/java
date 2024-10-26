package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;

	public Curso() {
		estudiantes = new ArrayList<Estudiante>();
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		for (int i = 0; i < estudiantes.size(); i++) {
			Estudiante est = estudiantes.get(i);
			String cedulaEst = est.getCedula();
			String cedulaBuscar = estudiante.getCedula();
			if (cedulaBuscar.equals(cedulaEst)) {
				return "Estudiante encotrado dentro del curso";
			}
		}
		return null;
	}

	public void matricularEstudiante(Estudiante estudiante) {
		String buscar = buscarEstudiantePorCedula(estudiante);
		if (buscar == null) {
			estudiantes.add(estudiante);
		}
	}

	public double calcularPromedioCurso() {
		double promedioGeneral = 0.0;
		for (int i = 0; i < estudiantes.size(); i++) {
			Estudiante est = estudiantes.get(i);
			double promedioEst = est.calcularPromedioNotasEstudiante();
			promedioGeneral = promedioGeneral + promedioEst;
		}
		double promedio = promedioGeneral / estudiantes.size();
		return promedio;
	}

	public void mostrar() {
		for (int i = 0; i < estudiantes.size(); i++) {
			System.out.println(" ");
			System.out.println("--------------->Estudiante "+(i+1));
			Estudiante est = estudiantes.get(i);
			est.mostrar();
		}
	}
}
