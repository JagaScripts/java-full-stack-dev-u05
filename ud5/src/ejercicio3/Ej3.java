package ejercicio3;

import javax.swing.JOptionPane;

/**
 * 
 * @author Jose Antonio Gonz�lez Alc�ntara
 * 
 * Clase de Java de la TA05-Flujo de datos Ejercicio 3
 *
 */
public class Ej3 {

	public static void main(String[] args) {
		/*Modifica la aplicación anterior,
		  para que nos pida el nombre que queremos introducir 
		  (recuerda usar JOptionPane)*/
		
		//Declaración de la variable name;
		String name;
		
		//Pedimos nombre al usuario
		name = JOptionPane.showInputDialog("Introduce tu nombre");
		
		//Emitimos mensaje de bienvenida
		JOptionPane.showMessageDialog(null, "Bienvenido " + name);
		
	}

}
