package tst;

public class CriacaoSequenciasObject {
    private int size;
	private int expectedResult[];
	
	public CriacaoSequenciasObject(int size, int expectedResult[]) {
		this.size = size;
		this.expectedResult = expectedResult;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public int[] getExpectedResult() {
		return this.expectedResult;
	}
}
