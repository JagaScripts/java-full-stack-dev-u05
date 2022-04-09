package ejercicicio10;

import javax.swing.JOptionPane;

/**
 * 
 * @author Jose Antonio Gonz�lez Alc�ntara
 * 
 * Clase de Java de la TA05-Flujo de datos Ejercicio 10
 *
 */
public class Ej10 {

	public static void main(String[] args) {
		/*Realiza una aplicación que nos pida
		  un número de ventas a introducir, 
		  después nos pedirá tantas ventas se hayan indicado
		  al final mostrara loa suma de todas las ventas
		  piensa que es lo que se repite y lo que no*/
		
		//Declaramos para pedir los datos
		String entradaTeclado;
		
		do {
		
			//Pedimos el número de ventas a introducir
			entradaTeclado = JOptionPane.showInputDialog("Introduce las ventas que vas a realizar");
			
			if (entradaTeclado == null) {
				entradaTeclado = "0";
			}
			
		} while (entradaTeclado.isEmpty());
		
		//Parseamos a int
		int cantidadVentas = Integer.parseInt(entradaTeclado);
		
		/*Comprobamos si el número de ventas es distinto que 0
		  no tiene sentido no hacer ventas*/
		
		if (cantidadVentas != 0) {
			Double precioVenta;
			Double precioAcumulado = (double) 0;
			int index = 1;
			//Iteramos para pedir las ventas
			
				do {
					
					//Pedimos las ventas a introducir
					entradaTeclado = JOptionPane.showInputDialog("Introduce la cantidad de la venta número " + index);
					
					//Comprueba que haya introducido algun dato
					if (entradaTeclado == null ) {
						entradaTeclado = "0";
						
					} else if (!entradaTeclado.isEmpty()) {
												
						//Parseamos a double
						precioVenta = Double.parseDouble(entradaTeclado);
					
						//Acumulamos los precios introducidos
						precioAcumulado += precioVenta;
						
						index++;
						
					}

				} while (entradaTeclado != "0" && index <= cantidadVentas);
			
			//Mostramos la suma de todas la ventas
			if (entradaTeclado != "0") {
				JOptionPane.showMessageDialog(null, "Las ventas suman " + precioAcumulado);
			}
			
		} else {
			
			//Si es 0 terminamos la aplicación
			//Mostramos la despedida
			JOptionPane.showMessageDialog(null, "Ok sin ventas");

		}
		
		JOptionPane.showMessageDialog(null,"Se cerrara la aplicación");
	}
}
