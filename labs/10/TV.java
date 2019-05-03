
public class TV extends Appliance {
	//dots*lines
	private int numberOfPixels;
	// dots + " x " + lines
	private String resolution;
	//Amount of dots (pixels) per line 
	private int numberOfDots;
	//Amount of lines on TV screen
	private int numberOfLines;
	private boolean isFlatScreen;
	
	public TV() {}
	
	public TV(int numberOfDots, int numberOfLines, boolean isFlatScreen, double price) {
		this.numberOfDots = numberOfDots;
		this.numberOfLines = numberOfLines;
		this.numberOfPixels = this.numberOfDots * this.numberOfLines;
		this.resolution = this.numberOfDots + " x " + this.numberOfLines;
		this.isFlatScreen = isFlatScreen;
		this.setPrice(price);
	}

	public int getNumberOfDots() {
		return numberOfDots;
	}

	public void setNumberOfDots(int numberOfDots) {
		this.numberOfDots = numberOfDots;
	}

	public int getNumberOfLines() {
		return numberOfLines;
	}

	public void setNumberOfLines(int numberOfLines) {
		this.numberOfLines = numberOfLines;
	}

	public int getNumberOfPixels() {
		return numberOfPixels;
	}

	public String getResolution() {
		return resolution;
	}

	public boolean isFlatScreen() {
		return isFlatScreen;
	}
	
	
}
