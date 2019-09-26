package edu.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.cvtc.shapes.Cuboid;
import edu.cvtc.shapes.Dialog;
import edu.cvtc.shapes.Shape;

public class CuboidTest {

	Dialog messageBox = new MessageBoxSub();
	Cuboid cubeGlobal = new Cuboid(messageBox, 1.0f, 1.0f, 1.0f);
	
	// Constructor Tests
	
	@Test
	public void testConstructor() {
		Shape cubePolymorphic = new Cuboid(messageBox, 1.0f, 1.0f, 1.0f);
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
	public void testGetSurfaceArea_WholeNumbers() {
		assertEquals(6.0f, cubeGlobal.getSurfaceArea(), 0.0f);
	}
	
	@Test
	public void testGetSurfaceArea_FractionalNumbers() {
		Cuboid cubeLocal = new Cuboid(messageBox, 0.25f, 1.5f, 2.66f);
		assertEquals(10.06f, cubeLocal.getSurfaceArea(), 0.0001f);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetSurfaceArea_IllegalArguments() {
		Cuboid cubeLocal = new Cuboid(messageBox, 0.0f, 0.0f, 0.0f);
		cubeLocal.getSurfaceArea();
	}
	
	@Test
	public void testVolume_WholeNumbers() {
		assertEquals(1.0, cubeGlobal.getVolume(), 0.0f);
	}
	
	@Test
	public void testVolume_FractionalNumbers() {
		Cuboid cubeLocal = new Cuboid(messageBox, 0.25f, 1.5f, 2.66f);
		assertEquals(0.9975, cubeLocal.getVolume(), 0.0001f);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testVolume_IllegalArguments() {
		Cuboid cubeLocal = new Cuboid(messageBox, -1.0f, -1.0f, -1.0f);
		cubeLocal.getVolume();
	}
	
	@Test
	public void testRender() {
		cubeGlobal.render();
	}
	
}