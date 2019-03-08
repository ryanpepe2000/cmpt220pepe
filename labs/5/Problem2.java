import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will calculate the mean and standard deviation of 10 numbers.");
		
		// Creates an array and fills with user input
		System.out.println("Enter 10 numbers: ");
		double[] list = new double[10];
		for (int i = 0; i < 10; i++)
			list[i] = input.nextDouble();
		
		// Stores the mean and standard deviation as doubles
		double mean = mean(list);
		double stdDev = deviation(list);

		System.out.println("Mean: " + mean + "\nStandard Deviation: " + stdDev);
		input.close();
	}

	/** Computes the mean of the values in an array
	 * 
	 * @param list
	 * @return Mean of the values in the array
	 */
	private static double mean(double[] list) {
		double sum = 0;
		for (int i = 0; i < 10; i++)
			sum += list[i];
		return sum/10;
	}
	
	/** Computes the standard deviation of the values in an array
	 * 
	 * @param list
	 * @return Standard Deviation of values in array
	 */
	private static double deviation(double[] list) {
		double mean = mean(list);
		double sum = 0;
		double stdDev = 0;
		for (int i = 0; i < 10; i++) 
			sum += Math.pow((list[i] - mean), 2);
		stdDev = Math.sqrt(sum/9);
		return stdDev;
	}



}
