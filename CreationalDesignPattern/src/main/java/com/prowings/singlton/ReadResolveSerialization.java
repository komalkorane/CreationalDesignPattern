package com.prowings.singlton;

public class ReadResolveSerialization {

private static final long serialVersionUID = 1L;
	
	private static ReadResolveSerialization ss = null;

	private ReadResolveSerialization() {
		super();
	}
	
	public static ReadResolveSerialization getInstance() {
		return ss;
	}
	
	public ReadResolveSerialization readResolve() {
		return getInstance();
	}
	
}
