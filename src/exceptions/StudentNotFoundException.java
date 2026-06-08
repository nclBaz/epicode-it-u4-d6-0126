package exceptions;

public class StudentNotFoundException extends Exception {
	// Estendendo EXCEPTION questa sarà una CHECKED EXCEPTION
	public StudentNotFoundException() {
		super("Studente non trovato!");
	}

	public StudentNotFoundException(int id) {
		super("Lo studente con id " + id + " non è stato trovato");
	}
}
