package ejercicio12;

import javax.swing.JOptionPane;

/**
 * 
 * @author Jose Antonio Gonz�lez Alc�ntara
 * 
 * Clase de Java de la TA05-Flujo de datos Ejercicio 12
 *
 */
public class Ej12 {

	public static void main(String[] args) {
		/*Escribe una aplicación con un String,
		  que contenga una contraseña cualquiera.
		  Después se te pedirá que introduzcas 
		  la contraseña, con 3 intentos.
		  Cuando aciertes ya no pedira mas la contraseña
		  y mostrara un mensaje diciendo "Enhorabuena".
		  Piensas bien en la condición de salida
		  (3 intentos y si aciertas sale, aunque le queden intentos)*/
		
		final String PASSWORD = "1234";
		int attempts = 3; 
		String input;
		boolean match = false;
		boolean cancel = false;
		
		do {
			
			//Pedimos la contraseña
			input = JOptionPane.showInputDialog("Introduce la contraseña tienes " + attempts + " intentos");
			
			if (input != null) {
				
				if (input.equals(PASSWORD)) {
					
					match = true;
					
				}else {
					
					attempts--;
										
				}
				
			}else {
				
				cancel = true;
			}
			
		} while (attempts > 0 && match == false && cancel == false);
		
		if(match == true) {
			
			JOptionPane.showMessageDialog(null,"Enhorabuena");
			
		}
		if(cancel == true){
			
			JOptionPane.showMessageDialog(null,"As cancelado");
		}

	}

}
