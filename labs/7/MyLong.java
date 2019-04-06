
public class MyLong {
	long value;
	
	MyLong(long value){
		this.value = value;
	}
	
	long getValue() {
		return this.value;
	}
	
	boolean isEven() {
		return value % 2 == 0;		
	}
	
	boolean isOdd() {
		return value % 2 != 0;
	}
	
	boolean isPrime() {
		for (long i = 2; i <= value / 2; i++)
			if (value % i == 0)
				return false;
		return true;
	}
	
	static boolean isEven(long value) {
		return value % 2 == 0;
	}
	
	static boolean isOdd(long value) {
		return value % 2 != 0;
	}
	
	static boolean isPrime(long value) {
		for (long i = 2; i <= value / 2; i++) 
			if (value % i == 0)
				return false;
		return true;
	}
	
	static boolean isEven(MyLong value) {
		return value.getValue() % 2 == 0;
	}
	
	static boolean isOdd(MyLong value) {
		return value.getValue() % 2 != 0;
	}
	
	static boolean isPrime(MyLong value) {
		for (long i = 2; i <= value.getValue() / 2; i++)
			if (value.getValue() % i == 0)
				return false;
		return true;
	}
	
	boolean equals(long value) {
		return this.value == value;
	}
	
	boolean equals(MyLong value) {
		return this.value == value.getValue();
	}
	
	static long parseLong(char[] characters) {
		long number = 0;
		for (int i = 0; i < characters.length; i++) {
			number = (number * 10) + (characters[i] - '0');
		}
		return number;
	}
	
	static long parseLong(String str) {
		long number = 0;
		for (int i = 0; i < str.length(); i++) {
			number = (number * 10) + (str.charAt(i) - '0');
		}
		return number;
	}
}
