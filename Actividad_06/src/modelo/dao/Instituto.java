package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Administrativo;
import modelo.javabeans.Alumno;
import modelo.javabeans.Persona;
import modelo.javabeans.Profesor;

	// CREO LA CLASE INSTITUTO IMPLEMENTANDO LA INTERFAZ INSTITUTODAO
public class Instituto implements InstitutoDao {
	
	//CREO LOS DATOS PRIVADOS: el nombre y un arraylist con persona que es la clase de la que heredo para introducir los datos
	
	private String nombre; 
	private ArrayList<Persona>listaPersonas;
	
	
	//CREO CONSTRUCTOR SOLO CON EL ATRIBUTO NOMBRE 
	
	public Instituto(String nombre) {
		//super();
		this.nombre = nombre;
		listaPersonas = new ArrayList<>();
		cargarDatos(); 
	} 
	
	// CREO EL MÉTODO CARGAR DATOS CON EL ARRAYLIST DE PERSONAS 
	
	private void cargarDatos() {
		
		listaPersonas.add(new Administrativo("05728723L", "Diego", "Calle Ochoa", "654785447", "Gesion de documentos")); 
		listaPersonas.add(new Administrativo("05557852M", "Clara", "Calle Nieves", "687452211", "Atencion al cliente")); 
		listaPersonas.add(new Alumno("05857112N", "Alberto", "Calle Santisimo", "661588322", "Auxiliar de oficina")); 
		listaPersonas.add(new Alumno("05698223K", "Ana", "Calle Aulagueros", "688224445", "Tecnico de mantenimiento")); 
		listaPersonas.add(new Profesor("07198223P", "Carlos", "Calle del pez", "651477789", "Gestion de empresas")); 
		listaPersonas.add(new Profesor("07224566L", "Maria", "Calle Minas", "654321147", "Comunicacion")); 
		
	}

	
	
	
	// SE IMPLEMENTAN LOS METODOS DE INSTITUTODAO

	@Override //DAR DE ALTA PERSONAS
	
	/* Si la persona que me pasan ya esta en la lista entonces no la damos de alta e imprime que no ha sido posible dar de alta
	 * sin embargo si la persona que me pasan no está en la lista entonces añade la persona a la listaPersonas e imprime que ha sido dada de alta 
	 */
	public boolean altaPersona(Persona persona) {
		if (listaPersonas.contains(persona)) {
			System.out.println("No se puede dar de alta");
			return false;
			
		}else {
			System.out.println("Persona dada de alta");
			return listaPersonas.add(persona);	
		}
			 			
	}
	
	
	
	@Override //ELIMINAR PERSONAS
	
	/* Si la persona que me pasan está en la listaPersonas, el metodo remove se encarga de eliminarla 
	 * y devuelve true (si la persona que le indicamos ha sido eliminada) o false (si la persona no ha sido posible eleiminarla)
	 */
	
	public boolean eliminarPersona(Persona persona) {
		return listaPersonas.remove(persona); 
	}
	
	
	
	@Override //BUSCAR PERSONAS POR DNI
	
	/*
	 * En este metodo me pasan el DNI de una persona y el for-each recorre la lista de personas 
	 * y compara el DNI de cada persona con el NIF que me pasan. Si se encuentra una persona cuyo DNI coincide 
	 * con el DNI buscado, devuelve los datos de esa persona. Si ninguna persona tiene el DNI buscado, el método devuelve null.
	 */
	public Persona buscarPersona(String nif) {
		    for (Persona persona : listaPersonas) {
		        if (persona.getNif().equals(nif)) {
		            return persona;
		        }
		    }
		    return null;

	}
	
	
	
	@Override  //BUSCAR PERSONAS POR DNI
	
	/*
	 * Devuelve una lista de todas las personas que se encuentran en la lista "listaPersonas"
	 */
	
	public ArrayList<Persona> buscarTodas() {
		return listaPersonas;
	}
	
	
	
	@Override //BUSCAR PERSONAS POR TIPO: ALUMNO, PROFESOR o  ADMINISTRATIVO
	
	public ArrayList<Persona> buscarPersonaPorTipo(String tipo) {	
    ArrayList<Persona> resultado = new ArrayList<>();
    for (Persona persona : listaPersonas) {
        if (tipo.equals("Alumno") && persona instanceof Alumno) {
            resultado.add(persona);
        } else if (tipo.equals("Profesor") && persona instanceof Profesor) {
            resultado.add(persona);
        } else if (tipo.equals("Administrativo") && persona instanceof Administrativo) {
            resultado.add(persona);
        }
    }
    return resultado;
	}

	
	
	
}
