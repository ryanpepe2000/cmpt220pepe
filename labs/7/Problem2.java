import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StackOfIntegers stack = new StackOfIntegers();
		System.out.println("Enter a positive integer: ");
		int number = input.nextInt();
		
		for (int i = 2; i <= number; i++) 
			while (number % i == 0) {
				stack.push(i);
				number = number / i;
			}
		int size = stack.getSize();
		for (int i = 0; i < size; i++)
			System.out.print(stack.pop() + " ");
		input.close();
	}

}
