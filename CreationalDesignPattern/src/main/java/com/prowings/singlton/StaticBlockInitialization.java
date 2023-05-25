package com.prowings.singlton;

public class StaticBlockInitialization {

	private static StaticBlockInitialization o;

	private StaticBlockInitialization() {
		super();
	}

	static {
		try {
			o = new StaticBlockInitialization();
		} catch (Exception e) {
			System.out.println("Exception while initialiazing the block!!!");
		}
	}

	public static StaticBlockInitialization getInstance() {
		return o;
	}

}
/*   DrawBack:  in this it is same like EagerInitialization 
                just difference is we can handle exception.....
*/