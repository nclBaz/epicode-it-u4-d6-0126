package exceptions;

public class ValidationException extends RuntimeException {
	// Estendendo RUNTIMEEXCEPTION questa sarà una UNCHECKED EXCEPTION
	public ValidationException() {
		super("Errore di validazione!"); // Il messaggio che impostiamo nel super("") sarà quello che verrà visualizzato
		// nel terminale quando avverrà l'eccezione
	}

	public ValidationException(String string) {
		super(string);
	}
}
