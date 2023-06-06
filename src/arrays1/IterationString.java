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
public class IterationString implements Iterator {
	String current_string;
	ArrayList<Integer> iteration_points;
	int last = 0;

	IterationString(String current_string, ArrayList<Integer> iteration_points){
		this.current_string = current_string;
		this.iteration_points = iteration_points;
	}	

	IterationString(String current_string) {
		this.current_string = current_string;
		iteration_points = new ArrayList<Integer>();
		for (int i = 0; i < current_string.length(); i++) {
			iteration_points.add(i);
		}
	}

	@Override
	public boolean hasNext() {
		return last < iteration_points.size();
	}

	@Override
	public String next() {
		last++;
		return String.valueOf(current_string.charAt(iteration_points.get(last--)));
	}
}
