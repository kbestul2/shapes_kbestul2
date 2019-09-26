package edu.cvtc.shapes.test;

import edu.cvtc.shapes.Dialog;

public class MessageBoxSub implements Dialog{

	public MessageBoxSub() {
		
	}
	
	@Override
	public int show(String message, String title) {
		
		return 0x00;
		
	}

}
