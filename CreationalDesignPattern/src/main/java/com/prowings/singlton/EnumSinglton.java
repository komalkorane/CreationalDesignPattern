package com.prowings.singlton;

public enum EnumSinglton {

	INSTANCE;
	
	private EnumSinglton() {
	}
	
	public static EnumSinglton getInstance() {
		return INSTANCE;
		
	}
	
  
}
