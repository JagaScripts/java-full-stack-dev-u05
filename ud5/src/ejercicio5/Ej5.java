package ejercicio5;

import javax.swing.JOptionPane;

/**
 * 
 * @author Jose Antonio Gonz�lez Alc�ntara
 * 
 * Clase de Java de la TA05-Flujo de datos Ejercicio 5
 *
 */
public class Ej5 {

	public static void main(String[] args) {
		/*Lee un número por teclado e indica
		  si es divisible entre 2 (resto = 0).
		  Si no lo es , también debemos indicarlo*/
		
		String texto;
		int numero;
		int resto;
		
		//Pedimos número
		texto = JOptionPane.showInputDialog("Introduce el radio");
		
		//Parseamos a número
		numero = Integer.parseInt(texto);
		
		//Obtenemos el resto con el modulo
		resto = numero % 2;
		
		//Comprobamos si es dvisible entre 2 resto = 0
		if (resto == 0) {
			//Mostramos que si que es divisible por 2
			JOptionPane.showMessageDialog(null, "El número" + numero + " SI es divisible ente 2");
		} else {
			//Mostramos que no que es divisible por 2
			JOptionPane.showMessageDialog(null, "El número" + numero + " NO es divisible ente 2");
		}
		

	}

}
