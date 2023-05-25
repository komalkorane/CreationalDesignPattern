package com.prowings.factory;

public class LuxuryCar extends Car {

	public LuxuryCar(CarType type) {
		super(type);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Luxury Car Constructed!!!!");
	}
}
