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
	JLabel l = new JLabel();
	JLabel li = new JLabel("Lives left: 0!!!!");
	int lives = 0;
	String word = Utilities.readRandomLineFromFile("dictionary.txt");

	public PlayHM() {
		p.add(l);
		p.add(li);
		f.add(p);
		f.addKeyListener(this);
		int numwords = 1;
		for (int i = 0; i < numwords; i++) {
			words.push(word);
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
		if (e.getKeyCode() == KeyEvent.VK_A) {
			char c = 'a';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'a');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
			}
		if (e.getKeyCode() == KeyEvent.VK_B) {
			char c = 'b';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'b');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_C) {
			char c = 'c';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'c');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			char c = 'd';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'd');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_E) {
			char c = 'e';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'e');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_F) {
			char c = 'f';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'f');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_G) {
			char c = 'g';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'g');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_H) {
			char c = 'h';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'h');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_I) {
			char c = 'i';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'i');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_J) {
			char c = 'j';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'j');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_K) {
			char c = 'k';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'k');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_L) {
			char c = 'l';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'l');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_M) {
			char c = 'm';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'm');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_N) {
			char c = 'n';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'n');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_O) {
			char c = 'o';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'o');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_P) {
			char c = 'p';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'p');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_Q) {
			char c = 'q';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'q');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_R) {
			char c = 'r';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'r');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			char c = 's';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 's');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_T) {
			char c = 't';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 't');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_U) {
			char c = 'u';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'u');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_V) {
			char c = 'v';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'v');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_W) {
			char c = 'w';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'w');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_X) {
			char c = 'x';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'x');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_Y) {
			char c = 'y';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'y');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_Z) {
			char c = 'z';
			int start = 0;
			if(word.indexOf((int) c, start) >= 0) {
			while (word.indexOf((int) c, start) >= 0) {
				int ind = word.indexOf((int) c, start);
				start = word.indexOf((int) c, start)+1;
				StringBuilder newword = new StringBuilder(l.getText());
				newword.setCharAt(ind, 'z');
				String nw = newword.toString();
				l.setText(nw);
			}}
			else {
				lives=lives-1;
				li.setText("Lives: " + lives);
			}
		}
		if(lives == 0) {
			JOptionPane.showMessageDialog(null, "Sorry...", "YO DEAD", JOptionPane.PLAIN_MESSAGE);
			f.dispose();
			f.setVisible(false);
			f.setEnabled(false);
			System.exit(0);
		}
		if(l.getText().indexOf("_") == -1) {
			JOptionPane.showMessageDialog(null, "Yay! YOU SHALL PLAY AGAIN. PRESS OK TO RESTART!", "YO WON!", JOptionPane.WARNING_MESSAGE);
			HangMan hm = new HangMan();
			f.dispose();
			f.setVisible(false);
			f.setEnabled(false);
			hm.relaunch();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}