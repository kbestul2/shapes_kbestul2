package edu.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.cvtc.shapes.Cuboid;
import edu.cvtc.shapes.Shape;

public class CuboidTest {

	Cuboid cubeGlobal = new Cuboid(1.0f, 1.0f, 1.0f);
	
	// Constructor Tests
	
	@Test
	public void testConstructor() {
		Shape cubePolymorphic = new Cuboid(1.0f, 1.0f, 1.0f);
		assertTrue(cubePolymorphic instanceof Cuboid);
	}
	
	
	// Getter and Setter Tests
	
	@Test
	public void testGetWidth() {
		assertEquals(1.0f, cubeGlobal.getWidth(), 1.0f);
	}
	
	@Test
	public void testGetHeight() {
		assertEquals(1.0f, cubeGlobal.getHeight(), 1.0f);
	}
	
	@Test
	public void testGetDepth() {
		assertEquals(1.0f, cubeGlobal.getDepth(), 1.0f);
	}
	
	
	// Method Tests
	
	@Test
	public void testSurfaceArea_WholeNumbers() {
		assertEquals(6.0f, cubeGlobal.surfaceArea(), 0.0f);
	}
	
	@Test
	public void testSurfaceArea_FractionalNumbers() {
		Cuboid cubeLocal = new Cuboid(0.25f, 1.5f, 2.66f);
		assertEquals(10.06f, cubeLocal.surfaceArea(), 0.0001f);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceArea_IllegalArguments() {
		@SuppressWarnings("unused")
		Cuboid cubeLocal = new Cuboid(0.0f, 0.0f, 0.0f);
	}
	
	@Test
	public void testVolume_WholeNumbers() {
		assertEquals(1.0, cubeGlobal.volume(), 0.0f);
	}
	
	@Test
	public void testVolume_FractionalNumbers() {
		Cuboid cubeLocal = new Cuboid(0.25f, 1.5f, 2.66f);
		assertEquals(0.9975, cubeLocal.volume(), 0.0001f);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testVolume_IllegalArguments() {
		@SuppressWarnings("unused")
		Cuboid cubeLocal = new Cuboid(-1.0f, -1.0f, -1.0f);
	}
}