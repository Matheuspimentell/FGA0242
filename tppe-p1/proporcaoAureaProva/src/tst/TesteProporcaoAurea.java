package tst;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.Fibonacci;


@RunWith(Parameterized.class)
public class TesteProporcaoAurea {
	
	// Test Parameters
	int size;
	int pos1;
	int pos2;
	float maxErr;
	
	// Test Object
	Fibonacci f;
	
	public TesteProporcaoAurea(int size, int pos1, int pos2, float maxErr) {
		this.size = size;
		this.pos1 = pos1;
		this.pos2 = pos2;
		this.maxErr = maxErr;
	}
	
	@Parameters
	public static Collection<Object[]> getParameters() {
		int n1 = 7;
		int pos1_1 = 6;
		int pos2_1 = 5;
		float err1 = 0.02f;
		
		int n2 = 8;
		int pos1_2 = 7;
		int pos2_2 = 6;
		float err2 = 0.01f;
		
		int n3 = 10;
		int pos1_3 = 10;
		int pos2_3 = 9;
		float err3 = 0.001f;
		
		Collection<Object[]> parameters = Arrays.asList(new Object[][] {
			{n1, pos1_1, pos2_1, err1},
			{n2, pos1_2, pos2_2, err2},
			{n3, pos1_3, pos2_3, err3}
		});
		
		return parameters;
	}
	
	@Before
	public void setup() {
		f = new Fibonacci(this.size);
	}
	

	@Test
	public void testeProporcaoAurea() {
		int s[] = f.getSequencia();
		assertEquals(Fibonacci.PHI, f.divisaoElementos(this.pos1, this.pos2), this.maxErr);
	}
}
