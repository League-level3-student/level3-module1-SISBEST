package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class _06_IPodShuffle implements ActionListener{
	ArrayList<Song> songs = new ArrayList<Song>();
	Song s0 = new Song("cat.mp3");
	Song s1 = new Song("drums.mp3");
	Song s2 = new Song("reg.mp3");
	Song s3 = new Song("demo.mp3");
	Song s4 = new Song("inst.mp3");
	Song s5 = new Song("cred.mp3");
	Song s6 = new Song("wither.mp3");
	Song s7 = new Song("train.mp3");
	Song s8 = new Song("ocelot.mp3");
	public _06_IPodShuffle() {
		songs.add(s1);
		songs.add(s2);
		songs.add(s3);
		songs.add(s4);
		songs.add(s5);
		songs.add(s6);
		songs.add(s7);
		songs.add(s8);
		songs.add(s0);
		JFrame f = new JFrame("iPod Shuffle");
		JPanel p = new JPanel();
		JButton surp = new JButton("Surprise Me With A Song!!!!!!!");
		surp.addActionListener(this);
		p.add(surp);
		f.add(p);
		f.setVisible(true);
		f.pack();
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random r = new Random();
		s0.stop();
		s1.stop();
		s2.stop();
		s3.stop();
		s4.stop();
		s5.stop();
		s6.stop();
		s7.stop();
		s8.stop();
		int sel = r.nextInt(9);
		songs.get(sel).play();
	}
}