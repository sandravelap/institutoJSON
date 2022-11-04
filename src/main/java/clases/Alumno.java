package clases;

public class Alumno {
	private String nombre;
	private Integer edad;
	private String curso;
	
	public Alumno(String nombre, Integer edad, String curso) {
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
	}
	
	public Alumno() {
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
