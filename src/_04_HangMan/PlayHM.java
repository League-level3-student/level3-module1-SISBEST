package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PlayHM implements KeyListener {
	Stack<String> words = new Stack<String>();
	JFrame f = new JFrame("HangMan 1.0 Alpha");
	JPanel p = new JPanel();
	JLabel l = new JLabel("Guess the word:");
	JLabel li = new JLabel("Lives left: 0!!!!");
	int lives = 0;
	String word = Utilities.readRandomLineFromFile("dictionary.txt");

	public PlayHM() {
		p.add(l);
		p.add(li);
		f.add(p);
		f.addKeyListener(this);
		String nw = JOptionPane.showInputDialog(null,
				"Type a number! Any number less than or equal to the number of words in dictionary.txt!",
				"Word Select | Samuel HangMan", JOptionPane.PLAIN_MESSAGE);
		int numwords = Integer.parseInt(nw);
		for (int i = 0; i < numwords; i++) {
			words.push(word);
			System.out.println(word);
		}
		String w = words.pop();
		for (int i = 0; i < w.length(); i++) {
			String nt = l.getText() + "_";
			l.setText(nt);
			lives = 5;
		}
		f.pack();
		f.setVisible(true);
		li.setText("Lives left: " + lives + "!");

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Key");
		if (e.getKeyCode() == KeyEvent.VK_A) {
			char c = 'a';
			int start = 0;
			while (word.indexOf((int) c, start >= 0)) {
				start = word.indexOf((int) c, start);
				System.out.println("found a");
			} else {
				lives -= 1;
				li.setText("Lives left: " + lives + "!");
				if (lives == 0) {
					JOptionPane.showMessageDialog(null, "YOU LOSE!!!!!", "SORE LOSER ALERT!",
							JOptionPane.WARNING_MESSAGE);
					f.dispose();
					int playagainsel = JOptionPane.showConfirmDialog(null, "Wanna play again?");
				}
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_B) {

		}
		if (e.getKeyCode() == KeyEvent.VK_C) {

		}
		if (e.getKeyCode() == KeyEvent.VK_D) {

		}
		if (e.getKeyCode() == KeyEvent.VK_E) {

		}
		if (e.getKeyCode() == KeyEvent.VK_F) {

		}
		if (e.getKeyCode() == KeyEvent.VK_G) {

		}
		if (e.getKeyCode() == KeyEvent.VK_H) {

		}
		if (e.getKeyCode() == KeyEvent.VK_I) {

		}
		if (e.getKeyCode() == KeyEvent.VK_J) {

		}
		if (e.getKeyCode() == KeyEvent.VK_K) {

		}
		if (e.getKeyCode() == KeyEvent.VK_L) {

		}
		if (e.getKeyCode() == KeyEvent.VK_M) {

		}
		if (e.getKeyCode() == KeyEvent.VK_N) {

		}
		if (e.getKeyCode() == KeyEvent.VK_O) {

		}
		if (e.getKeyCode() == KeyEvent.VK_P) {

		}
		if (e.getKeyCode() == KeyEvent.VK_Q) {

		}
		if (e.getKeyCode() == KeyEvent.VK_R) {

		}
		if (e.getKeyCode() == KeyEvent.VK_S) {

		}
		if (e.getKeyCode() == KeyEvent.VK_T) {

		}
		if (e.getKeyCode() == KeyEvent.VK_U) {

		}
		if (e.getKeyCode() == KeyEvent.VK_V) {

		}
		if (e.getKeyCode() == KeyEvent.VK_W) {

		}
		if (e.getKeyCode() == KeyEvent.VK_X) {

		}
		if (e.getKeyCode() == KeyEvent.VK_Y) {

		}
		if (e.getKeyCode() == KeyEvent.VK_Z) {

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}
