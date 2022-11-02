package cl.generation.f20221102;

public class Entrenador extends EquipoBasquetball{
	
	private int aniosExperiencia;
	private String equipo;
	public Entrenador() {
		super();
	}
	public Entrenador(int aniosExperiencia, String equipo) {
		super();
		this.aniosExperiencia = aniosExperiencia;
		this.equipo = equipo;
	}
	

	
	public Entrenador(String nombre, String apellido, int edad, int aniosExperiencia, String equipo) {
		super(nombre, apellido, edad);//pasando valores al contructor de la super clase
		this.aniosExperiencia = aniosExperiencia;
		this.equipo = equipo;
	}
	
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	@Override
	public String toString() {
		return "Entrenador [aniosExperiencia=" + aniosExperiencia + ", equipo=" + equipo + ", Nombre="
				+ getNombre() + ", ApelLido=" + getApellido() + ", Edad=" + getEdad() + "]";
	}

	/*@Override
	public void metodoImprimir() {
		System.out.println("estoy en el metodo de la clase hija entrenador");
	}*/

}
