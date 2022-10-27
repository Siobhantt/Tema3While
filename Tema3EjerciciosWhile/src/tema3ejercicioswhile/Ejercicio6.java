package tema3ejercicioswhile;

import java.util.Scanner;

public class Ejercicio6 {
/*Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos de un centro educativo.
 *  Se introducirán datos hasta que uno de ellos sea negativo, y se mostrará:
 *  la suma de todas las edades introducidas, la media, el número de alumnos y cuántos son mayores de edad.*/
	public static void main(String[] args) {
		
		//declaramos las variables
		int edades=0;//aqui guardaremos las edades que introducirá el usuario
		int mediaEdades=0; 
		int numAlumnos=0;//este será el contador donde por cada edad introducida se suma uno al contador
		int aMayores=0;// aqui guardaremos las veces que el usuario introduzca 18
		int numUser =0;
		//Inicamos el scanner
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Si quiere parar introduzca un numero negativo.");
		//imprimimos la solicitud al usuario
		System.out.println("Por favor introduzca introduca la edad de los alumnos: ");

		numUser = lee.nextInt();
		
		//Iniciamos un while 
		
		while (numUser>0) {//la condicion será que el numero introducido sea mayor que 0
			
			edades+=numUser;//El numero introducido se sumará a la variable edades
			numAlumnos++;//el contador de numero de alumnos se irá incrementando en uno
			
			if (numUser>=18) {//cuando la edad introducida sea mayor o igual a 18 se añade 1 al contador aMayores
				aMayores++;//
			}
			
			numUser = lee.nextInt();//leemos de nuevo el numero introducido para no entrar en bucle infinito
		}
		
		mediaEdades = (edades/numAlumnos);//realizamos la media y la guardamos en la variable
		
		//imprimimos los resultados
		System.out.println("La suma de todas la edades es: " + edades);
		System.out.println("La media de los alumnos es : " + mediaEdades);
		System.out.println("La cantidad de alumnos mayores de edad es: " + aMayores);
		
		//cerramos el scanner
		lee.close();

	}

}
