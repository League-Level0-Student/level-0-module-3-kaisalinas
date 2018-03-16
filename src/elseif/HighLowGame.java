//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		for (int i = 0; i > -1; i++) {
			// 3. Change this line to give you a random number between 1 - 100.
			int random = new Random().nextInt(5);

			// 2. Print out the random variable above
			System.out.println(random + "");
			// 11. Repeat steps 1 to 10 ten times

			// 1. Ask the user for a guess using a pop-up window, and save their response
			String a = JOptionPane.showInputDialog(null, "Pick a number");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))

			int b = Integer.parseInt(a);
			// 5. if the guess is correct
			if (b == 29)
				;
			// 6. Win
			{

			}
			;
			// 12. Use "System.exit(0);" to quit the game if the user guessed the right
			// answer.
			if (b == 29) {
				JOptionPane.showMessageDialog(null, "You win");
				System.exit(0);
			}
			// 7. if the guess is high
			if (b > 29)
			// 8. Tell them it's too high
			{
				JOptionPane.showMessageDialog(null, "Its too high");
			}
			// 9. if the guess is low
			if (b < 29)
			// 10. Tell them it's too low
			{
				JOptionPane.showMessageDialog(null, "Its too low");
			}
			// 13. Tell them they lose
			JOptionPane.showMessageDialog(null, "You lost");
		}
	}

}
