package ejercicio2;

import java.util.Scanner;
/**
 * 
 * @author Jose Antonio Gonz�lez Alc�ntara
 * 
 * Clase de Java de la TA05-Flujo de datos Ejercicio 2
 *
 */
public class Ej2 {

	public static void main(String[] args) {
		/*Declara un String que contenga tu nombre, 
		después muestra un mensaje de bienvenida por consola*/
		
		//Declaración del String que contine mi nombre
		String name = "Jose Antonio González Alcántara";
		
		//Mostramos mensaje de bienvenida
		System.out.println("Bienvenido " + name);
		
		
		/*No se pide implicitamente en el ejercicio,
		lo agrego por ampliación del ejercicio*/
		
		//Monstramos mensaje informativo
		System.out.println("Introduce tu nombre ");
		
		//Pedimos nombre que queremos introducir
		Scanner sc = new Scanner(System.in);
		
		//Asignamos a la variable que contiene el nombre
		name = sc.nextLine();
		sc.close();
		
		
		System.out.println("");
		
		//Mostramos mensaje de bienvenida
		System.out.println("Bienvenido " + name);

	}

}
