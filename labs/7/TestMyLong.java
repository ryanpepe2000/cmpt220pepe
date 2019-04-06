
public class TestMyLong {

	public static void main(String[] args) {
		MyLong value = new MyLong(191);
		
		System.out.println("MyLong value = new MyLong(191): " + value.getValue());
		System.out.println("\nTesting nonstatic methods...");
		System.out.println("isEven(): " + value.isEven());
		System.out.println("isOdd(): " + value.isOdd());
		System.out.println("isPrime(): " + value.isPrime());
		
		System.out.println("\nTesting static methods...");
		System.out.println("MyLong.isEven(24): " + MyLong.isEven(24));
		System.out.println("MyLong.isOdd(24): " + MyLong.isOdd(24));
		System.out.println("MyLong.isPrime(24): " + MyLong.isPrime(24));
		
		System.out.println("\nTesting static methods with MyLong parameters...");
		System.out.println("MyLong.isEven(new MyLong(29)): " + MyLong.isEven(new MyLong(29)));
		System.out.println("MyLong.isOdd(new MyLong(29)): " + MyLong.isOdd(new MyLong(29)));
		System.out.println("MyLong.isPrime(new MyLong(29)): " + MyLong.isPrime(new MyLong(29)));
		
	}

}
