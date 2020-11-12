package com.pojo;
/**
 * 
 * 
 * author @Hanuman.L
 * 
 */
public class EvenSquare {

	public int EvenSum(int num) {

		int remainder;
		int sum = 0;
		while (num != 0) {
			remainder = num % 10;
			if (remainder % 2 == 0) {
				sum += (remainder * remainder);
			}
			num /= 10;
		}

		return sum;
	}
}
