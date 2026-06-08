package entities;

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

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 3) throw new ValidationException(name + " è troppo corto!");
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
