
public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle(2, 2, 5.5);
		System.out.println("c1 area: " + c1.getArea());
		System.out.println("c1 perimeter: " + c1.getPerimeter() + "\n ");
		
		if(c1.contains(3,3))
			System.out.println("c1 does contain point (3,3)");
		else
			System.out.println("c1 does not contain point (3,3)");
		
		if(c1.contains(new Circle(4, 5, 10.5)))
			System.out.println("c1 does contain Circle(4, 5, 10.5)");
		else
			System.out.println("c1 does not contain Circle(4, 5, 10.5)");
		
		if (c1.overlaps(new Circle(3, 5, 2.3)))
			System.out.println("c1 does overlap with Circle(3,5,2.3)");
		else
			System.out.println("c1 does not overlap with Circle(3,5,2.3)");
		

	}

}
