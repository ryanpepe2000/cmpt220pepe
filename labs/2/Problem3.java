import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will generate three random integers between two inputed integers");
		
		// Asks for lower and upper integer boundaries
		System.out.print("Enter an upper integer limit: ");
		int number1 = input.nextInt();
		System.out.print("Enter a lower integer limit ");
		int number2 = input.nextInt();
		
		// Generates three random numbers between inputed numbers.
		double randInt1 = (Math.random() * (number1 - number2)) + number2;
		double randInt2 = (Math.random() * (number1 - number2)) + number2;
		double randInt3 = (Math.random() * (number1 - number2)) + number2;

		// Prints the three random numbers
		System.out.println("Number 1: " + ((int)randInt1));
		System.out.println("Number 2: " + ((int)randInt2));
		System.out.println("Number 3: " + ((int)randInt3));
		
		input.close();
	}

}
