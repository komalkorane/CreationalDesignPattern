package com.prowings.factory;

public class SmallCar extends Car{
	public SmallCar(CarType type) {
		super(type);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Sedan Car Constructed!!!!");
	}
}
