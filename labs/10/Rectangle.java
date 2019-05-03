
public class Rectangle implements Printable {

	private double side1;
	private double side2;
	
	public Rectangle() {}
	
	public Rectangle(double s1, double s2) {
		this.side1 = s1;
		this.side2 = s2;
	}
	
	@Override
	public void print() {
		System.out.println("\nObject type: Rectangle\nSide1: " + 
				this.side1 + "\nSide2: " + this.side2);
	}

}
