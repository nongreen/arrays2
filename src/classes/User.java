/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author arch
 */
public class User {
	private String name;
	private String password;
	private int permissionLevel;

	public User(String name, String password, int permissionLevel) {
		this.name = name;
		this.password = password;
		this.permissionLevel = permissionLevel;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public int getPermissionLevel() {
		return permissionLevel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPermissionLevel(int permissionLevel) {
		this.permissionLevel = permissionLevel;
	}

	
}
