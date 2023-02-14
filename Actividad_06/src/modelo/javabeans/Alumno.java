package modelo.javabeans;


/**
 * Creamos una clase derivada de Persona llamada Alumno
 * 
 * @author Gerard_Perujo
 *
 */

public class Alumno extends Persona{
	
	/**
	 * Creamos una variable privada de tipo String llamada curso
	 * que hace refencia al curso que participa el alumno
	 */
	private String curso;
	

	public Alumno() {
		super();
	}

	/**
	 * Creamos un constructor con todo importando las variables de Persona y
	 * la variable privada de la clase profesor
	 * 
	 * @param  nif variable importada de Persona
	 * @param  nombre variable importada de Persona
	 * @param direccion variable importada de Persona
	 * @param telefono variable importada de Persona
	 * @param curso variable privada de Alumno
	 */
	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
				
	}


	
	/**
	 * Creamos los getters and setters solo de la clase Alumno
	 * 
	 */
	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}

	
	
	/**
	 * Aqui hemos sobreescrito el metodo toString de persona donde hay los gets
	 * de Persona y la variable de la clase Alumno
	 */


	@Override
	public String toString() {
		return "Alumno [Nif =" + getNif() + ", Nombre =" + getNombre() + ", Direccion =" + getDireccion()
				+ ", Telefono =" + getTelefono() + "], curso =" + curso;
	}
		
	
	/**
	 * Creamos el metodo hacer Examen()
	 * 
	 * @return devuelve un enunciado con el nombre del almuno que va hacer 
	 * el examen
	 */
	
	public String hacerExamen() {
		return "El Alumno " + getNombre() + " va hacer su examen";
	}


	/**
	 * importamos el metodo trabjar() de la clase Persona donde nos devuelve
	 * un enunciado en el curso que va estudiar cogiendo el nombre de Persona y 
	 * el curso en el que estudia
	 */
	
	@Override
	public String trabajar() {
		return "El Alumno " + getNombre() + " va a estudiar para el " + curso;
	}

}
