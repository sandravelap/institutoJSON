package clases;

import java.util.ArrayList;

public class Insti {
	private String nombre;
	private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	

	public Insti(String nombre, ArrayList<Alumno> alumnos) {
		super();
		this.nombre = nombre;
		this.alumnos = alumnos;
	}
	
	//constructor vacío
	public Insti() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	
}
