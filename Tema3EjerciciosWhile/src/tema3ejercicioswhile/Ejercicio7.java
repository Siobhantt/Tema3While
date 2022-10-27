package tema3ejercicioswhile;

import java.util.Scanner;

public class Ejercicio7 {
/*Codificar el juego “el número secreto”, que consiste en acertar un número entre 1 y 100 (generado aleatoriamente). 
 *Para ello se introduce por teclado una serie de números, para los que se indica: “mayor” o “menor”, 
 *según sea mayor o menor con respecto al número secreto.
El proceso termina cuando el usuario acierta o cuando se rinde (introduciendo un -1).*/
	public static void main(String[] args) {
		//Declaramos las variables
		double numSecreto;
		int numUser;
		
		//Iniciamos el Scanner
		Scanner lee = new Scanner(System.in);
		
		numSecreto = Math.random()*99;//para lograr el numero secreto le asignamos a la varible el mathrandom *99
		
		System.out.println("Este es el juego del numero secreto! Intenta acertar el numero aleatorio del 1 al 100 (:");
		System.out.println("(Si quieres dejar de jugar introduce -1");
		numUser = lee.nextInt();//leemos el numero del usuario
		
		//Inciamos un while donde la condicion será que el numero introducido por el usuario sea contrario a -1
		while (numUser!=-1) {
			
			if (numUser == (int)numSecreto) {//declaramos que si numUser es igual a numSecreto el usuario ha ganado
				System.out.println("¡Has ganado! (:");
			}
			
		else if (numUser > (int)numSecreto) {//si es mas alto el numero introducido le animamos al usuario a que pruebe con un numero mas bajo
				System.out.println("Quizas un numero mas bajito (;");
			}
			
		else {//en otro caso le animamos a que pruebe con un numero mas alto
			System.out.println("Con un numero mas alto te acercas más (:");//
		}
			
			numUser = lee.nextInt();//leemos de nuevo para no entrar en bluce
		}
		//cerramos el scanner
		lee.close();
	}

}
