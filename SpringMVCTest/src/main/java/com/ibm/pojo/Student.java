package com.ibm.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	
	private String name;
	private Integer age;
	private String tel;
	private String sex;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", tel=" + tel + ", sex=" + sex + ", birthday=" + birthday
				+ "]";
	}
	
	
	
	

}
