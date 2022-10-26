package cl.generation.f20221026;

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
		String[] arreglito = {"a","e","i","o","u"};
		metodo5(arreglito);
		//metodos con llamados
		//retorno1();//no hace nada con el valor retornado
		//System.out.println(retorno1());
		Integer valorRetornado = retorno1();
		System.out.println(valorRetornado);
		System.out.println(valorRetornado/7);//35/7=5
		System.out.println(valorRetornado/5);//35/5=7
		
		String nombreCompleto = obtenerNombreCompleto("Quezada", "Israel", "Palma");
		System.out.println("el nombre completo es: "+nombreCompleto);
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
	//funciones con retorno
	public static Integer retorno1() {
		Integer totalAlumnos= 35;
		return totalAlumnos;
	}
	/**
	 * Metodo que une todos los datos
	 * @param apeMaterno
	 * @param nombre
	 * @param apePaterno
	 * @return nombreCompleto
	 */
	public static String obtenerNombreCompleto(String apeMaterno,String nombre,String apePaterno) {
		String nombreCompleto = nombre+" "+apePaterno+" "+apeMaterno;
		return nombreCompleto;//retornamos el contenido de la variable
	}
	
}
