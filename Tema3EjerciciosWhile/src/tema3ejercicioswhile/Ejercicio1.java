package tema3ejercicioswhile;
/*Las pruebas que he realizado han sido con los numeros :
 * 4,5,6,7,23, -6 y estos numeros me han dado como resultado :23
 * 
 * 
 * */
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Declaramos las variables donde suma será donde guardaremos la suma final y 
		 * num sera donde guardaremos el numero introducido por el usuario*/ 
		int suma =0;
		int num =0;
		
		//declaramos el scanner
		Scanner lee = new Scanner(System.in);
		
		//Leemos el numero del usuario y lo almacenamos en num
		System.out.println("Por favor introduzca los numeros a sumar (si quiere dejar de sumar introduzca un numero negativo): ");
		num=lee.nextInt();
		
		//iniciamos un while donde la condicion sera que num sea mayor o igual a 0
		
		while(num>=0) {
			//si se cumple a condicion en suma se guardará lo que introduzca el usuario
			suma +=num;
			//volveremos a leer lo que introduzca el usuario
			num = lee.nextInt();	
		}
			//se imprime la suma total de todo lo que ha introducido el usuario
		System.out.println("La suma de todos los numeros introducidos es: " + suma);
		
		//cerramos el scanner
		lee.close();
	}

}
