import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Create the first array and initialize it with the size of the first integer
		System.out.println("Enter the first array: ");
		int size = input.nextInt();
		size++;
		int[] first = new int[size];
		
		// Sets the first value of the array to <size> and loops to fill the rest with input.
		first[0] = size - 1;
		for (int i = 1; i < size; i++) {
			first[i] = input.nextInt();
		}
		
		// Creates second array and user inputs <size> values.
		int[] second = new int[size];
		System.out.println("Enter the second array: ");
		for (int i = 0; i < size; i++)
			second[i] = input.nextInt();
		
		// Prints output based on whether the strings contain the same elements.
		if (equal(first, second))
			System.out.println("The two arrays are identical");
		else
			System.out.println("The two arrays are not identical");
		
		input.close();
	}
	
	public static boolean equal(int[] x, int[] y) {
		// Sorts the two lists and sets them up for comparison
				Arrays.sort(x);
				Arrays.sort(y);
				String firstList = Arrays.toString(x);
				String secondList = Arrays.toString(y);
				return firstList.contentEquals(secondList);
	}

}
