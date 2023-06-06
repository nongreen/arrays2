/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author arch
 */
public class Report {
	private String date;
	private User creator;

	public Report(String date, User creator) {
		this.date = date;
		this.creator = creator;
	}

	public String getDate() {
		return date;
	}

	public User getCreator() {
		return creator;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}
}
