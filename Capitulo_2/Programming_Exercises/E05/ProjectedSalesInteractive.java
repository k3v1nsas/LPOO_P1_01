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
public class ProjectedSalesInteractive {
    	private static final Double ANTICIPATED_INCREASE = 1.1;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Anual sales for the north division: ");
		Double northDiv = scanner.nextDouble();
		System.out.println("Anual sales for the south division: ");
		Double southDiv = scanner.nextDouble();
		System.out.printf("The next year projected sales for the North division is: %.2f\n", northDiv*ANTICIPATED_INCREASE);
		System.out.printf("The next year projected sales for the South division is: %.2f ", southDiv*ANTICIPATED_INCREASE);
		scanner.close();
	}

}
