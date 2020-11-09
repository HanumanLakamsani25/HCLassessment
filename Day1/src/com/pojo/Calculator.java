package com.pojo;

public class Calculator {
  private int num1;
  private int num2;
public double getNum1() {
	return num1;
}
public void setNum1(int num1) {
	this.num1 = num1;
}
public double getNum2() {
	return num2;
}
public void setNum2(int num2) {
	this.num2 = num2;
}

public double Addition()
  {
	  return(num1+num2);
  }
public double Subtract()
  {
	  return(num1-num2);
  }
public double Multiply()
  {
	  return(num1*num2);
  }
public double Division()
  {
	  return(num1/num2);
  }
public double Remainder()
  {
	  return(num1%num2);
  }
}
