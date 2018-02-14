/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo_3;

import java.util.Scanner;

/**
 *
 * @author SERGIO
 */
public class MetricConversion {
    	public static void main(String[] args) {
		//2.54 cm en una pulg
		//3.7854 lts en un galon
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el número a pasar a pulgadas y galones: ");
		Integer numero = scanner.nextInt();
		toCentimetros(numero);
		System.out.println();
		toLitros(numero);
		scanner.close();
	}
	public static void toCentimetros(Integer x) {
		Double y = x*2.54;
		System.out.println("Convirtiendo pulgadas a centímetros");
		System.out.println("Utilizando el factor de conversion 2.54");
		System.out.println("Seguimos la formula (pulgadas*2.54 = numero en centimetros)");
		System.out.printf("%d * 2.54 = %.2f\n", x, y);
	}
	public static void toLitros(Integer x) {
		Double y = x*3.7854;
		System.out.println("Galones a litros");
		System.out.println("Utilizando el factor de conversion 3.7854");
		System.out.println("Seguimos la formula (galones*2.54 = numero en litros)");
		System.out.printf("%d * 3.7854 = %.2f\n", x, y);
	}
}
