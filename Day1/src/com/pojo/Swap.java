package com.pojo;

public class Swap {
	 private int num1;
	 private int num2;
	 private int num3;
	 private int result;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	 
    public int swap()
    { 
	  int  num1 = num2;
	  num2 = num3;
	  num3 = num1;
	  result = (num3);
      return(result);
    }
}
