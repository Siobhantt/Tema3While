package tema3ejercicioswhile;
/*Las pruebas que he realizado han sido con los numeros :
 *56, 54 ,3, -8  y estos numeros me han dado como resultado : 37
 * 5,4,6,9,87,7,54,3,-9  y estos numeros me han dado como resultado :58
 * 
 * */
import java.util.Scanner;

public class Ejercicio3 {
/*Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir sumando.
 *  Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, antes de acabar,
 *   mostrará la media de los números positivos introducidos por el usuario.*/
	public static void main(String[] args) {
		
		//declaramos las variables, en num guardaremos lo que introducirá el usuario
		
		//en suma sumaremos todos los numeros y en media los dividiremos entre los que son
		
		int num;//en num guardaremos lo que introducirá el usuario
		int media = 0;//en media guardaremos la suma de los numeros entre la cantidad de numeros
		int suma = 0;// en la variable suma guardaremos los numeros introducidos por el usuario que se iran sumando
		
		//iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		
		//imprimimos el mensaje al usuario y en num guardamos lo que introduzca el usuario
		System.out.println("Por favor introduzca los numeros de los cuales quiere obtener la media(si quiere dejar de introducir numeros introduzca un negativo): ");
		num = lee.nextInt();
		
		//iniciamos un while en el que suma se va añadiendo a numero
		while (num>=0) {
			
			suma+=num;//a suma se le sumará el valor que tiene guardado mas el numero introducido por el usuario
			//y la media nos la darña la suma de los numeros entre los numeros
			media = (suma/num);
			//leemos de nuevo el numero del usuario
			num = lee.nextInt();
		}
		//imprimimos la media
		System.out.println("La media es: " + media);
		
		//cerramos el scanner
		lee.close();

	}

}
