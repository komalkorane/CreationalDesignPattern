package com.prowings.singlton;

public class EagerInitialization {

	private static EagerInitialization obj = new EagerInitialization();
	
	private EagerInitialization(){
		super();
	}
	
	public static EagerInitialization getInstance() {
		return obj;
	}
	
	
	public static void main(String[] args) {
		EagerInitialization o = new EagerInitialization();
		EagerInitialization o1 = new EagerInitialization();
		System.out.println(o==o1);
	}
}
/*  DrawBack: object is created when jvm load the class at class loading time
              even we don't use this object...
              we cant use exception handling......
    Benefit:  need not to check exception....
*/