/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arch
 */
public class ShowOnTable {

	public static void showMatrix(int[][] matrix, JTable table) {
		DefaultTableModel tm;
		tm = (DefaultTableModel) table.getModel();
		tm = clearTable(tm);
		tm.setColumnCount(matrix[0].length);
		table.setModel(tm);

		for (int[] a : matrix) {
			Vector<Integer> v = new Vector<Integer>();
			for (int i = 0; i < a.length; i++) {
				v.addElement(a[i]);
			}
			tm.addRow(v);
		}
	}

	public static void showMatrix(Double[][] matrix, JTable table) {
		DefaultTableModel tm;
		tm = (DefaultTableModel) table.getModel();
		tm = clearTable(tm);
		tm.setColumnCount(matrix[0].length);
		table.setModel(tm);

		for (Double[] a : matrix) {
			Vector<Double> v = new Vector<Double>();
			for (int i = 0; i < a.length; i++) {
				v.addElement(a[i]);
			}
			tm.addRow(v);
		}
	}

	public static void showMatrix(Person[] matrix, JTable table) {
		Object[][] data = new Object[matrix.length][3];

		for (int i = 0; i < matrix.length; i++) {
			data[i][0] = matrix[i].secondName;
			data[i][1] = matrix[i].count_of_stuff;
			data[i][2] = matrix[i].summary_weight;
		}

		DefaultTableModel tm;
		tm = (DefaultTableModel) table.getModel();
		tm = clearTable(tm);
		table.setModel(tm);

		for (Object[] a : data) {
			Vector<Object> v = new Vector<Object>();
			for (int i = 0; i < a.length; i++) {
				v.addElement(a[i]);
			}
			tm.addRow(v);
		}
	}

	public static void showMatrix(ArrayList<Person> matrix, JTable table) {
		Object[][] data = new Object[matrix.size()][3];

		for (int i = 0; i < matrix.size(); i++) {
			data[i][0] = matrix.get(i).secondName;
			data[i][1] = matrix.get(i).count_of_stuff;
			data[i][2] = matrix.get(i).summary_weight;
		}

		DefaultTableModel tm;
		tm = (DefaultTableModel) table.getModel();
		tm = clearTable(tm);
		table.setModel(tm);

		for (Object[] a : data) {
			Vector<Object> v = new Vector<Object>();
			for (int i = 0; i < a.length; i++) {
				v.addElement(a[i]);
			}
			tm.addRow(v);
		}
	}

	public static String readFile(String fileName) throws FileNotFoundException {
		//Этот спец. объект для построения строки
		StringBuilder sb = new StringBuilder(); // Изменяемая строка
		File file = new File(fileName); // Файл, с которым можно работать

		if (file.exists()) { // Если файл существует, то идем далее
			try {
				// Буфер хранит данные, а буферредер читает из буфера
				BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
				try { // Пытаемся построчно считать файл
					String s; // Создаем строку, которая будет хранить следующую строку
					while ((s = in.readLine()) != null) { // Пока есть следующая строка
						sb.append(s); // Добавляем строку в sb
						sb.append("\n"); // Добавляем символ переноса строки в sb
					}
				} finally { // Выполняется в любом случае
					//Закрыавем файл
					in.close();
				}
			} catch (IOException e) { // Если произошла ошибка
				throw new RuntimeException(e); // Сообщает о ней
			}
		}

		//Возвращаем полученный текст с файла
		return sb.toString();
	}

	public static void writeFile(String fileName, String text) {
		//Определяем файл
		File file = new File(fileName); // Файл, с которым можно работать

		try {
			//проверяем, что если файл не существует то создаем его
			if (!file.exists()) {
				file.createNewFile();
			}

			//PrintWriter обеспечит возможности записи в файл
			PrintWriter out = new PrintWriter(file.getAbsoluteFile());

			try {
				//Записываем текст у файл
				out.print(text);
			} finally {
				//После чего мы должны закрыть файл
				//Иначе файл не запишется
				out.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static DefaultTableModel clearTable(DefaultTableModel tm) {
		for (int i = tm.getRowCount() - 1; i >= 0; i--) {
			tm.removeRow(i);
		}
		return tm;
	}
}
