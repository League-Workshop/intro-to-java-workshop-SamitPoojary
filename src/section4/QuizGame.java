package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
			
		int score = 0;
		// 2.  Ask the user a question 
			String answer1 = JOptionPane.showInputDialog("How many MVP awards has Kobe Bryant won in the NBA?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer1.equals("1")) { JOptionPane.showMessageDialog(null,"Correct!");
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
			if(answer1.equals("1")) {
			score++;
				}else {
					score--;
				}
				
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String answer2 = JOptionPane.showInputDialog("How many Harry Potter films are there?");
				if(answer2.equals("8")) {JOptionPane.showMessageDialog(null,"Correct!");
				if(answer1.equals("1")) {
					score++;
						}else {
							score--;
						}
				
		// 6.  After all the questions have been asked, print the user's score 
				System.out.println(score);
			
		}
	}
	}
}

	

