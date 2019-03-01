
public class Problem1 {

	public static void main(String[] args) {
		System.out.println("in      cm | cm      in");
		System.out.print("-----------------------");
		for (int i = 1, j = 1; i < 51; i++, j+=5) {
			System.out.printf("\n%2d ", i);
			System.out.printf("%7s", ""+Math.round(i*254) / 100.0);
			System.out.print(" | ");
			System.out.printf("%2d ", j);
			System.out.printf("%7s", ""+Math.round(j*254) / 100.0);
		}
		

	}

}
