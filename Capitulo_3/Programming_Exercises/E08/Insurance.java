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
public class Insurance {
    	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el año actual: ");
		Integer anio = scanner.nextInt();
		System.out.println("Introduce tu año de nacimiento: ");
		Integer anioNac = scanner.nextInt();
		System.out.println("La cantidad de tu premio es: $"+premio(anio,anioNac));
		scanner.close();
	}
	public static Integer premio(Integer anio, Integer anioNac) {
		Integer edad = anio-anioNac;
		Integer decadas = edad/10;
		Integer premio = (decadas+15)*20;
		return premio;
	}
}
