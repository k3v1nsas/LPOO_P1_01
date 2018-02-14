/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo_2;

import java.util.Scanner;

public class Dollars {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer residuo;
		System.out.println("Introduce la cantidad de dolares a convertir: ");
		Integer cantDolares = scanner.nextInt();
		Integer cantVeinte = cantDolares/20;
		residuo = cantDolares%20;
		Integer cantDiez = residuo/10;
		residuo %= 10;
		Integer cantCinco = residuo/5;
		residuo %= 5;
		Integer cantUno = residuo;
		System.out.printf("Para %d dólares lo podemos dividir así: \n", cantDolares);
		System.out.println("Cantidad de billetes de 20 dólares es: " + cantVeinte);
		System.out.println("Cantidad de billetes de 10 dólares es: " + cantDiez);
		System.out.println("Cantidad de billetes de 5 dólares es: " + cantCinco);
		System.out.println("Cantidad de billetes de 1 dólar es: " + cantUno);
		scanner.close();
	}
}