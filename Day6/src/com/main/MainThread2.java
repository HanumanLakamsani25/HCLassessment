package com.main;

import java.util.Date;


import com.pojo.MyThread1;

/**
 * 
 * 
 * @author HanumanL
 *
 */
public class MainThread2 {

	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1();
		System.out.println("Default thread name :" + thread1.getName());
		thread1.setName("MyThread");
		System.out.println("Changed name of thread :" + thread1.getName());
		System.out.println(new Date());
		thread1.start();
		System.out.println("Current thread is in sleep for 10s");
	}

}
