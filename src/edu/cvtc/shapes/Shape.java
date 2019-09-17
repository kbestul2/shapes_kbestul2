package edu.cvtc.shapes;

/**
 * @author Kaleb Bestul
 *
 */
public abstract class Shape {

	// Calculates the surface area of the shape
	public abstract float surfaceArea();
	
	// Calculates the volume area of the shape
	public abstract float volume();
	
	// Outputs the shape's dimensions, surface area, and volume via a message box
	public abstract void render();
	
}
