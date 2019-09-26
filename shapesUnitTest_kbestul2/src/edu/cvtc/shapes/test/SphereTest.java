package edu.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.cvtc.shapes.Sphere;
import edu.cvtc.shapes.Dialog;
import edu.cvtc.shapes.Shape;

public class SphereTest {

	Dialog messageBox = new MessageBoxSub();
	Sphere sphereGlobal = new Sphere(messageBox, 1.0f);
	
	// Constructor Tests
	
	@Test
	public void testConstructor() {
		Shape cubePolymorphic = new Sphere(messageBox, 1.0f);
		assertTrue(cubePolymorphic instanceof Sphere);
	}
	
	
	// Getter and Setter Tests
	
	@Test
	public void testGetRadius() {
		assertEquals(1.0f, sphereGlobal.getRadius(), 0.0f);
	}
	
	
	// Method Tests
	
	@Test
	public void testGetSurfaceArea_WholeNumbers() {
		assertEquals(12.5663f, sphereGlobal.getSurfaceArea(), 0.001f);
	}
	
	@Test
	public void testGetSurfaceArea_FractionalNumbers() {
		Sphere sphereLocal = new Sphere(messageBox, 0.25f);
		assertEquals(0.7853f, sphereLocal.getSurfaceArea(), 0.001f);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetSurfaceArea_IllegalArguments() {
		Sphere sphereLocal = new Sphere(messageBox, 0.0f);
		sphereLocal.getSurfaceArea();
	}
	
	@Test
	public void testGetVolume_WholeNumbers() {
		assertEquals(4.1887f, sphereGlobal.getVolume(), 0.001f);
	}
	
	@Test
	public void testGetVolume_FractionalNumbers() {
		Sphere sphereLocal = new Sphere(messageBox, 0.5f);
		assertEquals(0.5235f, sphereLocal.getVolume(), 0.001f);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetVolume_IllegalArguments() {
		Sphere sphereLocal = new Sphere(messageBox, -1.0f);
		sphereLocal.getVolume();
	}
	
	@Test
	public void testRender() {
		sphereGlobal.render();
	}

}
