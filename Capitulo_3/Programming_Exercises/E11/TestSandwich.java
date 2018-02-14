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
public class TestSandwich {
    public static void main(String[] args) {
		Sandwich sanwish = new Sandwich();
		sanwish.setMainIngredient("Jamón");
		sanwish.setBreadType("Linaza");
		sanwish.setPrice(17.0);
		System.out.println("Ingrediente principal del sándwich: "+sanwish.getMainIngredient1());
		System.out.println("Tipo de pan: "+sanwish.getBreadType());
		System.out.println("Precio del sándwich: "+sanwish.getPrice());
	}
}
