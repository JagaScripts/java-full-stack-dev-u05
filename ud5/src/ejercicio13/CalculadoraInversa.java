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
		boolean esNumerico;
		boolean esSignoValido;
		String entradaTeclado;

		
		Scanner scanner = new Scanner(System.in);
		
			do {
				
				System.out.println("Introduce el operador 1, que sea un múmero entero");
				entradaTeclado = scanner.nextLine();
				esNumerico = entradaTeclado.matches("-?\\d+");
				if (!esNumerico) {
					System.out.println("Porfavor el operador ha de ser entero");
				}
				
			} while (!esNumerico);
		
		operador1 = Integer.parseInt(entradaTeclado);
		
		do {
			
			System.out.println("Introduce el operador 2, que sea un múmero entero");
			entradaTeclado = scanner.nextLine();
			esNumerico = entradaTeclado.matches("-?\\d+");
			if (!esNumerico) {
				System.out.println("Porfavor el operador ha de ser entero");
			}
			
		} while (!esNumerico);
		
		operador2 = Integer.parseInt(entradaTeclado);
		
		do {
			
			System.out.println("Introduce un signo de operando válido entre +, -, x, /, % y ^");
			
			entradaTeclado = scanner.nextLine();

			esSignoValido = (entradaTeclado.length() == 1);
			
			if (esSignoValido) {
				
				signo = (char) entradaTeclado.charAt(0);
				
				switch (signo) {
				case '+':
					System.out.println("El resultado de la operación es " + (operador1 + operador2));
					break;
				case '-':
					System.out.println("El resultado de la operación es " + (operador1 - operador2));
					break;
				case 'x':
					System.out.println("El resultado de la operación es " + (operador1 * operador2));
					break;
				case '/':
					System.out.println("El resultado de la operación es " + (operador1 / operador2));
					break;
				case '^':
					System.out.println("El resultado de la operación es " + (int) Math.pow(operador1, operador2));
					break;
				case '%':
					System.out.println("El resultado de la operación es " + (operador1 % operador2));
					break;
				default:
					System.out.println("El signo introducido no es un operando válido");
					esSignoValido = false;
					break;
				}
				
			}else {
				
				System.out.println("Porfavor un operando válido, tienes que ser un solo caracter");
				
			}
			
		} while (!esSignoValido);
		
		scanner.close();		
	}

}
