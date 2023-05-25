package com.prowings.singlton;

public class BillPughInitialization {

	private BillPughInitialization() {
		super();
	}

	private static class SingltonHelper {

		private static final BillPughInitialization instance = new BillPughInitialization();

	}

	public static BillPughInitialization getInstance() {
		return SingltonHelper.instance;
	}
}
