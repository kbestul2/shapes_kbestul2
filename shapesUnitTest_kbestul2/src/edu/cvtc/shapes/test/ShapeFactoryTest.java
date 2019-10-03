package edu.cvtc.shapes.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.cvtc.shapes.Cuboid;
import edu.cvtc.shapes.Cylinder;
import edu.cvtc.shapes.ShapeFactory;
import edu.cvtc.shapes.ShapeType;
import edu.cvtc.shapes.Sphere;

public class ShapeFactoryTest {

	MessageBoxSub messageBoxSub = new MessageBoxSub();
	
	ShapeFactory shapeFactory = new ShapeFactory(messageBoxSub);
	
	@Test
	public void testShapeFactoryCuboid() {
		Cuboid cuboid = (Cuboid) shapeFactory.make(ShapeType.Cuboid);
		assertTrue(cuboid instanceof Cuboid);
	}
	
	@Test
	public void testShapeFactoryCylinder() {
		Cylinder cylinder = (Cylinder) shapeFactory.make(ShapeType.Cylinder);
		assertTrue(cylinder instanceof Cylinder);
	}
	
	@Test
	public void testShapeFactorySphere() {
		Sphere sphere = (Sphere) shapeFactory.make(ShapeType.Sphere);
		assertTrue(sphere instanceof Sphere);
	}
	
}
