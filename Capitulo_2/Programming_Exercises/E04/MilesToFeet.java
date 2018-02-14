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
public class MilesToFeet {
         private static final Double FEETINMILE = 5.280;
         public static void main(String[] args) {
		double distanceBetweenUs = 8.5;
		System.out.printf("The distance to my uncle's house is %.2f miles or %.2f feet", distanceBetweenUs, distanceBetweenUs*FEETINMILE);
	}
}
