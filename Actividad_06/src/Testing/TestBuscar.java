package Testing;

import java.util.ArrayList;

import modelo.dao.Instituto;
import modelo.javabeans.Administrativo;
import modelo.javabeans.Alumno;
import modelo.javabeans.Persona;
import modelo.javabeans.Profesor;

public class TestBuscar {

	public static void main(String[] args) {
		
		    
		        // CREAMOS UN OBJETO DE LA CLASE INSTITUTO
		
		        Instituto instituto = new Instituto("Instituto de Enseñanza");

		        
		        // PRUEBA DE DAR DE ALTA A PERSONAS. 
		        
		        // Creamos algunas personas y las damos de alta en el instituto
		        
		        System.out.println("RESULTADO DE PRUEBA DAR DE ALTA PERSONAS Y MOSTRARLAS");
		        
		        Persona alumno1 = new Alumno("11111111A", "Angel", "Calzado", "111111111", "2º de Bachillerato");
		        Persona alumno2 = new Alumno("22222222B", "Ana", "García", "222222222", "4º de la ESO");
		        Persona profesor1 = new Profesor("33333333C", "Ron", "Gómez", "333333333", "Física");
		        Persona profesor2 = new Profesor("44444444D", "Ruth", "López", "444444444", "Lengua");
		        Persona administrativo1 = new Administrativo("55555555E", "Monica", "Aranda", "555555555", "Secretaría");
		        Persona administrativo2 = new Administrativo("66666666F", "José", "González", "666666666", "Administración");
		        
		        
		        instituto.altaPersona(alumno1);
		        instituto.altaPersona(alumno2);
		        instituto.altaPersona(profesor1);
		        instituto.altaPersona(profesor2);
		        instituto.altaPersona(administrativo1);
		        instituto.altaPersona(administrativo2);
		        
		        /*
		         * AHORA PARA COMPROBAR QUE LAS PERSONAS QUE HEMOS CREADO SE HAN DADO DE ALTA CORRECTAMENTE 
		         * VAMOS A PROBAR EL METODO BUSCARTODAS QUE ME DEVUELVE LA LISTA DE TODAS LAS PERSONAS
		         */
		        // CON EL SIGUIENTE FOR SE MUESTRAN TODAS LAS PERSONAS TANTO LAS QUE YA ESTABAN CREADAS COMO LAS QUE SE HAN DADO DE ALTA NUEVAS.
		        // (System.out.println(instituto.buscarTodas()); //En la consola, se muestran todas las personas sin salto de línea)
		        
		        System.out.println(" ");
		        
		        ArrayList<Persona> listaPersonas = instituto.buscarTodas();
		        for (Persona persona : listaPersonas) {
		            System.out.println(persona);
		          
		        }

		        
		        System.out.println("----------------------------------------------------------------------------");
		        
		        
		        // PRUEBA PARA ELIMINAR UNA PERSONA 
		        
		        System.out.println("RESULTADO DE PRUEBA ELIMINAR PERSONA");
		        
		        boolean eliminado = instituto.eliminarPersona(alumno1);
		        System.out.println("¿Se ha eliminado la persona? " + eliminado );
		        
		        
		        System.out.println("----------------------------------------------------------------------------");
		        
		        
		        // BUSCAR PERSONA POR NIF 
		        
		        System.out.println("RESULTADO DE PRUEBA BUSCAR PERSONA POR NIF");
		        
		        /*Este es el nif de alumno1, puesto que ha sido eliminado, 
		          y asi comprobamos que se ha eliminado correctamente puesto que la persona no ha sido encontrada 
		         */
		         Persona personaBuscada = instituto.buscarPersona("11111111A");  
		         if (personaBuscada != null) {
		        	 System.out.println("Persona encontrada: " + personaBuscada);
		        	} else {
		        		System.out.println("La persona no ha sido encontrada.");
		        	}
		         
		         Persona personaBuscada1 = instituto.buscarPersona("66666666F");  
		         if (personaBuscada1 != null) {
		        	 System.out.println("Persona encontrada: " + personaBuscada1);
		        	} else {
		        		System.out.println("La persona no ha sido encontrada.");
		        	}
		         
		         Persona personaBuscada2 = instituto.buscarPersona("05723323K");  
		         if (personaBuscada2 != null) {
		        	 System.out.println("Persona encontrada: " + personaBuscada1);
		        	} else {
		        		System.out.println("La persona no ha sido encontrada.");
		        	}
		         
		         System.out.println("----------------------------------------------------------------------------");
			     
		         
		         // PRUEBA DE BUCAR PERSONAS POR TIPO. 
		         
		         System.out.println("RESULTADO DE PRUEBA BUSCAR POR TIPO");
		 
		        // Buscamos los alumnos
		        ArrayList<Persona> alumnos = instituto.buscarPersonaPorTipo("Alumno");
		        System.out.println("Alumnos:");
		        for (Persona alumno : alumnos) {
		            System.out.println(alumno.getNombre());
		        }

		        // Buscamos los profesores
		        ArrayList<Persona> profesores = instituto.buscarPersonaPorTipo("Profesor");
		        System.out.println("Profesores:");
		        for (Persona profesor : profesores) {
		            System.out.println(profesor.toString()); 
		            // En vez de imprimir solo el nombre, podria ponerse toString para que imprima el resto de datos de cada persona
		        }

		        // Buscamos los administrativos
		        ArrayList<Persona> administrativos = instituto.buscarPersonaPorTipo("Administrativo");
		        System.out.println("Administrativos:");
		        for (Persona administrativo : administrativos) {
		            System.out.println(administrativo.getNombre());
		        }
		        
		        
		    }
	
		


	

}
