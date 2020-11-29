package com.cg.training.server;

public class Exercise4 {

	private String CarName;
	private String CarColor;
	
	public Exercise4(){
		
	}
	@Override
	public String toString() {
		return "Car [CarName=" + CarName + "]";
	}

	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		CarName = carName;
	}

	public String getCarColor() {
		return CarColor;
	}

	public void setCarColor(String carColor) {
		CarColor = carColor;
	}

	public Exercise4(String carName, String carColor) {
		super();
		CarName = carName;
		CarColor = carColor;
	}
	
}