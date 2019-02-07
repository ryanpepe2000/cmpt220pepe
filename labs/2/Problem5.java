import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will compare two strings lexiocographically and sort them in ascending order.");
		
		// Asks the user for two strings
		System.out.print("Enter a string: ");
		String str1 = input.nextLine();
		
		System.out.print("Enter another string: ");
		String str2 = input.nextLine();
		
		String str3 = "";
		
		// Sorts strings lexicographically
		if ((str1.compareTo(str2) < 0)){
			str3 = str1 + " " + str2;
		} else if ((str1.compareTo(str2) == 0)) {
			System.out.println("These strings are lexicographically equivalent.");
		
		} else {
			str3 = str2 + " " + str1;
		}
		
		//Outputs combined strings sorted lexicographically
		System.out.println(str3);
		
		input.close();
	}

}
