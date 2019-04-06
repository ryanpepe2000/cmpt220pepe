public class TestCourse {

	public static void main(String[] args) {
		Course course = new Course("CMPT220");
		course.addStudent("Ryan");
		course.addStudent("Mike");
		course.addStudent("Jim");
		course.dropStudent("Jim");
		
		System.out.println("Students enrolled in " + course.getCourseName() + ":");
		for (int i = 0; i < course.getStudents().length; i++)
			if (course.getStudents()[i] != null)
				System.out.print(course.getStudents()[i] + " ");
	}

}
