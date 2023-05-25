package com.prowings.factory;

public class CarFactory {

	public static Car buildCar(CarType type) {
		Car c = null;
		switch(type) {
		case LUXURY:
			c = new LuxuryCar(type);
			break;
		case SEDAN:
			c = new SedanCar(type);
			break;
		case SMALL:
			c = new SmallCar(type);
			break;
		default:
			System.out.println("Invalid Car Type");
			break;
		}
		return c;
	}
	
}
