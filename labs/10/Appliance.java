
public abstract class Appliance implements Comparable<Appliance>{
	private double voltage;
	private String color;
	private String madeIn;
	private double price;
	
	public Appliance() {}
	
	public Appliance(double voltage, String color, String madeIn, double price) {
		this.voltage = voltage;
		this.color = color;
		this.madeIn = madeIn;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getVoltage() {
		return voltage;
	}

	public String getColor() {
		return color;
	}

	public String getMadeIn() {
		return madeIn;
	}

	@Override
	public int compareTo(Appliance arg0) {
		if (arg0 != null) {
			if (arg0 instanceof Appliance) {
				Appliance appliance = (Appliance)arg0;
				if (this.price > appliance.getPrice())
					return 1;
				else if (this.price < appliance.getPrice())
					return -1;
				else
					return 0;
			}
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "\nObject Type: Appliance\nVoltage: "+voltage+"\nColor: "
				+ color + "\nMade In: " + madeIn + "\nPrice: " + price;
				
	}
	
}
