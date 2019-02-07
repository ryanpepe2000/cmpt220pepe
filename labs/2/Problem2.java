import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will tell the user to which month a number corresponds.");
		// Asks the user to enter a number for month
		System.out.println("Enter a number for the month: ");
		int month = input.nextInt();
		
		// Conducts series of is else to figure out which month the number is.
		if (month == 1) {
			System.out.println("The first month is January");
		} else if (month == 2) {
			System.out.println("The second month is February");
		} else if (month == 3) {
			System.out.println("The third month is March");
		} else if (month == 4) {
			System.out.println("The fourth month is April");
		} else if (month == 5) {
			System.out.println("The fifth month is May");
		} else if (month == 6) {
			System.out.println("The sixth month is June");
		} else if (month == 7) {
			System.out.println("The seventh month is July");
		} else if (month == 8) {
			System.out.println("The eighth month is August");
		} else if (month == 9) {
			System.out.println("The ninth month is September");
		} else if (month == 10) {
			System.out.println("The tenth month is October");
		} else if (month == 11) {
			System.out.println("The eleventh month is November");
		} else if (month == 12) {
			System.out.println("The twelfth month is December");
		} else {
			System.out.println(month + " is not a valid month number.");
		}
		
		input.close(); 
	}

}
