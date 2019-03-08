import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will print a sorted list of students and scores.");
		
		System.out.println("Enter number of students: ");
		int numberStudents = input.nextInt();
		
		// Creates and fills two arrays with the score and student name sharing the same index.
		double[] score = new double[numberStudents];
		String[] name = new String[numberStudents];
		for (int i = 0; i < numberStudents; i++) {
			System.out.println("Enter student's first name, followed by score");
			name[i] = input.next();
			score[i] = input.nextDouble();
		}
		
		// Sorts the scores in ascending order while keeping the name at the same index as associated score.
		sortScores(score, name);
		System.out.println();
		for (int i = 0; i < numberStudents; i++)
			System.out.println(name[i] + ", " + score[i]);
		input.close();
		}
	
	/** Uses a selection sort method to sort two arrays in parallel.
	 * 
	 * @param scoreList
	 * @param nameList
	 */
	static void sortScores(double[] scoreList, String[] nameList) {
			for (int i = 0; i < scoreList.length; i++) {
				double currentMin = scoreList[i];
				String currentNameMin = nameList[i];
				int currentMinIndex = i;
				for (int j = i + 1; j < scoreList.length; j++) {
					if (currentMin > scoreList[j]) {
						currentMin = scoreList[j];
						currentNameMin = nameList[j];
						currentMinIndex = j;
					}
				}
				
				if (currentMinIndex != i) {
					scoreList[currentMinIndex] = scoreList[i];
					scoreList[i] = currentMin;
					nameList[currentMinIndex] = nameList[i];
					nameList[i] = currentNameMin;
				}
			}
		}
	}
