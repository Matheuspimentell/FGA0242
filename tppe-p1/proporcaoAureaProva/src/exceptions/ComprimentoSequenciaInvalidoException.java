package exceptions;

public class ComprimentoSequenciaInvalidoException extends RuntimeException{

	public ComprimentoSequenciaInvalidoException(int i) {
		super(i + "eh um comprimento invalido para a sequencia de Fibonacci.");
	}

}
