import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will find the largest prime number < 15,000");
		
		for (int n = 15000; n>1; n--) {
			if (isPrime(n)) {
				System.out.println(n);
				break;
			}
		}
		
		input.close();
	}
	
	
	/** Checks if the number is prime */
	private static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}
}
