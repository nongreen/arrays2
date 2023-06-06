/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays1;

import javax.swing.JTextField;

/**
 *
 * @author arch
 */
public class InputFromTextField {
	public static Integer getFromIntTextField(JTextField jTextField) {
		String input = jTextField.getText();
		try {
			int input_int = Integer.parseInt(input);
			return input_int;
		} catch (Exception e) {
			return 1;
		}
	}

	public static Double getFromDoubleTextField(JTextField jTextField) {
		String input = jTextField.getText();
		try {
			double input_int = Double.parseDouble(input);
			return input_int;
		} catch (Exception e) {
			return 1.0;
		}
	}
}
