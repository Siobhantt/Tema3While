package tema3ejercicioswhile;
/*Las pruebas que he realizado han sido con los numeros :
 *6,7,8,3,4,5, -1 y estos numeros me han dado como resultado: 6*/
import java.util.Scanner;

public class Ejercicio2 {
/*Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir contando
 *Cuando el usuario no quiera insertar más números, introducirá un número negativo 
 *y el algoritmo, antes de acabar, mostrará la cantidad de números positivos introducidos por el usuario.*/
	public static void main(String[] args) {
	
		//declaramos las variable num donde guardaremos lo que va introduciendo el usuario, la inicamos a 0 para que no de error
		//en cuenta guardaremos que si el usuario introduce un entero se incremente en 1 
		int num = 0;
		int cuenta =0;
		
		//Inicamos el escanner
		Scanner lee = new Scanner(System.in);
		
		//Imprimimos la solicitud y la guardamos en la variable num
		System.out.println("Por favor introduzca los numeros que quiere guardar: ");
		num = lee.nextInt();
		
		
		while(num>=0) {//Iniciamos un while donde guardaremos que si el numero es igual o mayor a 0
			
			//a cuenta se le incrementará uno
			cuenta ++;
			
			//volvemos a leer el numero del usuario
			num = lee.nextInt();
		}
		
		//Imprimimos la cuenta de los numeros.
			System.out.println("La cantidad introducida de numeros es: " + cuenta);
	
			//cerramos el scanner
			lee.close();
	}

}
