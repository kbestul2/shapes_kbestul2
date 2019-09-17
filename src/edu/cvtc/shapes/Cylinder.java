package edu.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Kaleb Bestul
 *
 */
public class Cylinder extends Shape {

	// Attributes
	
	// Radius of the cylinder in units
	private float radius = 0.0f;
	
	// Height of the cylinder in units
	private float height = 0.0f;
	
	
	// Getters and Setters
	
	// Gets the value for the radius of the cylinder
	public float getRadius() {
		return radius;
	}

	// Sets the value for the radius of the cylinder
	private void setRadius(float radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException("Cylinder radius argument \"" + radius + "\" must be a positive floating point number.");
		}
		
		this.radius = radius;
	}

	// Gets the value for the height of the cylinder
	public float getHeight() {
		if (height <= 0) {
			throw new IllegalArgumentException("Cylinder height argument \"" + height + "\" must be a positive floating point number.");
		}
		
		return height;
	}

	// Sets the value for the height of the cylinder
	private void setHeight(float height) {
		this.height = height;
	}

	
	// Constructors
	
	// Creates a cylinder object with the passed dimensions
	public Cylinder(float radius, float height) {
		setRadius(radius);
		setHeight(height);
	}

	
	// Methods
	
	// Calculates the surface area of the cylinder using: S = 2*pi*r*(h+r)
	@Override
	public float surfaceArea() {
		return (float) (2 * Math.PI * radius * (height + radius));
	}

	// Calculates the volume of the cylinder using: V = pi*r^(2)* h
	@Override
	public float volume() {
		return (float) (Math.PI * radius * radius * height);
	}

	// Outputs the cylinder's dimensions, surface area, and volume via a message box
	@Override
	public void render() {
		JOptionPane.showMessageDialog(	null,
										"Cylinder\n" +
										"\nRadius: " + this.radius +
										"\nHeight: " + this.height +
										"\nSurface Area: " + this.surfaceArea() +
										"\nVolume: " + this.volume(), 
										"Cylinder",
										JOptionPane.INFORMATION_MESSAGE);
	}

}
