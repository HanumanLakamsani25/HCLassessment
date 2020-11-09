package com.pojo;

public class Substring {
	private int start;
	private int end;
	private String string;
	
	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public static String substrings(String string, int start, int end) {
		return string.substring(start, end + 1);
	}

}
