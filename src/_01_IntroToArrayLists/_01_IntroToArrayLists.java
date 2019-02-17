package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> str = new ArrayList<String>();
		// 2. Add five Strings to your list
		str.add("bfcccccccccccccccccccccccccccccccccccccccccccccbccccccccccccccccccccccccccccccccccccccccccccccjcccccccccccccccccccccccccccccccccccccbbbbbbbbbbbbbbxgbcgfdhfhdhjfjookkkjjhjuuh");
		str.add("copypaste");
		str.add("whoooo");
		str.add("beep");
		str.add("whydidithavetobethemilerun");

		// 3. Print all the Strings using a standard for-loop
		System.out.println("### ALL OF IT! ###");
		for (int i = 0; i < 5; i++) {
			System.out.println(str.get(i));
		}
		System.out.println("### ALL OF IT AGAIN BECAUSE WHY NOT! ###");
		// 4. Print all the Strings using a for-each loop

		// 5. Print only the even numbered elements in the list.
		System.out.println("### ALL OF DA EVENS! ###");
		System.out.println(str.get(1));
		System.out.println(str.get(3));
		// 6. Print all the Strings in reverse order.
		System.out.println("### ALL OF IT BACKWARDS! ###");
		for (int j = str.size() - 1; j >= 0; j--) {
			System.out.println(str.get(j));
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		System.out.println("### ALL OF DA E'S! ###");
		System.out.println(str.get(1));
	}
}
