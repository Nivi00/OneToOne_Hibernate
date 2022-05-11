package com.edu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hiberstudent")
public class Student {
	@Id
@GeneratedValue	
private int sid;
	@Column(name="stname",length = 50)
private String sname;
	@Column(name="stcourse", length=50)
private String scourse;
	@Column(name="scourse",length = 50)

	private String stadd;
	@Column(name="stadd",length = 50)//reference of address in student table
	
	
	public String getStadd() {
		return stadd;
	}
	public void setStadd(String stadd) {
		this.stadd = stadd;
	}

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scourse=" + scourse + ", stadd=" + stadd + "]";
	}
	
	
	
	//generate setter and getter method
	//generate toString
	

}

