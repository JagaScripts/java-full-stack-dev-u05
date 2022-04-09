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
		
		final String CONTRASENA = "1234";
		int intentos = 3; 
		String entradaTeclado;
		boolean acierto = false;
		boolean cancel = false;
		
		do {
			
			//Pedimos la contraseña
			entradaTeclado = JOptionPane.showInputDialog("Introduce la contraseña tienes " + intentos + " intentos");
			
			if (entradaTeclado != null) {
				
				if (entradaTeclado.equals(CONTRASENA)) {
					
					acierto = true;
					
				}else {
					
					intentos--;
										
				}
			}else {
				
				acierto = false;
				
			}
			
		} while (intentos > 0 && acierto == false && entradaTeclado != null);
		
		if(acierto == true) {
			
			JOptionPane.showMessageDialog(null,"Enhorabuena");
			
		}
		if(entradaTeclado == null){
			
			JOptionPane.showMessageDialog(null,"La plicación se cerrara");
		}

	}

}
