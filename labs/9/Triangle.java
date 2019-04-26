
public class Triangle extends GeometricObject{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	private boolean isFilled;
	private String color;
	
	Triangle(){	
	}
	
	Triangle(double s1, double s2, double s3) throws IllegalTriangleException{
		
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
		
		if ((side1 > side2 + side3) || (side2 > side1 + side3) || (side3 > side1 + side2))
			throw new IllegalTriangleException();
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;
	}
	
	public boolean getIsFilled() {
		return isFilled;
	}
	
	public void fill() {
		this.isFilled = true;
	}
	
	public void unfill() {
		this.isFilled = false;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
}
