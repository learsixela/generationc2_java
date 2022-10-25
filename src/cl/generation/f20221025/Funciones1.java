package cl.generation.f20221025;

import java.util.Arrays;

public class Funciones1 {

	public static void main(String[] args) {
		// Funciones o metodo

		//llamar a un metodo
		nombreMetodo();
		metodo2("Mijail");
		metodo2("Palma");
		metodo3(3);
		metodo4(77,9.9F);
		String[] vocales = {"a","e","i","o","u"};
		metodo5(vocales);
	}
	
//definicion o estructura de un metodo
	//void-> el metodo no retorna ningun valor
	public static void nombreMetodo() {
		System.out.println("Estoy dentro del metodos inicial...");
	}
	
	public static void metodo2(String palabra) {
		System.out.println("Soy "+palabra);
	}
	public static void metodo3(Integer numero) {
		System.out.println("Soy el numero "+numero);
	}
	public static void metodo4(int numero1,Float numero2) {
		System.out.println("Soy el numero "+numero1);
		System.out.println("Soy el numero2 "+numero2);
	}
	public static void metodo5(String[] arreglito) {
		System.out.println("Soy el arreglo "+Arrays.toString(arreglito));

	}
}
