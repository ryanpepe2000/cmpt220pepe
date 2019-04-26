import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a binary string: ");
		String binaryString = input.next();
		int num = bin2Dec(binaryString);
		System.out.println("Decimal: " + num);
		
		input.close();
	}
	
	public static int bin2Dec(String binaryString) throws NumberFormatException{
		int number = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) == '1')
				number += 2;
			else if (binaryString.charAt(i) != '0')
				throw new NumberFormatException();
			number *= 2;
		}
		number /= 4;
		
		return number;
	}

}
