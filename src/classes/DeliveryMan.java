/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author arch
 */
public class DeliveryMan extends User {
	private String firstName;
	private String secondName;
	private int salary;
	private Order[] orders;

	public DeliveryMan(String firstName, String secondName, int salary, Order[] orders, String name, String password, int permissionLevel) {
		super(name, password, permissionLevel);
		this.firstName = firstName;
		this.secondName = secondName;
		this.salary = salary;
		this.orders = orders;
	}

	public Order[] getOrders() {
		return orders;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public int getSalary() {
		return salary;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setOrders(Order[] orders) {
		this.orders = orders;
	}
}
