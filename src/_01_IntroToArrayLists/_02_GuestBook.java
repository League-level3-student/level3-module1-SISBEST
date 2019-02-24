package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.*;

public class _02_GuestBook implements ActionListener {
	ArrayList<String> book = new ArrayList<String>();
	JButton sign = new JButton("Sign The Guestbook!");
	JButton view = new JButton("View Signatures!");

	public static void main(String[] args) {
		_02_GuestBook gb = new _02_GuestBook();
		gb.start();
	}
	void start() {
		JFrame f = new JFrame("S House Guestbook!");
		JPanel p = new JPanel();
		p.add(view);
		p.add(sign);
		f.add(p);
		f.pack();
		f.setVisible(true);
		view.addActionListener(this);
		sign.addActionListener(this);
	}

	String getdt() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		return (dtf.format(now));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton bp = (JButton) e.getSource();
		if (bp == sign) {
			String name = JOptionPane.showInputDialog(null, "Name?");
			book.add(getdt() + ": " + name + " signed!");
		}
		else if(bp == view) {
			JOptionPane.showMessageDialog(null, getbook());
		}
	}
	String getbook() {
		String b = "Guestbook Signatures: ";
		String append = null;
		String a2 = null;
		for(int i = 0; i<book.size(); i++) {
			append = book.get(i); 
			a2 = "          ";
			b += append + a2;
		}
		return b;
	}
}