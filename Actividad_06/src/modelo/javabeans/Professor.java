package modelo.javabeans;

public class Profesor extends Persona{
	
	private String competencias;

	
	public Profesor() {
		super();
	}

	


	public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}



	public String getCompetencias() {
		return competencias;
	}




	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}



	@Override
	public String toString() {
		return "Profesor [getNif()=" + getNif() + ", getNombre()=" + getNombre() + ", getDireccion()=" + getDireccion()
				+ ", getTelefono()=" + getTelefono() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", competencias=" + competencias + "]";
	}


	
	
	public String ponerNotas() {
		return "El Profesor " + getNombre() + " va ha corregir los examenes";
		
	}


	@Override
	public void trabajar() {
		System.out.println("El Profesor " + getNombre() + " va a impartir su clase");
	
		
	}
	
	
	
}