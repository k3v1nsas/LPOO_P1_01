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
public class Salary {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el pago por hora: ");
		Integer pagoHora = scanner.nextInt();
		System.out.println("Introduce las horas trabajadas a la semana :");
		Integer workedHours = scanner.nextInt();
		System.out.println("Introduce las horas extra trabajadas en la semana: ");
		Integer xWorkedHours = scanner.nextInt();
		System.out.println("Tu salario semanal es: $"+overTimePay(pagoHora, workedHours, xWorkedHours));
		scanner.close();
		
	}
	public static Double overTimePay(Integer pagoHora, Integer workedHours, Integer xWorkedHours) {
		Double salario = (double)pagoHora*workedHours;
		salario+=(xWorkedHours*(pagoHora*1.5));
		return salario;
	}
}
