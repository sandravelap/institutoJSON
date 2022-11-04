import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import clases.Alumno;
import clases.Insti;

public class crearJSON {

	public static void main(String[] args) {
		//creamos el archivo donde vamos a escribir
		Path alumnoJSON = Path.of("target/alumnoJSON");
		Path instiJSON = Path.of("target/instiJSON");
		//creamos los objetos a escribir en el JSON
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		Alumno a1 = new Alumno("Lola", 16, "SMR1");
		listaAlumnos.add(a1);
		Alumno a2 = new Alumno("Juan", 20, "DAM1");
		listaAlumnos.add(a2);
		Alumno a3 = new Alumno("Sofía", 21, "DAM2");
		listaAlumnos.add(a3);
		Insti miInsti = new Insti("IES Mi Instituto", listaAlumnos);
		//creamos el constructor de parseadores gson
		GsonBuilder gsonBuilder = new GsonBuilder();
		//creamos el gson con la opción de indentar correctamente al generar el JSON
		Gson gson =  gsonBuilder.setPrettyPrinting().create();
		//generamos un texto con formato json
		String jsonAlumno = gson.toJson(a1);
		System.out.println(jsonAlumno);
		String jsonListaAl = gson.toJson(listaAlumnos);
		System.out.println(jsonListaAl);
		String jsonInsti = gson.toJson(miInsti);
		try {
			Files.writeString(alumnoJSON, jsonAlumno);
			Files.writeString(instiJSON, jsonInsti);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
