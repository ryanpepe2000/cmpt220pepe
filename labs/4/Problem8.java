import java.util.Arrays;
import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] list = new double[100];
		
		// Allows users to input up to 100 numbers and use 0 to quit. Counts how many numbers the user enters to remove unnecessary 0.0s.
		int count = 0;
		System.out.println("Enter positive real numbers (0 to quit): ");
		for (int i = 0; i < 100; i++) {
			double userInput = input.nextDouble();
			if (userInput == 0)
				break;
			list[i] = userInput;
			count++;
		}

		list = Arrays.copyOfRange(list, 0, count);
		selectionSort(list);
		System.out.println(Arrays.toString(list));
		
		input.close();
	}

	/** Selection sort method created in class. Sorts array from least to greatest. */
	public static void selectionSort(double[] list) {
		for (int i = 0; i < list.length; i++) {
			double currentMin = list[i];
			int currentMinIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}
