package com.prowings.factory;

public abstract class Car {

	private CarType type;

	public Car(CarType type) {
		this.type = type;
		arrangeParts();
	}

	private void arrangeParts() {
		System.out.println("parts arranged for : " + this.type);
	}

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}

	protected abstract void construct();

}
