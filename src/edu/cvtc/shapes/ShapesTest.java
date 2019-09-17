package edu.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Kaleb Bestul
 *
 */

public class ShapesTest {

	public static void main(String[] args) {
		
		try {
			
			// Create an object for each shape
			Cuboid cuboid = new Cuboid(1, 0.5f, 2);
			Cylinder cylinder = new Cylinder(3, 5);
			Sphere sphere = new Sphere(7);
			
			// Output each shape's data
			cuboid.render();
			cylinder.render();
			sphere.render();
			
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			
			// Display error dialog box with error message
			String errorText = e.getMessage();
			JOptionPane.showMessageDialog(null, errorText, "ERROR!", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
