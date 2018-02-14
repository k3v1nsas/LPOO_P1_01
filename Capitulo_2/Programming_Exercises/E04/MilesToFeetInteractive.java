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
public class MilesToFeetInteractive {
    private static final Double FEETINMILE = 5.280;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double distanceBetweenUs;
		System.out.println("insert distance of your uncle in miles: ");
		distanceBetweenUs = scanner.nextDouble();
		System.out.printf("The distance to my uncle's house is %.2f miles or %.2f feet", distanceBetweenUs, distanceBetweenUs*FEETINMILE);
		scanner.close();
	}
}
