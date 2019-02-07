import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will generate a random phone number (xxx) xxx-xxxx");
		
		// Generates the first three digits
		double first = (Math.random() * (1000 - 200)) + 200;
		
		// Generates the second three digits
		double second = (Math.random() * (1000));
				
		// Generates the last four digits
		double last = (Math.random() * (10000));
		
		// If number is less that 100 in second set, will add 0 in front.
		// Ex. 72 will become 072
		String secondStr = "";
		if (second < 10) {
			secondStr = "00" + (int)second;
		} else if (10 < second && second < 100) {
			secondStr = "0" + (int)second;
		} else {
			secondStr = "" + (int)second;
		}

		// If number is less than 100 or 1000 will add a 0 or two 0's.
		// Ex. 72 will become 0072 or 242 will become 0242
		String lastStr = "";
		if (last < 10) {
			lastStr = "000" + (int)last;
		} else if (10 < last && last < 100) {
			lastStr = "00" + (int)last;
		} else if (100 < last && last < 1000) {
			lastStr = "0" + (int)last;
		} else {
			lastStr = "" + (int)last;
		}
		
		
		// Prints the phone number
		System.out.println("Generated phone number: " + "(" + (int)first + ")" + " " + secondStr + "-" + lastStr);
		
		input.close();
	}

}
