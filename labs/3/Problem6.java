import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		System.out.println("This program will count the vowels in a string given as input.");
		Scanner input = new Scanner(System.in);
		
		// Asks user to enter a string and converts it to lower case
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		str = str.toLowerCase();
		
		//Invokes count method to return the number of vowels
		int numberOfVowels = count(str);
		System.out.println("There are " + numberOfVowels + " vowels in your string.");
		
		input.close();
	}
	
	/** Method that returns the number of vowels by looping through the length of the string and checking each character. */
	private static int count(String str) {
		int numberOfVowels = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
				numberOfVowels++;
		}
		return numberOfVowels;
	}

}
