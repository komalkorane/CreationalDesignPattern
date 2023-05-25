package com.prowings.singlton;

public class ThreadSafeUsingBlock {

	private static ThreadSafeUsingBlock tsb = null;

	private ThreadSafeUsingBlock() {
		super();
	}
	
	
	public static ThreadSafeUsingBlock getInstance() {
		if(tsb == null)
			synchronized (ThreadSafeUsingBlock.class) {
				if( tsb == null)
					tsb = new ThreadSafeUsingBlock();
			}
		return tsb;
	}
	
	
}
