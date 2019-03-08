import java.util.Scanner;
public class Project1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Takes input for height of wall, width of wall, and number of bricks
		int h = input.nextInt();
		int w = input.nextInt();
		int n = input.nextInt();
		
		// Creates an array called bricks and fills it with user input for width of each brick;
		int[] bricks = new int[n];
		for (int i = 0; i < n; i++) 
			bricks[i] = input.nextInt();
		
		// Create variable to take into account the width of the wall remaining at each layer
		int widthRemaining = w;
		
		// Uses a brick and then checks if the width of the wall has been completed filled
		for (int i = 0; i < bricks.length; i++) {
			widthRemaining -= bricks[i];
			
			// If the width of the wall has been perfectly filled, move onto next layer, or print yes if it is the last layer. decrements height
			if (widthRemaining == 0) {
				widthRemaining = w;
				h--;
				if (h == 0) 
					System.out.println("YES");
				
			// This will print no if another brick cannot be placed without hyperextending past the given length of the wall.
			} else if (widthRemaining < 0) {
				System.out.println("NO");
				break;
			}
		}
		
		input.close();
	}

	
}
