package com.model;

public class Employee {
  private int empNo;
  private String firstName;
  private String secondName;
public int getEmpNo() {
	return empNo;
}
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getSecondName() {
	return secondName;
}
public void setSecondName(String secondName) {
	this.secondName = secondName;
}
public Employee(int empNo, String firstName, String secondName) {
	super();
	this.empNo = empNo;
	this.firstName = firstName;
	this.secondName = secondName;
}
public Employee() {
	super();
}
  
	
}
