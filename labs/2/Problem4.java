import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will print the integer value of the sum of two characters.");
		
		// Asks for two characters as input.
		System.out.print("Enter first character: ");
		char first = input.next().charAt(0); 
		System.out.print("Enter second character: ");
		char second = input.next().charAt(0);
		
		// Prints result 
		System.out.println("Result is: " + (int)(first + second));
		
		input.close();
	}

}
