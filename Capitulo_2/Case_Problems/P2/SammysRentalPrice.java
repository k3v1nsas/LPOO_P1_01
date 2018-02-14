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
public class SammysRentalPrice {
    	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n"+
				           "Ss          Bienvenido a Sammys       Ss\n"+
				           "SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n");
		System.out.println("Ingrese el numero de minutos que rento el equipo deportivo: ");
		Integer minutes = scanner.nextInt();
		Integer hours = minutes/60;
		Integer resto = minutes%60;
		Integer total = minutes<60 ? 40 : hours*40+resto;
		System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n"+
				   "Ss  Sammy's makes it fun in the sun   Ss\n"+
				    "SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n");
		System.out.println("Si rentó menos de una hora se le cobra una hora");
		System.out.println("Cantidad de horas : " + hours);
		System.out.println("Cantidad de minutos : " + minutes);
		System.out.println("El precio total a pagar es: " + total);
		scanner.close();
	}
}
