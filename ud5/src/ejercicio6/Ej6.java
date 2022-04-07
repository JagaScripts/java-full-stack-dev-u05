package ejercicio6;

import javax.swing.JOptionPane;

/**
 * 
 * @author Jose Antonio Gonz�lez Alc�ntara
 * 
 * Clase de Java de la TA05-Flujo de datos Ejercicio 6
 *
 */
public class Ej6 {

	public static void main(String[] args) {
		/*Lee un número por teclado que pida el precio
		  de un producto (puede tener decimales) y
		  calcule el precio final con IVA. El IVA sera una constante que sera del 21%*/
		
		//El IVA sera una constante que sera del 21%
		final double IVA = 0.21;
		
		//Pedimos precio del producto
		String cadena = JOptionPane.showInputDialog("Introduce el precio del producto (puede tener decimales");
		
		//Parseamos a double
		double precioProducto = Double.parseDouble(cadena);
		
		//calculamos el precio con IVA
		double precioConIVA = precioProducto * (1 + IVA);
		
		//Mostramos el precio del producto con IVA incluido
		JOptionPane.showMessageDialog(null, "El precio final del producto es " + precioConIVA );
		

	}

}
