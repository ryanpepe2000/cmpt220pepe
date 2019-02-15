import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		//This program will take three numbers as input and print the average
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Three Numbers: ");
		System.out.println(average(input.nextDouble(), input.nextDouble(), input.nextDouble()));
		
		input.close();
	}
	
	//This method takes the average of three numbers
	public static double average(double a, double b, double c) {
		double average = ((a*1.0) + (b*1.0) + (c*1.0)) / 3.0;
		return average;
	}
}
