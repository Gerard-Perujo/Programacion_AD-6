package modelo.javabeans;

public class Administrativo extends Persona{

	private String tareas;
	
	
	

	public Administrativo() {
		super();
	}
	


	public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}


	public String getTareas() {
		return tareas;
	}



	public void setTareas(String tareas) {
		this.tareas = tareas;
	}


	@Override
	public String toString() {
		return "Administrativo [getNif()=" + getNif() + ", getNombre()=" + getNombre() + ", getDireccion()="
				+ getDireccion() + ", getTelefono()=" + getTelefono() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", tareas=" + tareas + "]";
	}



	@Override
	public void trabajar() {
		System.out.println("El Administrativo " + getNombre() + " va a realizar estas tareas: " + tareas);
		
	}
	
	public String gestionarMatricula() {
		return "El Administrativo " + getNombre() + " va a gestionar tu matricula";
	}
	
	
	
	
}
