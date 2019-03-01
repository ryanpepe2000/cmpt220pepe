
public class Problem5 {

	public static void main(String[] args) {

		System.out.println("This program will generate 1000 random ints from 1-1000"
				+ "\nand print the number of ints greater than and less than the average");
		// Generates array of 1000 random integers 1-1000
		int[] randomInts = new int[1000];
		for (int i = 0; i < 1000; i++) 
			randomInts[i] = (int)(Math.random() * 1000 + 1);	

		// Calculates average of the 1000 integers
		int sum = 0;
		double average = 0.0;
		for (int i = 0; i < 1000; i++) 
			sum += i;
		average = sum / 1000;
		
		// Prints count of numbers less than average and greater then
		int countLessThanAvg = 0;
		int countMoreThanAvg = 0;
		for (int i = 0; i < 1000; i++) {
			if (randomInts[i] < average) 
				countLessThanAvg++;
			else if (randomInts[i] > average)
				countMoreThanAvg++;
		}
		
		System.out.println("\nThere are " + countLessThanAvg + " integers less than the average.");
		System.out.println("There are " + countMoreThanAvg + " integers greater than the average.");
	}
}