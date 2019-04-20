import java.util.ArrayList;
import java.util.Scanner;

public class TestSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter five integers: ");
		int int1 = input.nextInt();
		int int2 = input.nextInt();
		int int3 = input.nextInt();
		int int4 = input.nextInt();
		int int5 = input.nextInt();

		ArrayList<Integer> lst = new ArrayList<>();
		lst.add(int1);
		lst.add(int2);
		lst.add(int3);
		lst.add(int4);
		lst.add(int5);
		
		SortArrayList.sort(lst);
		System.out.println("Sorted List: " + lst.toString());
		
		input.close();
	}

}
