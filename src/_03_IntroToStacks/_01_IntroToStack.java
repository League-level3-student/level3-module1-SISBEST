package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> dbls = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Random r = new Random();
		for(int i = 0; i<100; i++){
			dbls.push(r.nextDouble());
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String small = JOptionPane.showInputDialog("Enter a number under 100!");
		String big = JOptionPane.showInputDialog("Enter a larger number up to 100!");
		int s = Integer.parseInt(small);
		int b = Integer.parseInt(big);
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		for(int i = 0; i<100; i++){
			Double d = dbls.pop();
			if(d > s && d < b){
				System.out.println(d);
			}
			else{
				System.err.println("[[CENSORED]]");
			}
		}
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
