import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		
		if (isPalindrome(s))
			System.out.println("The string '" + s + "' IS a palindrome");
		else
			System.out.println("The string '" + s + "' IS NOT a palindrome");
		input.close();
	}
	
	public static String reverse(String s) {
		String reverseString = "";
		
		for (int i= s.length() - 1; i >= 0; i--) {
			reverseString += s.charAt(i);
		}
		return reverseString;
	}

	public static boolean isPalindrome(String s) {
		if (s.toLowerCase().contentEquals(reverse(s.toLowerCase())))
			return true;
		else
			return false;
	}
}
