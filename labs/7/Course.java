import java.util.Arrays;

public class Course {
	
	private String courseName;
	private String[] students = new String[5];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		
		students[numberOfStudents] = student;
		numberOfStudents++;
		if (students.length <= numberOfStudents) {
			this.students = Arrays.copyOf(students, students.length + 5);
		}
	}

	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void dropStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				for (int j=i+1; j < numberOfStudents; j++)
					students[j - 1] = students[j];
				numberOfStudents--;
				return;
			}
		}
	}
	
	public void clear() {
		this.students = new String[5];
		this.numberOfStudents = 0;
	}

}