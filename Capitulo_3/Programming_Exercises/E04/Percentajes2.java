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
public class Percentajes2 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el valor para a: ");
		Double a = scanner.nextDouble();
		System.out.println("Ingresa el valor para b: ");
		Double b = scanner.nextDouble();
		computePercent(a, b);
		scanner.close();
	}
	
	
	public static void computePercent(Double a, Double b) {
		System.out.println("Value a: "+a);
		System.out.println("Value b: "+b);
		System.out.printf("Value a as a percentaje of b: %.2f por ciento", a*100/b);
	}

}
