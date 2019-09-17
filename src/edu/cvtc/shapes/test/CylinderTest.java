package edu.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.cvtc.shapes.Cylinder;
import edu.cvtc.shapes.Shape;

public class CylinderTest {

	Cylinder cylinderGlobal = new Cylinder(1.0f, 1.0f);
	
	// Constructor Tests
	
	@Test
	public void testConstructor() {
		Shape cubePolymorphic = new Cylinder(1.0f, 1.0f);
		assertTrue(cubePolymorphic instanceof Cylinder);
	}
	
	
	// Getter and Setter Tests
	
	@Test
	public void testGetHeight() {
		assertEquals(1.0f, cylinderGlobal.getHeight(), 0.0f);
	}
	
	@Test
	public void testGetRadius() {
		assertEquals(1.0f, cylinderGlobal.getRadius(), 0.0f);
	}
	
	
	// Method Tests
	
	@Test
	public void testSurfaceArea_WholeNumbers() {
		assertEquals(12.5663f, cylinderGlobal.surfaceArea(), 0.001f);
	}
	
	@Test
	public void testSurfaceArea_FractionalNumbers() {
		Cylinder cylinderLocal = new Cylinder(0.25f, 1.66f);
		assertEquals(3.0002f, cylinderLocal.surfaceArea(), 0.001f);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceArea_IllegalArguments() {
		@SuppressWarnings("unused")
		Cylinder cylinderLocal = new Cylinder(0.0f, 0.0f);
	}
	
	@Test
	public void testVolume_WholeNumbers() {
		assertEquals(3.1415f, cylinderGlobal.volume(), 0.001f);
	}
	
	@Test
	public void testVolume_FractionalNumbers() {
		Cylinder cylinderLocal = new Cylinder(0.25f, 1.66f);
		assertEquals(0.3259f, cylinderLocal.volume(), 0.001f);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testVolume_IllegalArguments() {
		@SuppressWarnings("unused")
		Cylinder cylinderLocal = new Cylinder(-1.0f, -1.0f);
	}
}
