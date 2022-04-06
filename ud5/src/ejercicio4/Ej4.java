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
		String texto;
		double radio;
		
		//Pedimos nombre al usuario
		texto = JOptionPane.showInputDialog("Introduce el radio");
		
		//Parseamos a double el texto para que sea un double
		radio = Double.parseDouble(texto);
		
		//Calculamos el area del circulo
		double area;
		area  = PI * Math.pow(radio, 2);
		
		//Mostramos resultado en pantalla
		JOptionPane.showMessageDialog(null, "El area del circulo con radio " + (int)radio + " es " + area);
		

	}

}
