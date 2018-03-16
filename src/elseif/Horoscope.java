package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog(null, "Give me your star sign");
		if (a.equals("zodiac")) {
			JOptionPane.showMessageDialog(null, "You are a horoscope");
		} else {
			JOptionPane.showMessageDialog(null, "Thats not a star sign");
		}
	}
}
