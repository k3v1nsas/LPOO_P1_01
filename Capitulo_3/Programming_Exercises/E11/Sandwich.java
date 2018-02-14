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
public class Sandwich {
    private String mainIngredient;
	private String breadType;
	private Double price;
	public void setMainIngredient(String mainIngredient) {
		this.mainIngredient = mainIngredient;
	}
	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getMainIngredient1() {
		return mainIngredient;
	}
	public String getBreadType() {
		return breadType;
	}
	public Double getPrice() {
		return price;
	}
}
