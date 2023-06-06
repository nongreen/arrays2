/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author arch
 */
public class Accountant extends User{
	private String firstName;
	private String secondName;
	private int salary;

	public Accountant(String name, String password, String firstName, String secondName, int permissionLevel) {
		super(name, password, permissionLevel);
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public Accountant(String name, String password, String firstName, String secondName, int salary, int permissionLevel) {
		super(name, password, permissionLevel);
		this.firstName = firstName;
		this.secondName = secondName;
		this.salary = salary;
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
}
