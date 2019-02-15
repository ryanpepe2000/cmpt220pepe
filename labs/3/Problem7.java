public class Problem7 {

	public static void main(String[] args) {
		// Acts as the counter 
		int count = 1;
		
		// Loops from 1 to 50 calculating the pentagonal number for each digit.
		for (int i = 1; i < 50; i++) {
			System.out.printf("%-8d", pentagonalNumber(i));
			if (count % 10 == 0)
				System.out.println();
			count++;
		}
	}

	/** Method takes an integer as input and calculates pentagonal number formula */
	private static int pentagonalNumber(int n) {
		return ((3 * n * n) - n) / 2;
	}

}
