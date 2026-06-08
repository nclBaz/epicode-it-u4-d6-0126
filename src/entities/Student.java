package entities;

import exceptions.StudentNotFoundException;
import exceptions.ValidationException;

import java.util.Random;

public class Student {
	private int id;
	private String name;
	private String surname;

	public Student(String name, String surname) {
		this.name = name;
		this.surname = surname;
		Random random = new Random();
		this.id = random.nextInt(1, 1000);
	}

	public static Student findById(int studentId) throws StudentNotFoundException {
		// simuliamo la ricerca in db dello studente...
		Student studentFromDB = new Student("Ajeje", "Brazorf");

		if (studentFromDB != null) return studentFromDB;
		else throw new StudentNotFoundException(studentId); // Checked
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 3) throw new ValidationException(name + " è troppo corto!"); // Unchecked
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				'}';
	}
}
