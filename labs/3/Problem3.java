import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will print characters corresponding to ASCII codes 50 to 100.");
		
		// Loops ASCII equivalents from integers 50 to 100
		int count = 0;
		
		for (int i = 50; i < 100; i++) {
			if (count % 20 == 0)
				System.out.println();
			System.out.print((char)i + " ");
			count++;
			
		}
		input.close();
	}

}
