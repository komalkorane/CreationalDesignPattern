package com.prowings.builder;

public class TestBuilder {

	public static void main(String[] args) {

		Student s = new Student.StudentBuilder("Komal", "Koarane").address("Kolhapur").mobileNo(12345).build();
		System.out.println(s);

	}

}
