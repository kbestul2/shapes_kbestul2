package edu.cvtc.shapes;

/**
 * @author Kaleb Bestul
 *
 */
public class Sphere extends Shape implements Renderer {

	// Attributes
	
	private float radius;
	
	
	// Getters and Setters
	
	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException("Circle radius argument \"" + radius + "\" must be a positive floating point number.");
		}
		
		this.radius = radius;
	}
	
	
	// Constructor
	
	public Sphere(Dialog messageBox, float radius) {
		super(messageBox);
		setRadius(radius);
	}
	
	
	// Methods
	
	@Override
	public float getSurfaceArea() {
		return (float) (4 * Math.PI * radius * radius);
	}

	@Override
	public float getVolume() {
		return (float) (4.0 / 3.0 * Math.PI * radius * radius * radius);
	}

	@Override
	public void render() {
		
		String message = 	"Sphere\n" +
							"\nRadius: " + this.radius +
							"\nSurface Area: " + this.getSurfaceArea() +
							"\nVolume: " + this.getVolume();
		
		this.getMessageBox().show(message, "Sphere");
		
	}

}
