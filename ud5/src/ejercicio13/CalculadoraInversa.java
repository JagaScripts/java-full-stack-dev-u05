package ejercicio13;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * @author Jose Antonio Gonz�lez Alc�ntara
 * 
 * Clase de Java de la TA05-Flujo de datos Ejercicio 13
 *
 */
public class CalculadoraInversa {

	public static void main(String[] args) {
		/*Crea una aplicación llamada CalculadoraInversa, nos pedirá
		  2 opreandos (int) y un signo aritmético (String)
		  según este último se realizara la operación correspondiente.
		  Al final mostrara el resultado en un cuadro de dialogo*/
		
		int operador1;
		int operador2;
		char signo;

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el operador 1 ");
		operador1 = (int) sc.nextInt();
		System.out.println("Introduce el operador 2 ");
		operador2 = (int) sc.nextInt();
		System.out.println("Introduce el signo ");
		signo = (char) sc.next().charAt(0);
		
		switch (signo) {
		case '+':
			System.out.println("El resultado de la operación es " + (operador1 + operador2));
			break;
		case '-':
			System.out.println("El resultado de la operación es " + (operador1 - operador2));
			break;
		case '*':
			System.out.println("El resultado de la operación es " + (operador1 * operador2));
			break;
		case '/':
			System.out.println("El resultado de la operación es " + (operador1 / operador2));
			break;
		case '^':
			System.out.println("El resultado de la operación es " + (operador1 ^ operador2));
			break;
		case '%':
			System.out.println("El resultado de la operación es " + (operador1 % operador2));
			break;
		default:
			System.out.println("El signo introducido no es un operando");
			break;
		}
		
		sc.close();
		
	}

}
