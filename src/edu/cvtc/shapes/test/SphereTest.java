package edu.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.cvtc.shapes.Sphere;
import edu.cvtc.shapes.Shape;

public class SphereTest {

	Sphere sphereGlobal = new Sphere(1.0f);
	
	// Constructor Tests
	
	@Test
	public void testConstructor() {
		Shape cubePolymorphic = new Sphere(1.0f);
		assertTrue(cubePolymorphic instanceof Sphere);
	}
	
	
	// Getter and Setter Tests
	
	@Test
	public void testGetRadius() {
		assertEquals(1.0f, sphereGlobal.getRadius(), 0.0f);
	}
	
	
	// Method Tests
	
	@Test
	public void testSurfaceArea_WholeNumbers() {
		assertEquals(12.5663f, sphereGlobal.surfaceArea(), 0.001f);
	}
	
	@Test
	public void testSurfaceArea_FractionalNumbers() {
		Sphere sphereLocal = new Sphere(0.25f);
		assertEquals(0.7853f, sphereLocal.surfaceArea(), 0.001f);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceArea_IllegalArguments() {
		@SuppressWarnings("unused")
		Sphere sphereLocal = new Sphere(0.0f);
	}
	
	@Test
	public void testVolume_WholeNumbers() {
		assertEquals(4.1887f, sphereGlobal.volume(), 0.001f);
	}
	
	@Test
	public void testVolume_FractionalNumbers() {
		Sphere sphereLocal = new Sphere(0.5f);
		assertEquals(0.5235f, sphereLocal.volume(), 0.001f);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testVolume_IllegalArguments() {
		@SuppressWarnings("unused")
		Sphere sphereLocal = new Sphere(-1.0f);
	}

}
