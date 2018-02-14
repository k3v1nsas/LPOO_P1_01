/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo_2;

import java.util.Scanner;

/**
 *
 * @author SERGIO
 */
public class FahrenheitToCelsius {
    	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa la temperatura en grados Fahrenheit: ");
		Double tempF = scanner.nextDouble();
		System.out.println("\n\tLa temperatura en grados Fahrenheit es: " + tempF);
		System.out.printf("\tLa temperatura en grados Celsius es: %.2f", (tempF-32)*(5.0/9));
		scanner.close();
	}
}
