package cl.generation.f20221026;

import java.util.Scanner;

public class BucleDoWhileTest {

	public static void main(String[] args) {
		// doWhile
		// a lo menos se ejecuta una vez
		Scanner scanner = new Scanner(System.in);
		int edad = 0;
		Float kilos=0f;
		
		do {
			
			System.out.println("Ingresa tu edad");
			edad = scanner.nextInt();
			
		} while (edad < 18 || edad >120);
		
		System.out.println("edad ingresada "+edad);
		
		//peso
		do {
			System.out.println("Ingresa tu kilos");
			kilos = scanner.nextFloat();
		} while (kilos < 40 || kilos >150);
			
		System.out.println("kilos ingresado es "+kilos);
		
		
		
		
		scanner.close();
	}

}
