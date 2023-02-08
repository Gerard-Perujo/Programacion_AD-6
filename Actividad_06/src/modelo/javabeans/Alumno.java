package modelo.javabeans;

public class Alumno extends Persona{

	private String curso;
	

	public Alumno() {
		super();
	}

	

	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
				
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}


	@Override
	public String toString() {
		return "Alumno [getNif()=" + getNif() + ", getNombre()=" + getNombre() + ", getDireccion()=" + getDireccion()
				+ ", getTelefono()=" + getTelefono() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", curso=" + curso + "]";
	}



	@Override
	public void trabajar() {
		System.out.println("El Alumno " + getNombre() + " va a estudiar para el " + curso);
		
	}
	
	public String hacerExamen() {
		return "El Alumno " + getNombre() + " va hacer su examen";
	}

}
