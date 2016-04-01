package cn.tjuscs.st;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class triangleTest {
	private triangle triangle = new triangle();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTriangletype() {
		assertEquals(0,triangle.triangletype(0, 2, 3));
		assertEquals(0,triangle.triangletype(1, 2, 4));
		assertEquals(1,triangle.triangletype(3, 3, 3));
		assertEquals(2,triangle.triangletype(2, 2, 3));
		assertEquals(3,triangle.triangletype(4, 2, 3));
		assertEquals(0,triangle.triangletype(1, 2, 3));
	}
}
