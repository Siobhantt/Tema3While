package tema3ejercicioswhile;

import java.util.Scanner;

public class Ejercicio5 {
/*Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser positivos, negativos o cero).
 *  Cuando acabe de insertar los números, el algoritmo debe mostrar la suma de los números positivos,
 *  la media de los números negativos y el número de ceros que ha introducido el usuario.*/
	public static void main(String[] args) {
		//Establecemos las variables donde:
		int numUser;//aqui guardaremos los numeros que introducirá el usuario
		int sumaP = 0;//aqui guardarmos los numeros positivos
		int contador = 1;//aqui guardaremos la cantidad de numero que guardara el usuario
		int contador0 = 0; //aqui guardaremos las veces que el user introduzca 0
		int sumaN=0; //Aqui se guardará la suma de los numeros negativos
		double mediaN = 0; //aqui la media de los numeros negativos
		
		
		//Iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		
		//Mostramos la solicitud al Usuario y leemos los numero que va a introducir, guardandolos en la variable numUser
		System.out.println("Por favor introduzca numeros enteros: ");
		
		
		//Iniciamos un while donde si contador es menor o igual a 10 continue el while
		while (contador<=10) {
			numUser = lee.nextInt();
			//a contador se le añadirá uno por cada vuelta del while
			contador++;
			
			//establecemos un if donde si numUser en mayor que cero se sume a la variable sumaP
			if (numUser > 0) {
				sumaP += numUser;
			}
			//en este else si numUser es igual a 0 se incrementará uno al contador0
			else if (numUser==0) {
				contador0++;
			}
			//en este else tenemos que como ya solo quedan numeros negativos se vayan sumando a sumaN
			else {
				sumaN += numUser;
				mediaN=(sumaN/numUser); //Y en mediaN guardaremos la sumaN entre los numeros introducidos por el usuario
			}
		
		}
		
		System.out.println("La suma de los numeros positivos es: " + sumaP + "\n"
				+ "La media de los numeros negativos es: " + mediaN + "\n"
						+ "La cantidad de ceros introducidos es :" + contador0);
		//cerramos el Scanner
		lee.close();
	}

}
