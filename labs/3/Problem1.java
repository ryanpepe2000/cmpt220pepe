import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will read a sequence of positive integers and output the numer of even numbers, the sum of the numbers, and the average.");
		
		// Creates a variable with the int data type
		System.out.println("Enter a positive integer (the input ends with a 0): ");
		int num;
		
		int sum = 0;
		int even = 0;
		int count = 0;
		
		// Loops input and makes calculations based on each input
		while ((num = input.nextInt()) != 0) {
			if (num % 2 == 0)
				even = even + 1;
			sum = sum + num;
			count++;	
		}
		
		// Calculates average
		double average = (sum * 1.0) / (count * 1.0);
		
		// Prints results
		System.out.println("The number of even numbers: " + even);
		System.out.println("The total sum: " + sum);
		System.out.println("The average is: " + average);
		
		input.close();
	}

}
