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
		String entradaTeclado;
		double precioProducto;
		double precioConIVA;
		boolean esNumerico;
		
		do {
			
			
			//Pedimos precio del producto
			entradaTeclado = JOptionPane.showInputDialog("Introduce el precio del producto "
					+ "el valor tienen que ser númerico, el separador decimal es el . (punto)\"");
			
		
			//Si cancelamos el Pane		
			if (entradaTeclado != null) {
				
				//Como aún no hemos visto manejo de excepciones
				//Compruebo mediante el metodo matches del tipo String si lo introducido es un número
				esNumerico = entradaTeclado.matches("[+-]?\\d*(\\.\\d+)?");
				
				if (esNumerico) {
									
					//Parseamos a double
					precioProducto = Double.parseDouble(entradaTeclado);
					
					//calculamos el precio con IVA
					precioConIVA = precioProducto * (1 + IVA);
					
					//Mostramos el precio del producto con IVA incluido
					JOptionPane.showMessageDialog(null, "El precio final del producto es " + precioConIVA );
					
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
