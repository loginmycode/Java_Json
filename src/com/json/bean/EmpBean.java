package com.json.bean;

import java.util.Date;

public class EmpBean {

	private String name;
	private int age;
	
	private String email;
	private Date dob;
	private String address;
	public EmpBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpBean(String name, int age, String email, Date dob) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.dob = dob;
	}
	public EmpBean(String name, int age, String email, Date dob, String address) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.dob = dob;
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "EmpBean [name=" + name + ", age=" + age + ", email=" + email + ", dob=" + dob + ", address=" + address
				+ "]";
	}
	
	
}
