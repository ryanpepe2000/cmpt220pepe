import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("How many rows/cols are in the matrix?:");
		int size = input.nextInt();
		
		// Creates and populates array with user input
		System.out.println("Enter the array: ");
		int[][] array = new int[size][size];
			for (int i = 0; i < array.length; i++)
				for (int j = 0; j < array.length; j++)
					array[i][j] = input.nextInt();
		
			if (isUpperTriangular(array))
				System.out.println("\nThis is an upper triangular matrix");
			else 
				System.out.println("\nThis is not an upper triangular matrix");
		
		input.close();
	}
	
	/** Checks to see if the array is upper triangular by returning false if the elements below
	 * the diagonal are not zero.
	 * @param array
	 * @return Boolean expression for if the array is uppertriangular
	 */
	public static boolean isUpperTriangular(int[][] array) {
		for (int i = 1; i < array.length; i++)
			for (int j = 0; j < i; j++)
				if (array[i][j] != 0)
					return false;
		return true;
	}
}
