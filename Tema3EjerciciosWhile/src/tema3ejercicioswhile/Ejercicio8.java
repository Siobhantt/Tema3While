package tema3ejercicioswhile;

import java.util.Scanner;

public class Ejercicio8 {
/*Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es el árbol más alto.
Para ello se introducirá por teclado la altura (en centímetros) de cada árbol 
(terminando la introducción de datos cuando se utilice -1 como altura).
La aplicación debe devolver la altura del árbol más alto.*/
	public static void main(String[] args) {
		//Declaramos las variables
		 int alturaIntroducida=0; //aqui guardaremos lo que el usuario nos va a introducir
		
		 int alturaMax=0;//aqui guardaremos el numero maximo de lo introducido

		 //Inciamos el scanner
		 Scanner lee = new Scanner (System.in);
		 
		 //Imprimimos la solicitud
		 System.out.println("Por favor introduzca la altura del arbol en centimetros: ");
		 System.out.println("Si quiere detenerse introduzca -1.");
		 
		alturaMax = lee.nextInt();//Al principio el primero numero leido será siempre el maximo, puesto que es el primero
		 
		 /*iniciamos un while donde mientras el numero no sea -1 se continue*/
		 while (alturaIntroducida!=-1) {
			
			 /*establecemos un if donde si la altura introducida es mayor a la altura max 
				esta se convierte en la nueva altura maxima*/
			if (alturaIntroducida>alturaMax) {
				
				alturaMax = alturaIntroducida;
			}
		 //leemos de nuevo el numero para no entrar en bucle
			alturaIntroducida = lee.nextInt();
		 }
		 //imprimimos la altura maxima
		 System.out.println("El arbol más alto mide " + alturaMax + "cm.");
	
		//cerramos el scanner
		 lee.close();
	}
	

}
