package _04_HangMan;

import java.awt.Cursor;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PlayHM {
	Utilities util = new Utilities();
	Stack<String> words = new Stack<String>();
	JFrame f = new JFrame("SAMUEL HANGMAN");
	JLabel wd = new JLabel("WORD NOT LOADED ERROR: ERROR CODE 100");
	JLabel lv = new JLabel("LIVES NOT LOADED: ERROR CODE 101");
	JPanel p = new JPanel();

	public PlayHM() {
		f.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setUndecorated(true);
		String numwords = JOptionPane.showInputDialog(null, "Select a number of words!", "Welcome to S HangMan!",
				JOptionPane.QUESTION_MESSAGE);
		int numw = Integer.parseInt(numwords);
		for (int i = 0; i < numw - 1; i++) {
			String word = Utilities.readRandomLineFromFile("dictionary.txt");
			words.push(word);
			System.out.println(word);
			for (int j = 1; i < word.length(); j++) {
				wd.setText(wd.getText() + "_");
				f.setSize(1919, 1080);
				f.setVisible(true);
			}
			p.add(wd);
			p.add(lv);
			f.add(p);
		}
	}
}
