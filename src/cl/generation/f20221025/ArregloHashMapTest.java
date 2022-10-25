package cl.generation.f20221025;

import java.util.HashMap;

public class ArregloHashMapTest {

	public static void main(String[] args) {
		// HashMap
		// llave, valor(key,value)
		HashMap<Integer,String> relatores = new HashMap<Integer,String>();
		
		//2.- agregar valor al map
		relatores.put(11, "Alejandro");
		relatores.put(2, "Andrea");
		relatores.put(33, "Laura");
		relatores.put(4, "Pamela");
		relatores.put(4, "Pamela");
		relatores.put(11, "Israel");//si existe esa clave, sobre escribe el valor
		System.out.println("map "+ relatores);
		
		//3.- tamaño del map
		System.out.println(relatores.size());
		
		//4.- acceder a un dato a traves de la clave
		System.out.println(relatores.get(33));//Laura
		
		//5.- eliminar un par de datos
		relatores.remove(11);
		System.out.println("map "+ relatores);

		//6.- recorremos un map
		/*for (Map.Entry<keyType, valType> entry : map.entrySet()) {
			keyType key = entry.getKey();
			valType val = entry.getValue();
			
		}
		*/
		for(Integer clave : relatores.keySet() ) {
			System.out.println("clave "+clave+" valor "+relatores.get(clave));
		}
	}

}
