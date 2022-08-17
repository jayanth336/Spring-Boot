package com.application.Registrationform.domain;

public class Student {
	private String stname;
	private String course;
	private String fee;

	/*public Student(String stname, String course, String fee) {
		super();
		this.stname = stname;
		this.course = course;
		this.fee = fee;
	}*/

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

}