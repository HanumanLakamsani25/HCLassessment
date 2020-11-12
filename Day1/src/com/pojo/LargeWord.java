package com.pojo;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public class LargeWord {

	
	public String getLargeWord(String sentence) {
		
		int flag=0;
		String[] strings=sentence.split(" ");
		
		int max=strings[0].length();
		for (int i = 0; i < strings.length; i++) {
			if(max<strings[i].length()) {
				max=strings[i].length();
				flag=i;
			}
		}
		return strings[flag];
	}
}

