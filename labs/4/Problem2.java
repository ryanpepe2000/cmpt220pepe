
public class Problem2 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			PrintLine();
		}
		
		

	}

	private static void PrintLine() {
		for (int i = 0; i < 5; i++) {
			
			int n = (int)( Math.random() * 26);
			char letter = (char)(n + 97);
			System.out.print(letter + " ");
				
		}
		System.out.println("");
	}

}
