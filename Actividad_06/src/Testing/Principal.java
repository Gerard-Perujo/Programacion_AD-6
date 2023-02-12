package Testing;

import modelo.javabeans.Administrativo;
import modelo.javabeans.Alumno;
import modelo.javabeans.Profesor;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Se crean los objetos de Administrativo, Alumno y Profesor
		 */
		Administrativo admin = new Administrativo("123456789G", "Mariano García", "Calle Londres, 39", "666778899", "Papeleo");
		Alumno alu = new Alumno("987654321U", "Pablo Gomez", "Calle Praga, 89", "777889966", "Segundo de Bachillerato");
		Profesor profe = new Profesor("567891234M", "Alexander Jimenez", "Calle Amsterdam, 234", "888996677", "Ingles");
		
		/*
		 * Se ejecuta el metodo toString y el metodo trabajar para cada uno
		 */
		System.out.println(profe);
		System.out.println(profe.trabajar());
		System.out.println(" ");
		System.out.println(alu);
		System.out.println(alu.trabajar());
		System.out.println(" ");
		System.out.println(admin);
		System.out.println(admin.trabajar());
	
		System.out.println(" ");
		
		/*
		 * Se ejecuta el metodo llamar para que el alumno llame al profesor
		 */
		System.out.println(alu.llamar(profe));
		System.out.println(" ");
		
		/*
		 * Se ejecuta el método ponerNotas() del objeto Profesor.
		 */
		System.out.println(profe.ponerNotas());
		
		/*
		 * Se ejecuta el método hacerExamen() del objeto Alumno.
		 */
		System.out.println(alu.hacerExamen());
		
		/*
		 * Se ejecuta el método gestionarMatricula() del objeto Administrativo.
		 */
		System.out.println(admin.gestionarMatricula());
	}

}
