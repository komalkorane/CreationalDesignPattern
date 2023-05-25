package com.prowings.singlton;

public class LazyInitialization {

	private static LazyInitialization ob = null;

	private LazyInitialization() {
		super();
	}

	public static LazyInitialization getInstance() {
		if (ob == null)
			ob = new LazyInitialization();
		return ob;
	}

}
/*  Drawback: It is not threadsafe
 * 
 *  Benefit: Object get created when actually needed
 *           we can handle exception
 * */
 