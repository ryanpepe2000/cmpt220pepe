import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string of text: ");
		String text = input.nextLine();
		
		
		// Removes all white space from the input string 
		text = text.replaceAll("\\s", "");
		
		// Initializes an array of count
		char characters[] = new char[text.length()];
		
		// Loops through every character of the string and adds it to count array
		for (int i = 0; i < text.length(); i++)
			characters[i] = text.charAt(i);
		
		// Counts occurrence of each character
		for (char c = 33; c <= 127; c++) {
			int count = 0;
			for (char ch : characters) 
				if (c == ch) 
					count++;
			if (count != 0)
				System.out.println("The character '" + (char)c + "' is used "
					+ count + " times.");
		}
		
		input.close();
	}

}
