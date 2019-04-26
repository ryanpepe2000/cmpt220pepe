
public class IllegalTriangleException extends Exception{

	private static final long serialVersionUID = 1L;

	public IllegalTriangleException() {
		super("Given sides cannot create a triangle");
	}
}