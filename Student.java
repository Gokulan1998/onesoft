package com.onesoft.collection3;

public class Student {
	private int id;
	private String name;
	private String gender;
	private int age;
	private String std;
	private String sec;
	public Student(int id, String name, String gender, int age, String std, String sec) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.std = std;
		this.sec = sec;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getSec() {
		return sec;
	}
	public void setSec(String sec) {
		this.sec = sec;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", std=" + std
				+ ", sec=" + sec + "]";
	}
	

}
