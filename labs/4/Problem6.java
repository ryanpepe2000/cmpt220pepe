import java.util.Arrays;

public class Problem6 {

	public static void main(String[] args) {
		int[] list = {};
		for (int i = 1; i < 11; i++) {
			list = AppendArray(list, i);
			System.out.println("Current List: " + Arrays.toString(list));
		}
		
		// Creates new lists after the insertion is completed and prints standard output 
		list = InsertArray(list, 10, 3);
		System.out.println("\nInsert 10 to position 3:" + Arrays.toString(list));
		
		list = InsertArray(list, 100, 7);
		System.out.println("Insert 100 to position 7: " + Arrays.toString(list));
	}

	/** Method creates a copy of list and increases the length by one
	 then it will return this new list*/
	private static int[] AppendArray(int[] list, int integer) {
		list = Arrays.copyOf(list, list.length + 1);
		list[list.length - 1] = integer;
		return list;
	}
	
	/** Method inserts an integer into a given position of an array.
	 * @param list 
	 * @param integer - Integer you want to insert
	 * @param position - Position where you want to insert integer
	 * @return
	 */
	private static int[] InsertArray(int[] list, int integer, int position) {
		int[] copyOfBeginning = {};
		int[] copyOfEnd = {};
		int[] newList = {};
		
		copyOfBeginning = Arrays.copyOfRange(list, 0, position);
		copyOfBeginning = AppendArray(copyOfBeginning, integer);
		copyOfEnd = Arrays.copyOfRange(list, position, list.length);

		for (int i = 0; i < copyOfBeginning.length; i++)
			newList = AppendArray(newList, copyOfBeginning[i]);
		for (int i = 0; i < copyOfEnd.length; i++)
			newList = AppendArray(newList, copyOfEnd[i]);
		
		return newList;
	}
}
