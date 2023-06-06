/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays1;

import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author arch
 */
public class Generate {
	private static String[] second_names = new String[] {
		"Смирнов",
		"Иванов",
		"Кузнецов"
	};

	public static String generateSecondName() {
		Random rand = new Random();
		return second_names[rand.nextInt(second_names.length)];
	}

	public static Person generatePerson(){
		return new Person(generateSecondName(), generateNumber(0, 10), generateNumber(0.0, 100.0));
	}

	public static int[] generateArray(int[] array, int min, int max) {
		for (int i = 0; i < array.length; i++) {
			array[i] = generateNumber(min, max);
		}
		return array;
	}

	public static int[][] generateArray(int[][] array, int min, int max) {
		for (int[] array1 : array) {
			for (int j = 0; j < array1.length; j++) {
				array1[j] = generateNumber(min, max);
			}
		}
		return array;
	}

	public static int generateNumber(int min, int max) {
		return (int) (Math.random() * max + min);
	}

	public static double generateNumber(double min, double max) {
		return Math.random() * max + min;
	}
}
