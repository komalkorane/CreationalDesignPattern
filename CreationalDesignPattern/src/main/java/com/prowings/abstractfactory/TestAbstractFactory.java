package com.prowings.abstractfactory;

public class TestAbstractFactory {

	public static void main(String[] args) {

		Car lc = CarFactory.buildCar(CarType.LUXURY, Location.DEFAULT);

		Car sc = CarFactory.buildCar(CarType.SEDAN, Location.ASIA);

		Car smc = CarFactory.buildCar(CarType.SMALL, Location.ASIA);

	}

}
