/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays1;

import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author arch
 */
public class ShowOnLabel {

	public static <T extends Object> void showValueOnLabel(T value, JLabel label) {
		String caption = label.getText();
		caption += value.toString();
		label.setText(caption);
	}

	public static <T extends Object> void showValueOnLabel(T value, JLabel label, String start_caption) {
		String caption = start_caption;
		caption += value.toString();
		label.setText(caption);
	}

	public static <T extends Object> void showValueOnLabel(ArrayList<T> array, JLabel label, String start_caption) {
		String caption = start_caption;
		for (T t : array) {
			caption += t.toString() + " ";
		}
		label.setText(caption);
	}

	public static void showValueOnLabel(int[] array, JLabel label) {
		String caption = label.getText();
		for (int i : array) {
			caption += Integer.toString(i) + " ";
		}
		label.setText(caption);
	}

	public static void showValueOnLabel(double[] array, JLabel label) {
		String caption = label.getText();
		for (double i : array) {
			caption += Double.toString(i) + " ";
		}
		label.setText(caption);
	}

	public static void showValueOnLabelWithNewLine(String[] array, JLabel label, String start_caption) {
		String caption = start_caption;
		for (String string : array) {
			caption += string;
			caption += "<br/>";
		}

		label.setText(caption + "</html>");
	}

	public static void showValueOnLabelWithNewLine(ArrayList<String> array, JLabel label, String start_caption) {
		String caption = start_caption;
		caption += "<br/>";
		for (String string : array) {
			caption += string;
			caption += "<br/>";
		}

		label.setText(caption + "</html>");
	}

	public static void showValueOnLabel(int[] array, JLabel label, String start_caption) {
		String caption = start_caption;

		if (!(caption.contains("<html>"))) {
			caption = "<html>" + caption;
		}

		caption += "<br/>";
		for (int i : array) {
			caption += Integer.toString(i) + " ";
		}
		if (!(caption.contains("</html>"))) {
			caption += "</html>";
		}
		label.setText(caption);
	}

	public static void showValueOnLabel(int[][] array, JLabel label, String start_caption) {
		String caption = start_caption;
		if (!(caption.contains("<html>"))) {
			caption = "<html>" + caption;
		}

		caption += "<br/>";

		for (int[] array1 : array) {
			for (int i : array1) {
				caption += Integer.toString(i) + "  ";
			}
			caption += "<br/>";
		}

		if (!(caption.contains("</html>"))) {
			caption += "</html>";
		}

		label.setText(caption);
	}

	public static void showValueOnLabel(Double[][] array, JLabel label, String start_caption) {
		String caption = start_caption;
		if (!(caption.contains("<html>"))) {
			caption = "<html>" + caption;
		}

		caption += "<br/>";

		for (Double[] array1 : array) {
			for (Double i : array1) {
				caption += i.toString() + "  ";
			}
			caption += "<br/>";
		}

		if (!(caption.contains("</html>"))) {
			caption += "</html>";
		}

		label.setText(caption);
	}

	public static void showValueOnLabel(Object[] array, JLabel label, String start_caption) {
		String caption = start_caption;

		if (!(caption.contains("<html>"))) {
			caption = "<html>" + caption;
		}

		caption += "<br/>";

		for (Object i : array) {
			caption += i.toString() + "<br/>";
		}

		if (!(caption.contains("</html>"))) {
			caption += "</html>";
		}

		label.setText(caption);
	}

	public static void showValueOnLabel(Person[] array, JLabel label, String start_caption) {
		String caption = start_caption;

		if (!(caption.contains("<html>"))) {
			caption = "<html>" + caption;
		}

		caption += "<br/>";

		for (Person i : array) {
			caption += i.toString() + "<br/>";
		}

		if (!(caption.contains("</html>"))) {
			caption += "</html>";
		}

		label.setText(caption);
	}

	public static void showValueOnLabel(Double[][] array, JLabel label, String start_caption, int restriction) {
		String caption = start_caption;
		if (!(caption.contains("<html>"))) {
			caption = "<html>" + caption;
		}

		caption += "<br/>";

		for (Double[] array1 : array) {
			for (Double i : array1) {
				if (i.toString().length() < restriction) {
					caption += i.toString();
				} else {
					caption += i.toString().substring(0, restriction) + "  ";
				}
			}
			caption += "<br/>";
		}

		if (!(caption.contains("</html>"))) {
			caption += "</html>";
		}

		label.setText(caption);
	}

	public static void showValueOnLabel(double[] array, JLabel label, String start_caption) {
		String caption = start_caption;
		for (double i : array) {
			caption += Double.toString(i) + " ";
		}
		label.setText(caption);
	}

}
