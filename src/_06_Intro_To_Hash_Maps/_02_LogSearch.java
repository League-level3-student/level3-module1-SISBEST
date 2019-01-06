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
	JButton search = new JButton("Lookup by ID");
	JButton view = new JButton("View List");
	JButton delete = new JButton("Delete Entry by ID");
	JPanel p = new JPanel();
	public static void main(String[] args) {
		_02_LogSearch ls = new _02_LogSearch();
		ls.go();
	}

	void go() {
		p.add(add);
		p.add(search);
		p.add(view);
		p.add(delete);
		add.addActionListener(this);
		view.addActionListener(this);
		search.addActionListener(this);
		delete.addActionListener(this);
		f.add(p);
		f.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
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
			String ids = JOptionPane.showInputDialog("ID:");
			int id = Integer.parseInt(ids);
			JOptionPane.showMessageDialog(null, "ID " + id + " is registered to " + log.get(id));
		}
		if(src == delete) {
			String ids = JOptionPane.showInputDialog("ID:");
			int id = Integer.parseInt(ids);
			if(log.get(id) == null) {
			JOptionPane.showMessageDialog(null, "ERROR 101: User does not exist");
			}
			else {
				log.remove(id);
			}
			}
	}
}
