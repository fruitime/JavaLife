package com.laboon;

import static org.junit.Assert.*;

import org.junit.Test;

//Test the toString() method in World.java class with different sizes;
public class TestToString {
	
	//Test a world with size 0*0 
	@Test
	public void testZeroWorld() {
		World world = new World(0, 0, 0);
		String newWorld = world.toString();
		assertTrue(newWorld.compareToIgnoreCase("  \n") == 0);		
	}
	
	//Test a small world with size 5*5
	@Test
	public void testSmallWorld() {
		World world = new World(5, 0, 0);
		String newWorld = world.toString();
		assertTrue(newWorld.startsWith("  01234\n"));
	}
	
	//Test a large world with size 50*50
	@Test
	public void testLargeWorld() {
		World world = new World(50, 0, 0);
		String newWorld = world.toString();
		assertTrue(newWorld.startsWith("  01234567890123456789012345678901234567890123456789\n"));
	}
	
	//Test a world with size=10*10, seed=100, percent=30%
	@Test
	public void testNewWorld() {
		World world = new World(10, 100, 30);
		String newWorld = world.toString();
		String expected = "  0123456789\n"
						+ "0 X.......XX\n"
						+ "1 XX.......X\n"
						+ "2 .X......XX\n"
						+ "3 ..X.....XX\n"
						+ "4 .X...X.X.X\n"
						+ "5 ..XX..X...\n"
						+ "6 ..X.....X.\n"
						+ "7 ..X.X.....\n"
						+ "8 .X.....X..\n"
						+ "9 XX.....X..\n";
		assertEquals(expected, newWorld);
	}

}
