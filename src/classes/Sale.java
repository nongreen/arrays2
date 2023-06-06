/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author arch
 */
public class Sale {
	private Dish dish;
	private int count;

	public Sale(Dish dish, int count) {
		this.dish = dish;
		this.count = count;
	}

	public int getSummaryCost() {
		return dish.getPrice() * count;
	}

	public Dish getDish() {
		return dish;
	}

	public int getCount() {
		return count;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
