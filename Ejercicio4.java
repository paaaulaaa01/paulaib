package Tarea1;

import java.util.Scanner;

/*
 * NOMBRE: Paula Ibañez		FECHA:20/10/21
 * Escribe un programa Java que lee un número entero por teclado y obtiene y muestra
 *por pantalla el doble y el triple de ese número.
 * 
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduce un número: ");
		num=sc.nextInt();
		
		System.out.println("Has introducido el número " +num );
		System.out.println("El doble es "+2*num);
		System.out.println("El triple es "+3*num);
		System.out.println("El n�mero es "+num +" si quieres introducir otro n�mero reinicia el programa. ");
		
	}

}
