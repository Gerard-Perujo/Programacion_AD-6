package modelo.javabeans;

/*
 * Tal como se especifica en el enunciado, se declara la clase abstracta.
 */
public abstract class Persona {
	/*
	 * Se crean los atributos privados de la clase, que no son protected.
	 */
	private String nif, nombre, direccion, telefono;

	/*
	 * Se generan los constructores, uno con todos los parametros y otro sin nada.
	 */
	public Persona(String nif, String nombre, String direccion, String telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public Persona() {
		super();
	}
	
	/*
	 * Se generan los getter and setter de todos los parametros desde source.
	 */

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/*
	 * Se genera toString
	 */
	
	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]";
	}
	
	/*
	 * Se crean los metodos propios, siendo trabajar abstracto
	 */
	public String llamar (Persona p) {
		return nombre + " llamando a " + p.getNombre();
	}
	

	public abstract String trabajar();
	
	
	

}
