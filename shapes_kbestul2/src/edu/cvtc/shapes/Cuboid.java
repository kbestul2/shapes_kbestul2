package edu.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Kaleb Bestul
 *
 */
public class Cuboid extends Shape {
	
	// Attributes
	
	// Width of the cuboid in units
	private float width = 0.0f;
	
	// Height of the cuboid in units
	private float height = 0.0f;
	
	// Depth of the cuboid in units
	private float depth = 0.0f;
	
	
	// Getters and Setters
	
	// Gets the value for the width of the cuboid
	public float getWidth() {
		return width;
	}

	// Sets the value for the width of the cuboid
	private void setWidth(float width) {
		if (width <= 0) {
			throw new IllegalArgumentException("Cuboid width argument \"" + width + "\" must be a positive floating point number.");
		}
		
		this.width = width;
	}

	// Gets the value for the height of the cuboid
	public float getHeight() {
		return height;
	}

	// Sets the value for the height of the cuboid
	private void setHeight(float height) {
		if (height <= 0) {
			throw new IllegalArgumentException("Cuboid height argument \"" + height + "\" must be a positive floating point number.");
		}
		
		this.height = height;
	}

	// Gets the value for the depth of the cuboid
	public float getDepth() {
		return depth;
	}

	// Sets the value for the depth of the cuboid
	private void setDepth(float depth) {
		if (depth <= 0) {
			throw new IllegalArgumentException("Cuboid depth argument \"" + depth + "\" must be a positive floating point number.");
		}
		
		this.depth = depth;
	}
	
	
	// Constructors
	
	// Creates a cuboid object with the passed dimensions
	public Cuboid(float width, float height, float depth) {
		setWidth(width);
		setHeight(height);
		setDepth(depth);
	}

	
	// Methods
	
	// Calculates the surface area of the cuboid using: S = 2 * (a*b + a*c + b*c)
	@Override
	public float surfaceArea() {
		return 2 * ( (width * height) + (width * depth) + (height * depth) );
	}

	// Calculates the volume of the cuboid using: V = a*b*c
	@Override
	public float volume() {
		return width * height * depth;
	}

	// Outputs the cuboid's dimensions, surface area, and volume via a message box
	@Override
	public void render() {
		JOptionPane.showMessageDialog(	null,
										"Cuboid\n" +
										"\nWidth: " + width +
										"\nHeight: " + height +
										"\nDepth: " + depth +
										"\nSurface Area: " + this.surfaceArea() +
										"\nVolume: " + this.volume(), 
										"Cuboid",
										JOptionPane.INFORMATION_MESSAGE);
	}

}
