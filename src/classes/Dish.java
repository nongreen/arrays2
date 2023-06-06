/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author arch
 */
public class Dish {
	private String name;
	private ArrayList<Ingridient> ingridients;
	private int price;

	public Dish(String name, ArrayList<Ingridient> ingridients, int price) {
		this.name = name;
		this.ingridients = ingridients;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Ingridient[] getIngridients() {
		return ingridients.toArray(new Ingridient[ingridients.size()]);
	}

	public int getPrice() {
		return price;
	}

	public void appendIngridient(Ingridient ingridient) {
		
	}

	public void deleteIngridient(Ingridient ingridient) {
		
	}

}
