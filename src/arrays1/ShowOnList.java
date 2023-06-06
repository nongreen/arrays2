/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays1;

import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author arch
 */
public class ShowOnList {
	public static <T extends Object>void showArrayOnList(T[] array, JList jlist) {
		DefaultListModel<String> dlm = new DefaultListModel<String>();
		for (T t : array) {
			dlm.addElement(t.toString());
		}
		jlist.setModel(dlm);
	}
}
