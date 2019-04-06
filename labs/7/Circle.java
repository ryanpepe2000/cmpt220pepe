
public class Circle {
	double x;
	double y;
	double radius;
	
	Circle(){
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	
	Circle(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	double getX() {
		return x;
	}

	double getY() {
		return y;
	}
	
	double getRadius() {
		return radius;
	}
	
	double getArea() {
		return Math.PI * radius * radius;
	}
	
	double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	boolean contains(double x, double y) {
		return radius > Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	//Using the distance formula, returns true if the radius of a circle is greater than the distance between the 
	//two centers of the circles plus the radius of the smaller circle
	boolean contains(Circle circle) {
		return radius > Math.sqrt(Math.pow((x - circle.getX()), 2) + Math.pow((y - circle.getY()), 2)) + circle.getRadius();
	}
	
	boolean overlaps(Circle circle) {
		return (Math.sqrt(Math.pow((x - circle.getX()), 2) + Math.pow((y - circle.getY()), 2)) - circle.getRadius() - radius <= 0)
				&& !(radius > Math.sqrt(Math.pow((x - circle.getX()), 2) + Math.pow((y - circle.getY()), 2)) + circle.getRadius());
	}
}