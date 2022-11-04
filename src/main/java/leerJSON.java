import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.MalformedInputException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

import com.google.gson.Gson;

import clases.Alumno;

public class leerJSON {

	public static void main(String[] args) {
		//creamos las variables para almacenar alumnos
		Alumno alumAux = new Alumno();
		// localizamos el archivo a leer
		Path archivoJson = Path.of("src/main/resources/alumnoJSON");
		Path archivoJson2 = Path.of("src/main/resources/alumnosJSON");
		//leemos el archivo de texto y lo almacenamos en un string:
		String textoJson = leerFichero(archivoJson);
		String textoJson2 = leerFichero(archivoJson2);
		//creamos un lector de Json:
		Gson gson = new Gson();
		alumAux = gson.fromJson(textoJson, Alumno.class);
		System.out.println(alumAux.getNombre());
		//para extraer un array usando el array de Json
		Alumno[] jsonArray = new Gson().fromJson(textoJson2, Alumno[].class);
		for (Alumno a : jsonArray) {
			System.out.println(a.getNombre());
		}
	}

	//método que convierte un archivo en String
	public static String leerFichero(Path f){
		String texto = "";
		if (Files.exists(f)&& !Files.isDirectory(f)) {
			try {
				for (String s : Files.readAllLines(f)) {
					texto = texto + s;
				}
			}
			catch(FileNotFoundException e) {
				System.out.println("No existe");
			}catch(MalformedInputException e) {
				System.out.println("Comprueba que la codificación del archivo sea UTF-8");
			}catch (NoSuchFileException e) {
				System.out.println("El archivo no existe");
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return texto;
	}
}
