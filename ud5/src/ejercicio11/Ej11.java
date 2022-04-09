package ejercicio11;

import javax.swing.JOptionPane;

/**
 * 
 * @author Jose Antonio Gonz�lez Alc�ntara
 * 
 * Clase de Java de la TA05-Flujo de datos Ejercicio 11
 *
 */
public class Ej11 {

	public static void main(String[] args) {
		/*Crea una aplicación que nos pida un día de la semana
		 y que nos diga si es un dia laboral o no. Usa switch*/
		
		String entradaTeclado;
		
		do {
			
			//Pedimos dia de la semana
			entradaTeclado = JOptionPane.showInputDialog("Introduce el dia de la semana");
		
			//Si cancelamos el pane
			
			if (entradaTeclado != null) {
				
				entradaTeclado = entradaTeclado.toLowerCase();
					
					switch (entradaTeclado) {
						case "lunes":
							JOptionPane.showMessageDialog(null,"El " + entradaTeclado + " es un día laboral");
							break;
						case "martes":
							JOptionPane.showMessageDialog(null,"El " + entradaTeclado + " es un día laboral");
							break;
						case "miercoles":
							JOptionPane.showMessageDialog(null,"El " + entradaTeclado + " es un día laboral");
							break;
						case "jueves":
							JOptionPane.showMessageDialog(null,"El " + entradaTeclado + " es un día laboral");
							break;
						case "viernes":
							JOptionPane.showMessageDialog(null,"El " + entradaTeclado + " es un día laboral");
							break;
						case "sabado":
							JOptionPane.showMessageDialog(null,"El " + entradaTeclado + " no es un día laboral");
							break;
						case "domingo":
							JOptionPane.showMessageDialog(null,"El " + entradaTeclado + " no es un día laboral");
							break;
						default:
							JOptionPane.showMessageDialog(null,"El " + entradaTeclado + " no se si es un día laboral");
							break;
					}
			}
					
		}while(entradaTeclado != null);
		
		JOptionPane.showMessageDialog(null, "La plicación se cerrara");
		
	}

}
