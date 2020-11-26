package com.main;

/**
 * 
 * @author HanumanL
 *
 */
public class MainThreadDemo1 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				System.err.println(e);
			}
			System.out.println(Thread.currentThread().getName() +" :"+ i);
		}
	}

	public static void main(String[] args) {
		MainThreadDemo1 thread1 = new MainThreadDemo1();
		MainThreadDemo1 thread2 = new MainThreadDemo1();
		MainThreadDemo1 thread3 = new MainThreadDemo1();
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
