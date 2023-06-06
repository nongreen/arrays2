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
public class ReplacingStringIterator implements Iterator {
	String current_string;
	ArrayList<Integer> iteration_points;
	int last = 0;
	String replaceChar;

	ReplacingStringIterator(String current_string, ArrayList<Integer> iteration_points, String replaceChar){
		this.current_string = current_string;
		this.iteration_points = iteration_points;
		this.replaceChar = replaceChar;
	}	
	
	@Override
	public boolean hasNext() {
		return last < iteration_points.size();
	}

	@Override
	public String next() {
		last++;
		current_string = current_string.substring(0, iteration_points.get(last--)) + 
				replaceChar + current_string.substring(iteration_points.get(last--));
		return current_string;
	}

	public String nextAll() {
		while (hasNext()){
			next();
		}
		return current_string;
	}
	
}
