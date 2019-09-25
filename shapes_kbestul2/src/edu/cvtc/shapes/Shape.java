package edu.cvtc.shapes;

/**
 * @author Kaleb Bestul
 *
 */
public abstract class Shape {

	// Attributes
	
	private Dialog messageBox;
	
	
	// Constructors
	
	public Shape(Dialog messageBox) {
		setMessageBox(messageBox);
	}
	
	
	// Getters and Setters
	
	protected Dialog getMessageBox() {
		return messageBox;
	}
	
	private void setMessageBox(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	
	
	// Methods
	
	public abstract float getSurfaceArea();
	
	public abstract float getVolume();
	
}
