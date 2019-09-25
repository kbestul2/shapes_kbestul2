package edu.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.cvtc.shapes.Cylinder;
import edu.cvtc.shapes.Dialog;
import edu.cvtc.shapes.MessageBox;
import edu.cvtc.shapes.Shape;

public class CylinderTest {
	
	Dialog messageBox = new MessageBox();
	Cylinder cylinderGlobal = new Cylinder(messageBox, 1.0f, 1.0f);
	
	// Constructor Tests
	
	@Test
	public void testConstructor() {
		Shape cubePolymorphic = new Cylinder(messageBox, 1.0f, 1.0f);
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
	public void testGetSurfaceArea_WholeNumbers() {
		assertEquals(12.5663f, cylinderGlobal.getSurfaceArea(), 0.001f);
	}
	
	@Test
	public void testGetSurfaceArea_FractionalNumbers() {
		Cylinder cylinderLocal = new Cylinder(messageBox, 0.25f, 1.66f);
		assertEquals(3.0002f, cylinderLocal.getSurfaceArea(), 0.001f);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetSurfaceArea_IllegalArguments() {
		Cylinder cylinderLocal = new Cylinder(messageBox, 0.0f, 0.0f);
		cylinderLocal.getSurfaceArea();
	}
	
	@Test
	public void testGetVolume_WholeNumbers() {
		assertEquals(3.1415f, cylinderGlobal.getVolume(), 0.001f);
	}
	
	@Test
	public void testGetVolume_FractionalNumbers() {
		Cylinder cylinderLocal = new Cylinder(messageBox, 0.25f, 1.66f);
		assertEquals(0.3259f, cylinderLocal.getVolume(), 0.001f);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetVolume_IllegalArguments() {
		Cylinder cylinderLocal = new Cylinder(messageBox, -1.0f, -1.0f);
		cylinderLocal.getVolume();
	}
}
