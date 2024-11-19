package exceptions;

public class ComprimentosSequenciasDiferentesException extends RuntimeException{

	public ComprimentosSequenciasDiferentesException(int length, int length2) {
		super("Comprimentos das sequencias sao diferentes. Fib = " + length + "; Vetor = " + length2 + ".");
	}

}
