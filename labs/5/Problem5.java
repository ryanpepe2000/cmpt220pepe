import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will transpose a matrix.");
		
		System.out.println("Enter the size of the matrix.");
		int size = input.nextInt();
		
		
		System.out.println("Enter the values:");
		int[][] array = new int[size][size];
		// Traverses array and takes user input for matrix
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				array[i][j] = input.nextInt();
			}
		}
		
		// Traverses the array and prints the matrix 
		for (int i = 0; i < size; i++) {
			System.out.println();
			for(int j = 0; j < size; j++) {
				System.out.print(array[i][j] + " ");
			}
		}
		
		int[][] transposedArray = transpose(array, size);
		System.out.println("\n\nis");
		
		// Traverses the altered array and prints the new matrix
		for (int i = 0; i < size; i++) {
			System.out.println();
			for(int j = 0; j < size; j++) {
				System.out.print(transposedArray[i][j] + " ");
			}
		}
		
		input.close();
	
	}

	private static int[][] transpose(int[][] array, int size) {
		
		int[][] transposedArray = new int[size][size];
		for (int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				transposedArray[i][j] = array[j][i];
			}
		}
		return transposedArray;
	}
	

}
