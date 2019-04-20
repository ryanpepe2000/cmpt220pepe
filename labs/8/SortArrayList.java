import java.util.ArrayList;

public class SortArrayList {
	
	public static void sort(ArrayList<Integer> list) {
		int first;
		int second;
		while (isNotSorted(list))
			for (int i = 0; i < list.size() - 1; i++) {
				first = list.get(i);
				second = list.get(i+1);
				if (first > second) {
					list.set(i+1, first);
					list.set(i, second);
				}
			}
	}
	
	public static boolean isNotSorted(ArrayList<Integer> list) {
		for (int i = 0; i < list.size()-1; i++) {
			if (list.get(i) > list.get(i+1))
				return true;
		}
		return false;
	}
}
