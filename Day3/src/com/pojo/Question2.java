package com.pojo;

public class Question2 {
	private String string;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public String replace(String string) {
		this.string = string;
		string = string.toLowerCase();
		String replaced_string = string.replace('d', 'h');
		System.out.println(" Enter String :" + string);
		System.out.println("Replaced String Value : " + replaced_string);
		return "";
	}
}
