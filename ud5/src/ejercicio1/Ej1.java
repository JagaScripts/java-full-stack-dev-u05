package ejercicio1;
/**
 * 
 * @author Jose Antonio Gonz�lez Alc�ntara
 * 
 * Clase de Java de la TA05-Flujo de datos Ejercicio1
 *
 */
public class Ej1 {

	public static void main(String[] args) {
		/*Declara 2 variables numéricas (con el valor que desees),
		he indica cual es mayor de los dos.
		Si son iguales indicarlo también. 
		Ves cambiando los valores para comprobar que funciona*/
		
		//Declaración de dos variables numéricas A y B, asignación de valores
		int a = 23;
		int b = 16;
		int comprobaciones = 0;//Declaro una valiable para poder comprobar cambiado los valores
		
		//Mostramos el valor de las variables
		System.out.println("La varaiable A vale " + a + " y " + "la variable B vale " + b);
		
		/*Bucle do while que como minimo entrará y mostrará la condición cierta
		con los valores por defecto*/
		do {
						
			//Se evalúa la condición si la variable A es mayor que la B
			if (a > b) {
				
				//Si la condición es cierta A es mayor que B y se muestra por pantalla
				System.out.println("La variable A que vale " + a + " es mayor que B que vale " + b);
				
				//Se incrementa para indeicar que se a comprobado esta condición
				comprobaciones++;
				
				//Intecambiamos el valor de las varibles para que entre en otras condiciones
				int aux = a;
				a = b; 
				b = aux;
				
				//indicamos el cambio de de valores por consola
				System.out.println("Ahora la variable A vale " + a + " y la valiable B vale " + b);
				
				//Se evalúa la condición si la variable A es menor que la B
			} else if (a < b) {
				
				//Si la condición es cierta A es menor que B, y B mayor que A y se muestra por pantalla
				System.out.println("La variable B que vale " + b + " es mayor que A que vale " + a);
				
				//Se incrementa para indeicar que se a comprobado esta condición
				comprobaciones++;
				
				//Igualamos el valor de las varibles para que entre en otras condiciones
				a = b;
				
				//indicamos el cambio de de valores por consola
				System.out.println("Ahora la variable A vale " + a + " y la valiable B vale " + b);
				
				//Se evalúa la condición si la variable A es igual que la B
			} else if (a == b) {
				
				//Si la condición es cierta A es igual a B y se muestra por pantalla
				System.out.println("La variable A que vale " + a + " es igual a B que vale " + b);
				
				//Se incrementa para indeicar que se a comprobado esta condición
				comprobaciones++;
			}
			
		} while (comprobaciones < 3);
		
		System.out.println("No hay mas cambio de valores para comprobar que funciona");		

	}

}
