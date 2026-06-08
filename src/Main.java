import entities.Student;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// ******************************** ERRORS ********************************************
		/*
		Gli ERRORS sono tipi di problemi che non possiamo nè gestire nè prevenire
		Il problema si risolve o modificando il codice incriminato oppure in casi peggiori
		anche dovendo risolvere problemi fisici del computer
		*/

//		print("HELLO"); // StackOverflowError

		// *************************************** UNCHECKED EXCEPTIONS ***************************************
		// Sono eccezioni che derivano dalla classe RuntimeException e per queste non abbiamo alcun obbligo di
		// gestione, cioè il codice partirà a prescindere se io abbia messo un try-catch o no

		Scanner scanner = new Scanner(System.in);

//		System.out.println("Dammi un numero da 0 a 5");
//		int input = Integer.parseInt(scanner.nextLine());
//
//		int[] numbers = {0, 1, 2, 3, 4, 5};
//		if (input >= 0 && input <= 5)
//			System.out.println(numbers[input]); // ArrayIndexOutOfBoundsException
//		else System.out.println("Numero fuori range!");

//		System.out.println("Dammi un numero");
//		int num1 = Integer.parseInt(scanner.nextLine());
//
//		System.out.println("Dammi un secondo numero diverso da zero");
//		int num2 = Integer.parseInt(scanner.nextLine());
//
//		if (num2 != 0)
//			System.out.println(num1 / num2); // ArithmeticException
//		else System.out.println("ERRORE! Ti avevo detto diverso da ZERO!");
//
//		Object object = new Object();
//
//		object = null;
//
//		if (object != null)
//			System.out.println(object.getClass().getSimpleName()); // NullPointerException


		// ****************************************** CHECKED EXCEPTIONS ***************************************
		// Con questo tipo di eccezione abbiamo l'OBBLIGO DI GESTIONE. Ciò significa che non potrò neanche eseguire il codice
		// fino a che non avrò scritto del codice per gestirle

//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			throw new RuntimeException(e);
//		}
//
//		System.out.println("QUA");


		Student aldo = new Student("Aldo", "Baglio");
		System.out.println("Dammi un nuovo nome per Aldo");
		String newName = scanner.nextLine();

		aldo.setName(newName);
	}

//	public static void print(String string) {
//		print(string);
//	}
}
