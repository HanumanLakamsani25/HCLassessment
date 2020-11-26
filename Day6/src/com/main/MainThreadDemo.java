package com.main;

/**
 *
 * 
 * @author HanumanL
 *
 */
public class MainThreadDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Running child threads" + Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
	}

	public static void main(String[] args) {
	MainThreadDemo  demoThreadMain = new MainThreadDemo();
		Thread thread1 = new Thread(demoThreadMain);
		Thread thread2 = new Thread(demoThreadMain);
		Thread thread3 = new Thread(demoThreadMain);
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
