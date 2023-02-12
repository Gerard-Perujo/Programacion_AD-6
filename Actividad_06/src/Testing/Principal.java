package Testing;

import modelo.javabeans.Administrativo;
import modelo.javabeans.Alumno;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Se crean los objetos de Administrativo, Alumno y Profesor
		 */
		Administrativo admin = new Administrativo("123456789G", "Mariano García", "Calle Londres, 39", "666778899", "Papeleo");
		Alumno alu = new Alumno("987654321U", "Pablo Gomez", "Calle Praga, 89", "777889966", "Segundo de Bachillerato");
		

	}

}
