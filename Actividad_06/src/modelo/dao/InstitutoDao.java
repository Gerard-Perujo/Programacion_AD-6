package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Persona;

// SE CREA LA INTERFAZ DE INSTITUTO Y SE AÑADEN LOS METODOS 

public interface InstitutoDao { 
	
	boolean altaPersona(Persona persona); 		// METODO PARA DAR DE ALTA A PERSONAS: SE IMPORTA PERSONA
	boolean eliminarPersona(Persona persona);   // METODO PARA ELIMINAR A PERSONAS
	Persona buscarPersona (String nif); 		// METODO PARA BUSCAR PERSONAS POR EL Nº DE IDENTIDAD
	ArrayList<Persona>buscarTodas(); 			// SE IMPORTA ARRAYLIST
	ArrayList<Persona> buscarPersonaPorTipo(String nif);
	
	 


}
