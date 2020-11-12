package com.pojo;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public class Prime {


	public boolean Check(int value) {
		
		int count=0;
		for (int i = 1; i <= value; i++) {
			if(value%i==0)
				count++;
		}
		if(count==2)
			return true;
		    return false;
	}
}
