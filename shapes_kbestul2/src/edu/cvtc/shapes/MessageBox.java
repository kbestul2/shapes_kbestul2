package edu.cvtc.shapes;

import javax.swing.JOptionPane;

public class MessageBox implements Dialog {
	
	// Constructor
	
	public MessageBox() {
		
	}
	
	
	// Methods
	
	@Override
	public int show(String message, String title) {
		
		JOptionPane.showMessageDialog( null, message, title, JOptionPane.INFORMATION_MESSAGE);
		
		return 0;
	}

}
