package _06_Intro_To_Hash_Maps;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	HashMap<Integer, String> log = new HashMap<Integer, String>();
	JFrame f = new JFrame("Samuel ListManager");
	JButton add = new JButton("Add Entry");
	JButton search = new JButton("Search list by ID");
	JButton view = new JButton("View List");
	JPanel p = new JPanel();

	/*
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	public static void main(String[] args) {
		_02_LogSearch ls = new _02_LogSearch();
		ls.go();
	}

	void go() {
		p.add(add);
		p.add(search);
		p.add(view);
		add.addActionListener(this);
		view.addActionListener(this);
		search.addActionListener(this);
		f.add(p);
		f.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setUndecorated(true);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton src = (JButton) e.getSource();
		if (src == add) {
			String idstr = JOptionPane.showInputDialog("ID:");
			int id = Integer.parseInt(idstr);
			String name = JOptionPane.showInputDialog("Name:");
			log.put(id, name);
		}
		if (src == view) {
			String text = "";
			for (Integer s : log.keySet()) {
				text += "ID: " + s + " Name: " + log.get(s) + "     ";
			}
			JOptionPane.showMessageDialog(null, text, "View Log", JOptionPane.PLAIN_MESSAGE);
		}
		if (src == search) {
			String id = JOptionPane.showInputDialog("ID:");
			JOptionPane.showMessageDialog(null, "ID" + id + " is registered to " + log.get(id));
		}
	}
}
