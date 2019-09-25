package edu.cvtc.shapes;

/**
 * @author Kaleb Bestul
 *
 */
public class Cylinder extends Shape implements Renderer{

	// Attributes
	
	private float radius = 0.0f;
	private float height = 0.0f;
	
	
	// Getters and Setters
	
	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException("Cylinder radius argument \"" + radius + "\" must be a positive floating point number.");
		}
		
		this.radius = radius;
	}

	public float getHeight() {
		if (height <= 0) {
			throw new IllegalArgumentException("Cylinder height argument \"" + height + "\" must be a positive floating point number.");
		}
		
		return height;
	}

	private void setHeight(float height) {
		this.height = height;
	}
	
	
	// Constructor
	
	public Cylinder(Dialog messageBox, float radius, float height) {
		super(messageBox);
		setRadius(radius);
		setHeight(height);
	}
	
	
	// Methods
	
	@Override
	public float getSurfaceArea() {
		return (float) (2 * Math.PI * radius * (height + radius));
	}

	@Override
	public float getVolume() {
		return (float) (Math.PI * radius * radius * height);
	}

	@Override
	public void render() {
		
		String message = 	"Cylinder\n" +
							"\nRadius: " + this.radius +
							"\nHeight: " + this.height +
							"\nSurface Area: " + this.getSurfaceArea() +
							"\nVolume: " + this.getVolume();
		
		super.getMessageBox().show(message, "Cylinder");
		
	}

}
