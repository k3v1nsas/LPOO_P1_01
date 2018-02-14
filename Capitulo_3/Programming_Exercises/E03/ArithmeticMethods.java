/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo_3;

/**
 *
 * @author SERGIO
 */
public class ArithmeticMethods {
    public static void main(String[] args) {
		Integer a = 7;
		Integer b = 17;
		displayNumberPlus10(a);
		displayNumberPlus100(b);
		displayNumberPlus1000(a);
		
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
