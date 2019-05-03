
public class Toaster extends Appliance {
	private int modelNumber;
	private boolean isToasterOven;
	private double rating;
	
	Toaster(){}
	
	Toaster(int modelNum, boolean isOven, double rating, double price){
		this.modelNumber = modelNum;
		this.isToasterOven = isOven;
		this.rating = rating;
		this.setPrice(price);
	}

	public int getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}

	public boolean isToasterOven() {
		return isToasterOven;
	}

	public void setToasterOven(boolean isToasterOven) {
		this.isToasterOven = isToasterOven;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}	
}
