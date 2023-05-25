package com.prowings.abstractfactory;

public class DefaultCarFactory {

	
	public static Car buildCar(CarType type)
	{
		Car car = null;
		
		switch(type)
		{
		case LUXURY:
			car = new LuxuryCar(Location.DEFAULT);
			break;
		case SEDAN:
			car = new SedanCar(Location.DEFAULT);
			break;
		case SMALL:
			car = new SmallCar(Location.DEFAULT);
			break;
		default:
			System.out.println("Invalid car type!!");
			break;
		}
		return car;
	}

}
