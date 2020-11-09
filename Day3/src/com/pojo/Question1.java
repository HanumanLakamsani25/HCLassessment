package com.pojo;

public class Question1 {
	private String string;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public String newString(String string) {
		this.string = string;
		string = string.toLowerCase();
		System.out.println("New String  :" + string);
		return "";
	}
}
