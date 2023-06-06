/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author arch
 */
public class DaySalesReport extends Report {
	private Sale[] sales;

	public DaySalesReport(Sale[] sales, String date, User creator) {
		super(date, creator);
		this.sales = sales;
	}

	public Sale[] getSales() {
		return sales;
	}

	public void setSales(Sale[] sales) {
		this.sales = sales;
	}

}
