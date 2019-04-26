import java.util.Scanner;

public class TestTriangle {
	
	public static void main(String[] arg){
		try(Scanner input = new Scanner(System.in)){
			System.out.println("Enter the three sides of a traingle: ");
			double s1 = input.nextDouble();
			double s2 = input.nextDouble();
			double s3 = input.nextDouble();
			Triangle triangle = new Triangle(s1, s2, s3);
			
			System.out.println("Enter the color of the triangle: ");
			String color = input.next();
			triangle.setColor(color);
			
			System.out.println("Is the triangle filled? (y/n): ");
			boolean isFilled = input.next().toLowerCase().charAt(0) == 'y';
			if (isFilled)
				triangle.fill();
			else
				triangle.unfill();
			
			System.out.println("\nArea: " + triangle.getArea());
			System.out.println("Perimeter: " + triangle.getPerimeter());
			System.out.println("Color: " + triangle.getColor());
			System.out.println("Filled: " + triangle.getIsFilled());
		} catch(IllegalTriangleException e) {
			System.out.println("This does not work");
		}
	}
}
