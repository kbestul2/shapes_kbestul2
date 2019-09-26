package edu.cvtc.shapes;

/**
 * @author Kaleb Bestul
 *
 */
public class Cuboid extends Shape implements Renderer {
	
	// Attributes
	
	private float width;
	private float height;
	private float depth;
	
	
	// Getters and Setters
	
	public float getWidth() {
		return width;
	}

	private void setWidth(float width) {
		if (width <= 0) {
			throw new IllegalArgumentException("Cuboid width argument \"" + width + "\" must be a positive floating point number.");
		}
		
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	private void setHeight(float height) {
		if (height <= 0) {
			throw new IllegalArgumentException("Cuboid height argument \"" + height + "\" must be a positive floating point number.");
		}
		
		this.height = height;
	}

	public float getDepth() {
		return depth;
	}

	private void setDepth(float depth) {
		if (depth <= 0) {
			throw new IllegalArgumentException("Cuboid depth argument \"" + depth + "\" must be a positive floating point number.");
		}
		
		this.depth = depth;
	}
	
	
	// Constructor
	
	public Cuboid(Dialog messageBox, float width, float height, float depth) {
		super(messageBox);
		setWidth(width);
		setHeight(height);
		setDepth(depth);
	}
	
	
	// Methods
	
	@Override
	public float getSurfaceArea() {
		return 2 * ( (width * height) + (width * depth) + (height * depth) );
	}

	@Override
	public float getVolume() {
		return width * height * depth;
	}

	@Override
	public void render() {
		
		String message = 	"Cuboid\n" +
							"\nWidth: " + width +
							"\nHeight: " + height +
							"\nDepth: " + depth +
							"\nSurface Area: " + this.getSurfaceArea() +
							"\nVolume: " + this.getVolume();
		
		this.getMessageBox().show(message, "Cuboid");
		
	}

}
