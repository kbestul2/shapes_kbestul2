package edu.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Kaleb Bestul
 *
 */

public class ShapesTest {

	public static void main(String[] args) {
		
		try {
			
			Dialog messageBox = new MessageBox();
			
			ShapeFactory shapeFactory = new ShapeFactory(messageBox);
			
			// Create an object for each shape
			Cuboid cuboid = (Cuboid) shapeFactory.make(ShapeType.Cuboid);
			Cylinder cylinder = (Cylinder) shapeFactory.make(ShapeType.Cylinder);
			Sphere sphere = (Sphere) shapeFactory.make(ShapeType.Sphere);
			
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
