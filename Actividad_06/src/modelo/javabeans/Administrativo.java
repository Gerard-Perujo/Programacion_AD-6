package modelo.javabeans;

/**
 * Creamos una clase derivada de Persona que se llama Administrativo
 * 
 * @author Gerard_Perujo
 *
 */

public class Administrativo extends Persona{

	/**
	 * Cramos una variable privada tipo String llamada tareas
	 * que hace referencia a las tareas que realiza el administrativo
	 */
	private String tareas;
	
	
	

	public Administrativo() {
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
	 * @param tareas variable privada de Administrativo
	 */
	public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}



	/**
	 * Creamos los getters and setters solo de la clase Administrativo
	 * 
	 */
	public String getTareas() {
		return tareas;
	}



	public void setTareas(String tareas) {
		this.tareas = tareas;
	}


	/**
	 * Aqui hemos sobreescrito el metodo toString de persona donde hay los gets
	 * de Persona y la variable de la clase Administrativo
	 */
	
	@Override
	public String toString() {
		return "Administrativo [Nif= " + getNif() + ", Nombre= " + getNombre() + ", Direccion= "
				+ getDireccion() + ", Telefono= " + getTelefono() + "], tareas= " + tareas;
	}


	/**
	 * Creamos el metodo gestionMatricula() 
	 * 
	 * @return un enunciado donde nos dice quien gestiona la matricula cogiendo
	 * el nombre de Persona
	 */
	public String gestionarMatricula() {
		return "El Administrativo " + getNombre() + " va a gestionar tu matricula";
	}



	/**
	 * importamos el metodo trabjar() de la clase Persona donde nos devuelve
	 * un enunciado donde indica que administrativo va a realizar las tareas y 
	 * que tareas realiza cogiendo el nombre de Persona y tareas de Administrativo 
	 * 
	 */
	
	@Override
	public String trabajar() {
		return "El Administrativo " + getNombre() + " va a realizar estas tareas: " + tareas;
	}
	
	
	
	
}
