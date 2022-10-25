package cl.generation.f20221025;

import java.util.ArrayList;

public class ArregloDinamico {

	public static void main(String[] args) {
		// ArrayList
		//1.- definicion
		//ArrayList<TIPODATO> nombre_array = new ArrayList<TIPODATO>();
		ArrayList<String> relatores = new ArrayList<String>();
		//2.-Agregar valores al arreglo
		relatores.add("Alejandro");
		relatores.add("Andrea");
		relatores.add("Laura");
		relatores.add("Pamela");
		relatores.add("Hector");
		relatores.add("Maggi");
		relatores.add("Israel");
		relatores.add("Alejandro");
		System.out.println(relatores);
		//3.-tamaño del arraylist
		System.out.println(relatores.size());
		
		/*length-> arreglos estaticos; size-> arreglos dinamicos*/
		//4.- obtener un elemento dentro del arreglo
		System.out.println(relatores.get(4));
		//System.out.println(relatores.get(7));//fuera de indice
		//5.-eliminar un elemento dentro del array, por posicion
		relatores.remove(3);
		relatores.remove(1);
		System.out.println(relatores);
		relatores.add("Andrea");
		//6.- recorrer el ArrayList
		for(int i = 0; i<relatores.size();i++){
			//relatores[i];en array estaticos
			System.out.println("relator: "+relatores.get(i));
		}
		System.out.println("**************");
		//for iterador o for de objeto
		for(String relator  : relatores ){
			System.out.println(relator);
		}
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		
		for(Integer numero :numeros) {
			System.out.println(numero);
		}
		
	}

}
