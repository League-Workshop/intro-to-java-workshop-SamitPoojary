package section4;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		new Random().nextInt(4);
		String question = JOptionPane.showInputDialog("What number between 0 and 3 do you think is awesome?");
		if(question.equals("0")) {
			System.out.println("You are awesome!");
		}
		if(question.equals("1")) {
			System.out.println("You're alright.");
		}
		if(question.equals("2")) {
			System.out.println("You are so boring kid get on my level.");
		}
		if(question.equals("3")) {
			System.out.println("YOU ARE ACTUALLY A GOD KID!");
		}
			
		}
	}
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter something that they think is awesome

	// 5. If the random number is 0

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer




