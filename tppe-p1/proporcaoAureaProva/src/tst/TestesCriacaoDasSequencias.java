package tst;

import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.Fibonacci;

@RunWith(Parameterized.class)
public class TestesCriacaoDasSequencias {
	
	// Test attributes
    int size;
	int expectedResult[];
	
	// Test Object
	Fibonacci f;
	
	public TestesCriacaoDasSequencias(int size, int expectedResult[]) {
		this.size = size;
		this.expectedResult = expectedResult;
	}
	
	@Parameters
    public static Collection<Object[]> getParameters() {
        int size1 = 3;
        int res1[] = new int[size1];
        res1[0] = 1;
        res1[1] = 1;
        res1[2] = 2;
        
        int size2 = 4;
        int res2[] = new int[size2];
        res2[0] = 1;
        res2[1] = 1;
        res2[2] = 2;
        res2[3] = 3;
        
        int size3 = 6;
        int res3[] = new int[size3];
        res3[0] = 1;
        res3[1] = 1;
        res3[2] = 2;
        res3[3] = 3;
        res3[4] = 5;
        res3[5] = 8;
        
        Collection<Object[]> parameters = Arrays.asList(new Object[][] {
        	{size1, res1},
        	{size2, res2},
        	{size3, res3}
        });

        return parameters;
    }
	
	@Before
	public void setup() {
		f = new Fibonacci(this.size);
    }
	
	
	@Test
	public void testeCriacaoDasSequencias() {
		int s[] = f.getSequencia();
		for(int i = 0; i < this.size; i++) {
			assertEquals(this.expectedResult[i], s[i]);	
		}
	}
}
