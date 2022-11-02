package cl.generation.f20221102;

import cl.generation.f20221102.poli.Gato;
import cl.generation.f20221102.poli.Mascota;
import cl.generation.f20221102.poli.Perro;

public class PoliMain {

	public static void main(String[] args) {

		//instancia de las clases
		Mascota mascota = new Mascota();
		mascota.emitirSonido();
		
		Perro ayun = new Perro();
		ayun.emitirSonido();
		
		Gato tom = new Gato();
		tom.emitirSonido();
		
		/************* Polimorfismo ****************/
		
		/*Una super clase se comporta como una clase hija, pero no es la clase hija
		 * debe existir herencia, jerarquia de clase
		 * 
		 * */
		System.out.println("");
		Mascota regalon = new Perro();
		regalon.emitirSonido();
		System.out.println(regalon.toString());
		
		Mascota michi = new Gato();
		michi.emitirSonido();
		
/*polimorfismo parametrico, 
 * el metodo se escribe igual pero recibe distintos parametros*/
		michi.horasSiesta(16.5f);
		
	}

}
