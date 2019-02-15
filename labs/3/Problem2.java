import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will print all numbers from 100 to 500 that are divisible by 5 or 7 but not both.");
		
		int count = 0;
		
		for (int i = 100; i < 500; i++) {
			if ((i % 5 == 0 && i % 7 != 0) || (i % 7 == 0 && i % 5 != 0)) {
				if (count % 10 == 0)
					System.out.println();
				System.out.print(i + " ");
				count++;
				}	
			}
		input.close();
	}
}
