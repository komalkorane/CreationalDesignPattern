package com.prowings.factory;

public class SedanCar extends Car{
	public SedanCar(CarType type) {
		super(type);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Sedan Car Constructed!!!!");
	}
}
