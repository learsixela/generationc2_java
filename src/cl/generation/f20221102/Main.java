package cl.generation.f20221102;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Herencia en Java
		
		//intanciando objetos
		Entrenador entrenador = new Entrenador();
		entrenador.setNombre("Jhon");
		entrenador.setApellido("Doe");
		entrenador.setEdad(55);
		entrenador.setAniosExperiencia(10);
		entrenador.setEquipo("Valdivia");
		
		Entrenador entrenadorAyudante = new Entrenador("Isra","Palma",42,17,"cohorte2");
		
		//imprimiendo los atributos del objeto
		System.out.println(entrenador.toString());
		System.out.println(entrenadorAyudante.toString());
		
		Kinesiologo kine = new Kinesiologo();
		kine.setNombre("Jane");
		kine.setApellido("Doe");
		kine.setEdad(52);
		kine.setTitulo("Kinesiologia");
		kine.setEspecialidad("En musculos");
		
		ArrayList<Basquebolista> listaJugadores = new ArrayList<Basquebolista>();
		
		Basquebolista basque= new Basquebolista();
		basque.setNombre("Michel");
		basque.setApellido("Pipen");
		basque.setAltura(2.15f);
		
		listaJugadores.add(basque);//agregando una objeto a la lista
		
		Basquebolista basque2= new Basquebolista();
		basque2.setNombre("Steve");
		basque2.setApellido("Curry");
		basque2.setAltura(2.5f);
		
		listaJugadores.add(basque2);
		
		//recorrer lista
		for (Basquebolista jugador : listaJugadores) {
			System.out.println(jugador.toString());
		}
		
		entrenador.metodoImprimir();
		kine.metodoImprimir();
		basque2.metodoImprimir();
		
		
		//instancia de clase nieta
		Ayudante ayudante = new Ayudante();
		ayudante.metodoImprimir();
		
		
	}

}
