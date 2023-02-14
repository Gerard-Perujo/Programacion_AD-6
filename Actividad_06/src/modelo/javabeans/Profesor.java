package modelo.javabeans;

/**
 * Creamos una clase derivada de Persona cogiendo las variables de Persona y 
 * importando los metodos abstractos de Persona
 * 
 * @author Gerard_Perujo
 *
 */


public class Profesor extends Persona{
	
	/**
	 * Variable privada de tipo String llamada competencias
	 * hace refencia a la rama que desenvolupa el profesor
	 */
	private String competencias;

	
	public Profesor() {
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
	 * @param competencias variable privada de profesor
	 */
	public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}


	/**
	 * Creamos los getters and setters solo de la clase Profesor
	 * 
	 */
	public String getCompetencias() {
		return competencias;
	}




	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}

	
	/**
	 * Aqui hemos sobreescrito el metodo toString de persona donde hay los gets
	 * de Persona y la variable de Profesor
	 */
	
	@Override
	public String toString() {
		return "Profesor [Nif =" + getNif() + ", Nombre =" + getNombre() + ", Direccion =" + getDireccion()
				+ ", Telefono =" + getTelefono() + "], competencias =" + competencias;
	}

	
	/**
	 * Creamos el metodo poner notas() donde con un get coge el nombre de persona
	 * ya que las variables son privadas
	 * 
	 * @return devuelve un enunciado con el nombre del profesor
	 */
	public String ponerNotas() {
		return "El Profesor " + getNombre() + " va ha corregir los examenes";
		
	}


	/**
	 * importamos el metodo trabajar() de Persona donde nos devuelve un 
	 * enunciado con el nombre del profesor
	 */
	@Override
	public String trabajar() {
		return "El Profesor " + getNombre() + " va a impartir su clase";
	}


	
	
	
	
}