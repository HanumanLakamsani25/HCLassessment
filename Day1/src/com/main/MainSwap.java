package com.main;

import com.pojo.Swap;

public class MainSwap {

	public static void main(String[] args) {
		Swap swap = new Swap();
		swap.setNum1(20);
		swap.setNum2(10);
		System.out.println("Before Swapping num1= "+swap.getNum1()+" and num2 = "+swap.getNum2()  );
		System.out.println("After Swapping num1= "+swap.swap()  );
	}

}
