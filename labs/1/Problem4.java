import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will calculate energy using the equation for special relativity.");
		
		// Creates variable to store the speed of light in m/s
		double speedOfLight = 299972458.0;
		double speedOfLightSquared = speedOfLight * speedOfLight;
		
		// Prompts the user to enter mass
		System.out.println("Enter a value for mass: ");
		double mass = input.nextDouble();
		
		// Calculates energy using E = mc^2
		double energy = mass * speedOfLightSquared;
		
		// Prints result
		System.out.println("Energy = " + energy);
		
		input.close();
	}

}
