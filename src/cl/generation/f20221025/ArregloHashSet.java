package cl.generation.f20221025;

import java.util.HashSet;

public class ArregloHashSet {

	public static void main(String[] args) {
		//1.-definicion set o HashSet
		//HashSet<TIPODATO> nombre_array = new HashSet<TIPODATO>();
		HashSet<String> relatores = new HashSet<String>();
		
		//2.- agregar elemento al arreglo
		relatores.add("Alejandro");
		relatores.add("Andrea");
		relatores.add("Laura");
		relatores.add("Pamela");
		relatores.add("Hector");
		relatores.add("Maggi");
		relatores.add("Israel");
		relatores.add("Alejandro");//no es agregado, esta repetido
		
		//3.-verificar el contenido del arreglo
		boolean verificacionNombre = relatores.contains("Pamela");
		System.out.println("existe el relator? "+verificacionNombre);
		
		//4.- eliminar un elemento por el contenido
		relatores.remove("Hector");
		System.out.println(relatores);
		
		//5.- tamaño del arreglo
		System.out.println("tamaño del hashset: "+relatores.size());
		
		//6.- recorrer el arreglo
		//for iterador o for de objeto
		for(String relator  : relatores ){
			System.out.println(relator);
		}
	}

}
