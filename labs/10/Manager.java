
public class Manager extends Employee{
	
	Manager(String name, double age, double wage){
		super(name, age, wage);
	}
	
	@Override
	public double salary(double hours) {
		return hourRate * hours;
	}

}
