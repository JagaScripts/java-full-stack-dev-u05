package ejercicio4;

import javax.swing.JOptionPane;

/**
 * 
 * @author Jose Antonio Gonz�lez Alc�ntara
 * 
 * Clase de Java de la TA05-Flujo de datos Ejercicio 4
 *
 */
public class Ej4 {

	public static void main(String[] args) {
		/*Haz una aplicación que calcule el área de un circulo (pi*R²).
		  El radio se pedirá por teclado
		  (Recuerda pasar de String a docuble con Double.parseDouble).
		  Usa la constante PI y el método pow de Math*/
		
		//Uso la constante PI de Math y la asigno a mi constante PI
		final double PI = Math.PI;
		
		//Declaramos la variable que almacena el texto introducido por el usuario y el radio
		String entradaTeclado;
		double radioCirculo;
		double areaCirculo;
		boolean esNumerico;
		
		do {
		
			//Pedimos nombre al usuario
			entradaTeclado = JOptionPane.showInputDialog("Introduce el radio, el valor tienen que ser númerico, el separador decimal es el . (punto)");
		
			//Si cancelamos el pane
			
			if (entradaTeclado != null) {
				
				//Como aún no hemos visto manejo de excepciones
				//Compruebo mediante el metodo matches del tipo String si lo introducido es un número
				esNumerico = entradaTeclado.matches("[+-]?\\d*(\\.\\d+)?");
				
				if (esNumerico) {
					
					//Parseamos a double el texto para que sea un double
					radioCirculo = Double.parseDouble(entradaTeclado);
					
					//Calculamos el area del circulo
					areaCirculo  = PI * Math.pow(radioCirculo, 2);
					
					//Mostramos resultado en pantalla
					JOptionPane.showMessageDialog(null, "El area del circulo con radio " + radioCirculo + " es " + areaCirculo);
					
				}else {
					
					JOptionPane.showMessageDialog(null, "No has introducido un número valido");
					
				}
				
			}else {
				
				esNumerico = false;
			}
					
		}while(!esNumerico && entradaTeclado != null);
		
		JOptionPane.showMessageDialog(null, "La plicación se cerrara");
		

	}

}
