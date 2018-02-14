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
public class ShowStudent {
    public static void main(String[] args) {
		Student sergio = new Student();
		sergio.setidNumber(1717);
		sergio.setcreditHours(17);
		sergio.setPoints(177);
		sergio.gradePointAverage();
		sergio.showIdNumber();
		sergio.showCreditHours();
		sergio.showPoints();
		sergio.showGradePointAverage();
	}
}
