package cl.generation.f20221102.interfaces;

public class Main {

	public static void main(String[] args) {
		// interfaces y clases abstractas
		
		//no se pueden instanciar clases abstractas
		//Animal animal = new Animal();
		
		Caballo caballo = new Caballo();
		caballo.setAltura(2.5f);
		
		Humano humano = new Humano();
		humano.metodoEnAnimal();

		Leon leon = new Leon();
		leon.setAltura(0.80f);
		leon.setPeso(200f);
		//imprimir los valores seteados
		System.out.println("altura "+leon.getAltura() );
		System.out.println("peso "+leon.getPeso() );
		
		System.out.println(leon.toString());
		
		//imprimir que come Carne
		leon.metodoEnAnimal();
		
	}

}
