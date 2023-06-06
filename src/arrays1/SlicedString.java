/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author arch
 */
public class SlicedString {

	String current_string;

	SlicedString() {
		current_string = "";
	}

	SlicedString(String current_string) {
		this.current_string = current_string;
	}

	SlicedString(String current_string, int startFrom) {
		this.current_string = current_string.substring(startFrom);
	}

	SlicedString(String current_string, int startFrom, int endTo) {
		this.current_string = current_string.substring(startFrom, endTo);
	}

	public String get() {
		return current_string;
	}

	public String get(int startFrom) {
		return current_string.substring(startFrom);
	}

	public String get(int startFrom, int endTo) {
		return current_string.substring(startFrom, endTo);
	}

	public String charAt(int index) {
		return String.valueOf(current_string.charAt(index));
	}

	public char charAtInChar(int index) {
		return current_string.charAt(index);
	}

	public ArrayList<Integer> searchAll(String request) {
		ArrayList<Integer> iteration_points = new ArrayList<Integer>();
		int last_index = 0;
		while (current_string.substring(last_index).contains(request)){
			last_index = current_string.indexOf(request, last_index);
			iteration_points.add(last_index);
		}
		return iteration_points;
	}
}
