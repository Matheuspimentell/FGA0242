package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidTrianglesTests {

	@Test
	public void triangleValidity() {
		Triangle t = new Triangle(3,4,5);

        assertTrue(t.isTriangle);
	}

}
