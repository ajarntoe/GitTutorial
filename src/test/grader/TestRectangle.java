package test.grader;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import rect.Rectangle;

public class TestRectangle {

	Rectangle rect1, rect2;
	
	@Before
	public void setup() {
		rect1 = new Rectangle(4, 5);
		rect2 = new Rectangle(9, 12);
	}
	
	/**
	 * With and height are always more than 1
	 */
	@Test
	public void testConstructor1() {
		assertEquals(rect1.getWidth(), 4);
		assertEquals(rect1.getHeight(), 5);
		
		assertEquals(rect2.getWidth(), 9);
		assertEquals(rect2.getHeight(), 12);
	}
	
	/**
	 * Width or height is less than 1 
	 */
	@Test
	public void testConstructor2() {
		// Width is less than 1
		Rectangle rect = new Rectangle(0, 5);
		assertEquals(rect.getWidth(), 1);
		assertEquals(rect.getHeight(), 5);
		
		// Height is less than 1
		rect = new Rectangle(10, -2);
		assertEquals(rect.getWidth(), 10);
		assertEquals(rect.getHeight(), 1);
		
		// Both width and height are less than 1
		rect = new Rectangle(-7, -3);
		assertEquals(rect.getWidth(), 1);
		assertEquals(rect.getHeight(), 1);
	}
	
	@Test
	public void testGetArea() {
		assertEquals(rect1.getArea(), 20);
		assertEquals(rect2.getArea(), 108);
	}

}
