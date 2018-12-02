package _01_IntroToArrayLists;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class _06_IPodShuffle{
	public _06_IPodShuffle() {
		ArrayList<Song> songs = new ArrayList<Song>();
		Song s1 = new Song("cat.mp3");
		Song s2 = new Song("drums.mp3");
		Song s3 = new Song("reg.mp3");
		Song s4 = new Song("demo.mp3");
		Song s5 = new Song("inst.mp3");
		Song s6 = new Song("cred.mp3");
		Song s7 = new Song("wither.mp3");
		Song s8 = new Song("train.mp3");
		Song s9 = new Song("ocelot.mp3");
		songs.add(s1);
		songs.add(s2);
		songs.add(s3);
		songs.add(s4);
		songs.add(s5);
		songs.add(s6);
		songs.add(s7);
		songs.add(s8);
		songs.add(s9);
		JFrame f = new JFrame("iPod Shuffle");
		JPanel p = new JPanel();
		JButton surp = new JButton("Surprise Me With A Song!!!!!!!");
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}
}