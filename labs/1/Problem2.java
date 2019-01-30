
public class Problem2 {

	public static void main(String[] args) {
		
		double piWithSixTerms = 4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
		double piWithSevenTerms = 4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13));
		System.out.println("Calculating pi using six terms results in: " + piWithSixTerms);
		System.out.println("Calculating pi using seven terms results in : " + piWithSevenTerms);
		
	}

}
