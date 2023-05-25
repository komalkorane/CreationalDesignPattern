package com.prowings.singlton;

import java.io.Serializable;

public class SerializationSinglton implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static class SingltonHelper{
	
	private static SerializationSinglton ss=new SerializationSinglton();
	
	}

	private SerializationSinglton() {
		super();
	}
	
	public static SerializationSinglton getInstance() {
		return SingltonHelper.ss;
	}
	  
	public Object readResolve(){
		return getInstance();
	}
	
}
