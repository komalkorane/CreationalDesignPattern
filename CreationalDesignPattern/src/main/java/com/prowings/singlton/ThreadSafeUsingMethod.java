package com.prowings.singlton;

public class ThreadSafeUsingMethod {

	private static ThreadSafeUsingMethod ts = null;

	private ThreadSafeUsingMethod() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public synchronized static ThreadSafeUsingMethod getInstance() {
		if( ts == null) {
			ts = new ThreadSafeUsingMethod();
		}
		return ts;
	}
	
	
	
}
