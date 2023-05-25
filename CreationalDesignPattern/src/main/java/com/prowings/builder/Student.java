package com.prowings.builder;

public class Student {

	String firstName;
	String laststName;
	String address;
	long mobileNo;
	int roll;
	int marks;

	public Student(StudentBuilder builder) {
		this.firstName = builder.firstName;
		this.laststName = builder.lastName;
		this.address = builder.address;
		this.mobileNo = builder.mobileNo;
		this.roll = builder.roll;
		this.marks = builder.marks;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", laststName=" + laststName + ", address=" + address + ", mobileNo="
				+ mobileNo + ", roll=" + roll + ", marks=" + marks + "]";
	}

	public static class StudentBuilder {

		String firstName;
		String lastName;
		String address;
		long mobileNo;
		int roll;
		int marks;

		StudentBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public StudentBuilder address(String address) {
			this.address = address;
			return this;
		}

		public StudentBuilder mobileNo(long mobileNo) {
			this.mobileNo = mobileNo;
			return this;
		}

		public StudentBuilder roll(int roll) {
			this.roll = roll;
			return this;
		}

		public StudentBuilder marks(int marks) {
			this.marks = marks;
			return this;
		}

		public Student build() {
			Student s = new Student(this);
			return s;
		}

	}

}
