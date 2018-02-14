/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo_2;

/**
 *
 * @author SERGIO
 */
public class ProjectedSales {
    	private static final Double ANTICIPATED_INCREASE = 0.1;
	public static void main(String[] args) {
		Double northDiv = 4000.0;
		Double southDiv = 5500.0;
		System.out.printf("The next year projected sales for the North division is: %.2f\n", northDiv*ANTICIPATED_INCREASE);
		System.out.printf("The next year projected sales for the South division is: %.2f ", southDiv*ANTICIPATED_INCREASE);
	}
}
