
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String a = JOptionPane.showInputDialog(null, "Whose birthday do you want");
		// 3. Print out what the user typed
		System.out.println(a + "");
		// 4. if user asked for "mom"
		if (a.equals(momsBirthday)) {
			JOptionPane.showMessageDialog(null, "January 24th");
		}
		// 5. if user asked for "dad"
		if (a.equals(dadsBirthday)) {
			JOptionPane.showMessageDialog(null, "June 9th");
		}
		// 6. if user asked for your name
		if (a.equals(myBirthday))
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		{
			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday");
		}
	}
}
