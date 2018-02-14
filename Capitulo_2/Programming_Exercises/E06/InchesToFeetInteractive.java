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
public class InchesToFeetInteractive {
    	private static final Double INFE = 0.0833333;
	private static final Integer FEIN = 12;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input the distance between the house of your uncle and yours (inches): ");
		Integer inches = scanner.nextInt();
		scanner.close();
		Integer feet = (int)(inches * INFE);
		System.out.printf("%d inches becomes %d feet and %d inches",
						inches, feet, (inches-(feet*FEIN)));
	}
}
