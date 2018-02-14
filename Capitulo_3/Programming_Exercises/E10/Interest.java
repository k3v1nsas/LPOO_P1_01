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
public class Interest {
    public static void main(String[] args) {
		Double inversion = pregunta();
		Double interes = calculos(inversion);
		System.out.println("Con una inversion de: $"+inversion);
		System.out.printf("A un año ganarás $%.2f de interés%n", interes);
		System.out.println("Y tendrás un total de: $"+(inversion+calculos(inversion)));
		
	}
	public static Double pregunta() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa la cantidad a invertir: ");
		Double inversion = scanner.nextDouble();
		scanner.close();
		return inversion;
	}
	public static Double calculos(Double x) {
		return x*0.05;
	}
}
