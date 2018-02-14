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
public class DogBoarding {
    	private static final Double PRIZEPOUNDAY = 0.50;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("El precio es $0.50 por libra por dia");
		System.out.println("Ingresa el peso del perro en Libras : ");
		Double peso = scanner.nextDouble();
		System.out.println("Ingresa el número de dias que estará en pensión: ");
		
		Integer dias = scanner.nextInt();
		Double total = peso*PRIZEPOUNDAY*dias;
		System.out.printf("El precio por %.2f libras por %d dias es: $%.2f", peso, dias, total);
		scanner.close();
	}
}
