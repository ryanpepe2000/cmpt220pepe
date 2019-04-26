import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		int[] array = new int[100];
		for (int i = 0; i < 100; i++) 
			array[i] = (int)(Math.random() * 100);
		
		try (Scanner input = new Scanner(System.in)){
			
			System.out.println("Enter an array index: ");
			int idx = input.nextInt();
			System.out.println("\nElement: " + array[idx]);
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Out of Bounds");
		}
		
	}

}
