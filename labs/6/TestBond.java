
public class TestBond {

	public static void main(String[] args) {
		Bond bond = new Bond(500, 100, .05, 10000);
		
		System.out.printf("Price of Bond: $%.2f", bond.getPrice());

	}

}
