
public class Manager2 implements Printable {
	private String name;
	private double yearlyWage;
	
	Manager2(){}
	
	Manager2(String name, double wage){
		this.name = name;
		this.yearlyWage = wage;
	}
	
	@Override
	public void print() {
		System.out.println("\nObject type: Manager\nName: " + 
				this.name + "\nYearly Wage: " + this.yearlyWage);

	}

}
