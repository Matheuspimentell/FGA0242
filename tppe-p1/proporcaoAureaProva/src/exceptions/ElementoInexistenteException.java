package exceptions;

public class ElementoInexistenteException extends RuntimeException {
	public ElementoInexistenteException() {
		super("Elemento inexistente na sequencia.");
	}
}
