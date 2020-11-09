package com.pojo;

public class Key {
	public static int search(int[] integer,int element) {
		for (int i = 0; i < integer.length; i++) {
			if (integer[i] == element) {
				return i;
			}
		}
		return -1;
	}

}
