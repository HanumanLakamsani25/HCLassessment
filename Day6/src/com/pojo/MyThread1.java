package com.pojo;

import java.util.Date;

/**
 * 
 * @author HanumanL
 *
 */
public class MyThread1 extends Thread {
	public void run(){
		
			try {
				Thread.sleep(10000);
			    System.out.println("If we remove try-catch block then we will get unhandled exception type InterruptedException");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(new Date());
		
		
	}
}
