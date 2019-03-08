import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will compute the average of the values of a column.");
		
		// User will choose the size of the matrix.
		System.out.println("Number of Rows: ");
		int row = input.nextInt();
		System.out.println("Number of Columns: ");
		int col = input.nextInt();
	
		
		// Creates a matrix of size <row, column> and fills it with user input
		System.out.println("Enter the matrix:");
		double[][] array = new double[row][col];
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				array[i][j] = input.nextInt();
		
		System.out.println("Enter column index to compute  average:  ");
		int colNum = input.nextInt();
		double average = averageColumn(array, colNum, row, col);
		
		System.out.println("The average is " + average);
		input.close();
	}
	
	/**This method will return the average of a column of an array.
	 * 
	 * @param array = Name of 2D array 
	 * @param colIdx = Index of column that you would like average of
	 * @param row = number of rows in matrix
	 * @param col = number of columns in matrix
	 * @return
	 */
	public static double averageColumn(double[][] array, int colIdx, int row, int col) {
		double sum = 0.0;
		for (int i = 0; i < row; i++) {
			sum += array[i][colIdx];
			}
		return sum / row;
	}
}
