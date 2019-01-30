import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will convert a number from ounces to grams.");
		
		// Prompts user to enter a value for ounces
		System.out.println("Enter a value for ounces: ");
		double ounces = input.nextDouble();
		
		// Converts ounces to grams
		double grams = ounces * 28.3495;
		
		// Displays results
		System.out.println(ounces + " ounces is equivalent to " + grams + " grams.");
		
		input.close();
	}

}
