package edu.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Kaleb Bestul
 *
 */
public class Sphere extends Shape {

	// Attributes
	
	// Radius of the sphere in units
	private float radius = 0.0f;
	
	
	// Getters and Setters
	
	// Gets the value of the radius of the sphere
	public float getRadius() {
		if (radius <= 0) {
			throw new IllegalArgumentException("Circle radius argument \"" + radius + "\" must be a positive floating point number.");
		}
		
		return radius;
	}

	// Sets the value of the radius of the sphere
	private void setRadius(float radius) {
		this.radius = radius;
	}
	
	
	// Constructors
	
	// Creates a sphere object with the passed dimension
	public Sphere(float radius) {
		setRadius(radius);
	}
	
	
	// Methods
	
	// Calculates the surface area of the sphere using: S = 4*pi*r^(2)
	@Override
	public float surfaceArea() {
		return (float) (4 * Math.PI * radius * radius);
	}

	// Calculates the volume of the sphere using: V = (4/3)*pi*r^(3)
	@Override
	public float volume() {
		return (float) (4.0 / 3.0 * Math.PI * radius * radius * radius);
	}

	@Override
	public void render() {
		JOptionPane.showMessageDialog(	null,
										"Sphere\n" +
										"\nRadius: " + this.radius +
										"\nSurface Area: " + this.surfaceArea() +
										"\nVolume: " + this.volume(), 
										"Sphere",
										JOptionPane.INFORMATION_MESSAGE);
	}

}
