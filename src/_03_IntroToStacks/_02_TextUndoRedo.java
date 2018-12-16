package _03_IntroToStacks;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.*;
public class _02_TextUndoRedo implements KeyListener {
	JFrame f = new JFrame("Samuel Text Editor");
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	Stack<String> toredo = new Stack<String>();
	PrintWriter out;
	
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	public static void main(String[] args) {
		new _02_TextUndoRedo();
	}
	_02_TextUndoRedo(){
		p.add(l);
		f.add(p);
		f.addKeyListener(this);
		f.setVisible(true);
		f.pack();
	}
	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void keyPressed(KeyEvent e) {
		 if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE)
		    {
			 String text = l.getText().substring(0, l.getText().length()-1);
			 l.setText(text);
			 toredo.push(l.getText().charAt(l.getText().length()-1)+"");
			 
		    }
		 if(e.getKeyCode() == KeyEvent.VK_F1)
		    {
			 File cdfl = new File("samueltexteditor_save.stext");
				try {
					out = new PrintWriter(cdfl);
					out.print(l.getText());
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					System.err.println("FILENOTFOUND");
				}
				out.close();
				String fp = "Your file saved at " + cdfl.getAbsolutePath() + ". STEXT files can be opened with any text editor: even Microsoft Word!";
				JOptionPane.showMessageDialog(null, fp);
		    }
		 if(e.getKeyCode() == KeyEvent.VK_F2)
		    {
			 l.setText(l.getText() + toredo.pop());
		    }
		 if(e.getKeyCode() == KeyEvent.VK_F3)
		    {
			 JFileChooser jfc = new JFileChooser();
			 jfc.showOpenDialog(null);
			 Scanner in;
				try {
					in = new Scanner(jfc.getSelectedFile());
					while (in.hasNextLine()) {
						String a = in.nextLine();
						l.setText(a);
		    }}
				catch(Exception ex) {
						ex.printStackTrace();
				}}
		    
		 else {
		l.setText(l.getText() + e.getKeyChar());
		f.pack();
		 }
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
