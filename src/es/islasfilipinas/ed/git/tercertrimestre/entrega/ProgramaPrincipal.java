package es.islasfilipinas.ed.git.tercertrimestre.entrega;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Voy a crear una estructura de pares de clave valor.
 * Esta estructura lo que va a hacer es guardar 
 * la información de un usuario:
 * - Id
 * - NombreUsuario 
 * - Contraseña
 * - Apellido1
 * - Apellido2
 * - Email
 * 
 * Como clave aparecerán lo anteriormente puesto y como
 * valor a pareceran los datos del usuario.
 * 
 * @author millo
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {

		//Creo la misma estructura HashMap para cada 
		//nueva entrada de datos de otro usuario
		HashMap usuario1 = new HashMap<>();
		usuario1.put("Id", "001");
		usuario1.put("Nombre Usuario", "usuario1");
		usuario1.put("Contraseña","xxxxxxxxxxxxxxxxxx");
		usuario1.put("Nombre", "Pepe");
		usuario1.put("Primer-Apellido","Gonzalez");
		usuario1.put("Segundo-Apellido","Garcia");
		usuario1.put("Email", "pepegonzogar@gmail.com");
		
		HashMap usuario2 = new HashMap<>();
		usuario2.put("Id", "002");
		usuario2.put("Nombre Usuario", "usuario2");
		usuario2.put("Contraseña","xxxxxxxxxxxxxxxxxx");
		usuario2.put("Nombre", "Mónica");
		usuario2.put("Primer-Apellido","Castel");
		usuario2.put("Segundo-Apellido","Rios");
		usuario2.put("Email", "moncasrio@gmail.com");
		

		//Creo otra estructura que almacena las estructuras anteiores
		Map<Integer, HashMap> datosUsuario = new TreeMap<>();
		datosUsuario.put(0, usuario1);
		datosUsuario.put(1, usuario2);
		
		//Para sacar por pantalla utilizo un for-each
		for (HashMap key1: datosUsuario.values()) {
			System.out.println(key1);
		}
		
	}

}
