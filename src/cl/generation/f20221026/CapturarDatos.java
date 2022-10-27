package cl.generation.f20221026;

import java.util.Scanner;

public class CapturarDatos {

	public static void main(String[] args) {
		Float IMC = calculoIMC();
		//nivelIMC(IMC);
	}

	public static Float calculoIMC() {
		// capturar datos ingresados por el usuario
		Scanner scanner = new Scanner(System.in);
		//calculo del IMC; 
		//imc= kilos/(estatura*estatura);
		System.out.println("Ingrese su peso en kilogramos");
		Float peso = scanner.nextFloat();
		System.out.println("el peso del paciente es: "+peso);
		
		System.out.println("Ingrese su estatura en metros");
		Float estatura = scanner.nextFloat();
		System.out.println("la estatura del paciente es: "+estatura);
		
		Float IMC = peso /(estatura*estatura);
		System.out.println("Su IMC es: "+IMC);
		
		nivelIMC(IMC);
		
		scanner.close();
		
		
		return IMC;
	}
	
	public static void nivelIMC(Float IMC) {
		/*
		 * Por debajo de 18.5 Bajo peso 
		 * 18.5 - 24.999999 Normal 
		 * 25.0 - 29.999999 Sobrepeso 
		 * 30.0 o más Obeso
		 */
		
		if(IMC < 18.5F) {
			System.out.println("El paciente esta en el rango BAJO PESO");
		}else if(IMC >= 18.5F && IMC < 25) {
			System.out.println("El paciente esta en el rango NORMAL");
		}else if(IMC >= 25F && IMC < 30 ) {
			System.out.println("El paciente esta en el rango SOBRE PESO");
		}else if(IMC >=30) {
			System.out.println("El paciente esta en el rango OBESO");
		}
		
	}
	
}
