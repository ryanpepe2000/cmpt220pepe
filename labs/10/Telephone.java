
public class Telephone extends Appliance {
	private String cellularCarrier;
	private String phoneBrand;
	private long phoneNumber;
	
	Telephone(){}
	
	Telephone(String carrier, String brand, long number, double price){
		this.cellularCarrier = carrier;
		this.phoneBrand = brand;
		this.phoneNumber = number;	
		this.setPrice(price);
	}

	public String getCellularCarrier() {
		return cellularCarrier;
	}

	public void setCellularCarrier(String cellularCarrier) {
		this.cellularCarrier = cellularCarrier;
	}

	public String getPhoneBrand() {
		return phoneBrand;
	}

	public void setPhoneBrand(String phoneBrand) {
		this.phoneBrand = phoneBrand;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
