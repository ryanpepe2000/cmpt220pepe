
public class SportsCar implements Printable {

	private String manufacturer;
	private int plateNumber;
	
	public SportsCar(){}
	
	public SportsCar(String manufacturer, int plateNum){
		this.manufacturer = manufacturer;
		this.plateNumber = plateNum;
	}
	
	@Override
	public void print() {
		System.out.println("\nObject type: SportsCar\nManufacturer: " + 
				this.manufacturer + "\nPlate Number: " + this.plateNumber);
	}

}
