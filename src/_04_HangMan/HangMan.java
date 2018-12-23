package _04_HangMan;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.*;
public class HangMan implements ActionListener{
	JFrame f = new JFrame("Samuel HangMan");
	JPanel p = new JPanel();
	JLabel title = new JLabel("Samuel HangMan");
	JLabel splash = new JLabel();
	JButton play = new JButton("Start Game");
	JButton quit = new JButton("Quit Game");
	
	public static void main(String[] args) {
		HangMan hm = new HangMan();	
		hm.gettoit();
		}
	void gettoit(){
		splash.setText(generateSplash());
		title.setFont(new Font("Sans", Font.BOLD, 40));
		p.add(title);
		p.add(splash);
		p.add(play);
		p.add(quit);
		f.add(p);
		play.addActionListener(this);
		quit.addActionListener(this);
		f.setVisible(true);
		f.setSize(1000, 500);
		while(true){
		 try {
			Thread.sleep(1000);
			splash.setFont(new Font("Sans", Font.ITALIC, 25));
			Thread.sleep(1000);
			splash.setFont(new Font("Sans", Font.ITALIC, 20));
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	}
	String generateSplash(){
		String splashtext = "Could not load splash! Seriously, Java?";
		Random r = new Random();
		int sn = r.nextInt(5);
		switch(sn){
		case 0:
		splashtext = "100203020012929209292939392991919129119002 years old!";
		
		case 1:
			splashtext = "Now without stickman bob!";
			break;
		
		case 2:
			splashtext = "Someone's phone is charging now!";
			break;
		
		case 3:
			splashtext = "Accept the TOS!";
			break;
		
		case 4:
			splashtext = "stickman bob feels sad.";
			break;
		}
return splashtext;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		if(source.equals("play")){
			PlayHM phm = new PlayHM();
		}
		if(source.equals("quit")){
			System.exit(10);
		}
	}
}
