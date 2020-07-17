package com.example.springboot.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
@NamedQuery(name = "User.finduserbyjobtype", query = " select name from User where jobtype = ?1")
public class User {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	int userid;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "age")
	int age;
	
	@Column(name = "jobtype")
	String jobtype;

	public User() {
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	public String getJobtype() {
		return jobtype;
	}

	public User(String name, int age, String jobtype) {
		this.name = name;
		this.age = age;
		this.jobtype = jobtype;
	}

	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", age=" + age + ", jobtype=" + jobtype + "]";
	}
}
