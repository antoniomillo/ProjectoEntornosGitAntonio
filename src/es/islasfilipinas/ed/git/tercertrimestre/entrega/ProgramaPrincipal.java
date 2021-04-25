package es.islasfilipinas.ed.git.tercertrimestre.entrega;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Voy a crear una estructura de pares de clave valor.
 * Esta estructura lo que va a hacer es guardar 
 * la informaci�n de un usuario:
 * - Id
 * - NombreUsuario 
 * - Contrase�a
 * - Apellido1
 * - Apellido2
 * - Email
 * 
 * Como clave aparecer�n lo anteriormente puesto y como
 * valor a pareceran los datos del usuario.
 * 
 * @author millo
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {

		//Creo la misma estructura HashMap para cada 
		//nueva entrada de datos de otro usuario
		Map<String, String> usuario1 = new HashMap<>();
		usuario1.put("Id", "001");
		usuario1.put("Nombre Usuario", "usuario1");
		usuario1.put("Contrase�a","xxxxxxxxxxxxxxxxxx");
		usuario1.put("Nombre", "Pepe");
		usuario1.put("Primer-Apellido","Gonzalez");
		usuario1.put("Segundo-Apellido","Garcia");
		usuario1.put("Email", "pepegonzogar@gmail.com");
		
		Map<String, String> usuario2 = new HashMap<>();
		usuario2.put("Id", "002");
		usuario2.put("Nombre Usuario", "usuario2");
		usuario2.put("Contrase�a","xxxxxxxxxxxxxxxxxx");
		usuario2.put("Nombre", "M�nica");
		usuario2.put("Primer-Apellido","Castel");
		usuario2.put("Segundo-Apellido","Rios");
		usuario2.put("Email", "moncasrio@gmail.com");
		
		Set dame = usuario1.keySet();
		Iterator <String> it = dame.iterator();
		String key;
		String tmp;
		while (it.hasNext()) {
			key = it.next();
			tmp = usuario1.get(key);
			System.out.println(key+": "+tmp);
		}
	}

}
