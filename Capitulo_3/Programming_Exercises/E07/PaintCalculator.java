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
public class PaintCalculator {
    public static final Integer PRICEPERGALLON = 32;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el largo (en pies): ");
		Double largo = scanner.nextDouble();
		System.out.println("Ingresa el ancho (en pies): ");
		Double ancho = scanner.nextDouble();
		System.out.println("Ingresa la altura (en pies): ");
		Double altura = scanner.nextDouble();
		Double total = hagoTodo(largo, ancho, altura);
		System.out.println("El precio total será de: $" + total);
		scanner.close();
		
	}
	public static Double hagoTodo(Double largo, Double ancho, Double altura) {
		Double wallArea = (largo*altura + ancho*altura)*2;
		Double galonesNeeded = galonesNecesarios(wallArea);
		System.out.printf("Se necesitarán: %.2f galones de pintura\n", galonesNeeded);
		Double precio = galonesNeeded*PRICEPERGALLON;
		return precio;
	}
	public static Double galonesNecesarios(Double wallArea) {
		double galonesNeeded = wallArea/350;
		return galonesNeeded;
	}
}
