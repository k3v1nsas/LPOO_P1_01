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
public class Eggs {
    private static final double DOZENEGGS = 3.25;
	private static final double PRIZEPEREGG = 0.45;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("cantidad de huevos a comprar: ");
		Integer chuevos = scanner.nextInt();
		Integer docenas = chuevos/12;
		Integer huevosSinDocena = chuevos%12;
		Double total = docenas*DOZENEGGS+huevosSinDocena*PRIZEPEREGG;
		
		System.out.printf("compraste %d huevos,son %d docena(s) a $3.25 por docena%n"
							+ "y %d huevo(s) sueltos a 45 centavos c/u da un total de: $%.2f",
								chuevos, docenas, huevosSinDocena, total);
		scanner.close();
		
	}
}
