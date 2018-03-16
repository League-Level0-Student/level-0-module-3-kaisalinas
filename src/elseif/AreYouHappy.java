package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog(null, "Are you happy");
		if (a == "yes") {
			JOptionPane.showMessageDialog(null, "Keep doing whatever your doing");
		}
		if (a == "no") {
			String b = JOptionPane.showInputDialog(null, "Do you want to be happy");
		}
		String b = JOptionPane.showInputDialog(null, "Are you happy");
		if (b == "yes") {
			JOptionPane.showMessageDialog(null, "Change something");
		}
		if (b == "no") {
			JOptionPane.showMessageDialog(null, "Keep doing whatever your doing");
		}
	}
}
