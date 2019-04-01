package com.kd.pojo;

public class Student{
	 public int id;
	 public String name;
	 public String sex;
	 public int age;
	 public String _class;
	 public String address;
	 public String phone;
	 public String email;
	 public int score;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, String sex, int age, String _class, String address, String phone, String email,
			int score) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this._class = _class;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.score = score;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String get_class() {
		return _class;
	}
	public void set_class(String _class) {
		this._class = _class;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
