import java.util.Arrays;
import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Creates a blank array of length <length> given by user.
		System.out.println("How many numbers will be in the list?: ");
		int length = input.nextInt();
		double[] list = new double[length];
		
		// Replaces each value of list with user input
		System.out.println("Enter " + length + " values: ");
		for (int i = 0; i < length; i++)
			list[i] = input.nextInt();
		
		// Sorts the array into ascending order using method created in class
		selectionSort(list);
		System.out.println(Arrays.toString(list));
		
		list = removeDuplicates(list);
		
		System.out.println(Arrays.toString(list));
		
		input.close();
		
}

	private static double[] removeDuplicates(double[] list) {
		double[] tempList = new double[list.length];
		int numberOfDuplicates = 0;
		int index = 0;
		for (int i = 0; i < list.length - 1; i++) {
			double j = list[i];
			if (j != list[i+1]) 
				tempList[index++] = j;
			else
				numberOfDuplicates++;
		}
		
		
		tempList[index++] = list[list.length-1];
		
		tempList = Arrays.copyOfRange(tempList, 0, list.length - numberOfDuplicates);
		
		return tempList;
	}

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
