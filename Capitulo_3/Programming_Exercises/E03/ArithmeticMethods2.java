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
public class ArithmeticMethods2 {
    	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer a = scanner.nextInt();
		Integer b = scanner.nextInt();
		displayNumberPlus10(a);
		displayNumberPlus100(b);
		displayNumberPlus1000(a);
		scanner.close();
	}
	public static void displayNumberPlus10(Integer x) {
		System.out.println(x+10);
	}
	public static void displayNumberPlus100(Integer x) {
		System.out.println(x+100);
	}
	public static void displayNumberPlus1000(Integer x) {
		System.out.println(x+1000);
	}
}
