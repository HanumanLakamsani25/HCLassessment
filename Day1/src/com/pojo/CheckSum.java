package com.pojo;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public class CheckSum {

		public static int checkSum(long number) {
			
			long remainder;
			int sum=0;
			
			while(number!=0) {
				remainder=number%10;
				if(remainder%2!=0) {
					sum+=remainder;
				}
				number/=10;
			}
			if(sum%2!=0)
				return 1;
			return -1;
		}
	}

