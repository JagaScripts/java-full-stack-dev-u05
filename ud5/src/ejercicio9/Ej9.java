package ejercicio9;
/**
 * 
 * @author Jose Antonio Gonz�lez Alc�ntara
 * 
 * Clase de Java de la TA05-Flujo de datos Ejercicio 9
 *
 */
public class Ej9 {

	public static void main(String[] args) {
		/*Muestra los números del 1 al 100 (ambos incluidos).
		  divisibles entre 2 y 3*/
		
		int modDos;
		int modTres;
		
		for (int i = 1; i <= 100 ; i++) {
			
			modDos = i % 2;
			modTres = i % 3;
			if (modDos == 0 && modTres == 0) {
				System.out.println("Número divisible entre 2 y 3 : " + i);
			}
			
		}


	}

}
