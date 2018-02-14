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
public class GasPrices {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el precio por barril: ");
		Integer pricePerBarrel = scanner.nextInt();
		pricesPerGal(pricePerBarrel);
		scanner.close();
	}
	public static void pricesPerGal(Integer pricepb) {
		
		System.out.printf("El rango de precios va de $%.2f a $%.2f ", pricepb*0.035, pricepb*0.04);
	}
}
