package cl.generation.f20221102.poli;

public class Perro extends Mascota{
	
	private String sonido;

	public Perro() {
	}

	public Perro(String raza, String nombre, String sexo) {
		super(raza, nombre, sexo);
		
	}

	public Perro(String sonido) {
		super();
		this.sonido = sonido;
	}

	public Perro(String raza, String nombre, String sexo, String sonido) {
		super(raza, nombre, sexo);
		this.sonido = sonido;
	}
//get y set
	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	@Override
	public void emitirSonido() {
		System.out.println("es sonido (ladrido) es Guauguau");
	}
	

	
}
