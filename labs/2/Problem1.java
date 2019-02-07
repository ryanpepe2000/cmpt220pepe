import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will display equivalence between two numbers.");
		
		// Creates variables to store user input for number1 and number2.
		System.out.print("Enter number 1: ");
		double number1 = input.nextDouble();
		System.out.print("Enter number 2: ");
		double number2 = input.nextDouble();
		
		// Prints all equivalence statements
		System.out.println(number1 + " is LESS THEN " + number2 + "? " + (number1 < number2));
		System.out.println(number1 + " is LESS THEN OR EQUAL TO " + number2 + "? " + (number1 <= number2));
		System.out.println(number1 + " is EQUAL TO " + number2 + "? " + (number1 == number2));
		System.out.println(number1 + " is NOT EQUAL TO " + number2 + "? " + (number1 != number2));
		System.out.println(number1 + " is GREATER THEN " + number2 + "? " + (number1 > number2));
		System.out.println(number1 + " is GREATER THEN OR EQUAL TO " + number2 + "? " + (number1 >= number2));

		input.close();
	}

}
