import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTest {


	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTriangle() {
		Triangle tri = new Triangle(6,4,5);
		assertEquals(tri.lborderA, 6);
		assertEquals(tri.lborderB, 4);
		assertEquals(tri.lborderC, 5);
	}

	@Test
	public void testIsTriangle() {
		Triangle tri = new Triangle(3,3,3);
		assertTrue(tri.isTriangle(tri));
		Triangle tri1 = new Triangle(1,2,3);
		assertFalse(tri1.isTriangle(tri1));
	}

	@Test
	public void testGetType() {
		
		Triangle tri = new Triangle(3,3,3);
		assertEquals(tri.getType(tri), "Regular");
		Triangle tri2 = new Triangle(5,5,6);
		assertEquals(tri.getType(tri2), "Isosceles");
		Triangle tri1 = new Triangle(3,4,5);
		assertEquals(tri.getType(tri1), "Scalene");
		Triangle tri3 = new Triangle(1,2,3);
		assertEquals(tri.getType(tri3), "Illegal");
		Triangle tri4 = new Triangle(-1,2,3);
		assertEquals(tri.getType(tri4), "Illegal");
	}

	@Test
	public void testDiffOfBorders() {
		Triangle tri = new Triangle(1,7,7);
		assertEquals(tri.diffOfBorders(1, 2),1);
	}

	@Test
	public void testGetBorders() {
		Triangle tri = new Triangle(1,5,5);
		long c[] = {1,5,5};
		assertArrayEquals(tri.getBorders(), c);
	}

}
