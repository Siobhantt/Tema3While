package tema3ejercicioswhile;
/*Las pruebas que he realizado han sido con los numeros :
 *6,54,-70,-7,-8, 0 y estos numeros me han dado como resultado:*/
import java.util.Scanner;

public class Ejercicio4 {
/*Escribe un programa que vaya pidiendo al usuario números y muestre por pantalla si el número es par o impar 
 * (indistintamente que sea positivo o negativo).
 *  El algoritmo terminará cuando el usuario introduzca el número cero.*/
	public static void main(String[] args) {
		
		//declaramos las variables
		int numUser; // en esta variable guardaremos lo que va a introducir el usuario
		 
		//Inicamos el Scanner 
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Si quiere dejar de introducir numeros introduzca 0.");
		
		//imprimimos la solicitud al usuario y y guardamos lo que va a introducir en la variable numUser
		System.out.println("Por favor introduzca los numeros a verificar: ");
		numUser = lee.nextInt();
		
		
		/*Iniciamos un while donde estableceremos donde si el numero es distinto de 0 */

		while (numUser!=0) {
			
			if (numUser%2 == 0) {//iniciamos un if dentrop del while para verificar que si el %2 es igual a 0 el numero es par
				System.out.println("El numero es par!");
			}
			else {//en caso contrario imprimimos que es impar
				System.out.println("El numero es impar!");
			}
			//leemos de nuevo el numero del usuario para evitar entrar en infinity loop
			numUser = lee.nextInt();
		}
	//cerramos el Scanner
		lee.close();
	}

}
