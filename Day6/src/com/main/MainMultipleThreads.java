
package com.main;

/**
 * 
 * 
 * @author HanumanL
 *
 */
public class MainMultipleThreads implements Runnable {

	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("2MultiplesThread")) {
			System.out.println(Thread.currentThread().getName()+" starting ");
			System.out.println("Thread is in :"+Thread.currentThread().getState()+" state");
			int count =1;
			while(count<11) {
				System.out.println(2*count++);
			}
			System.out.println(Thread.currentThread().getName()+" ended ");
		}
		else if(Thread.currentThread().getName().equals("5MultiplesThread")) {
			System.out.println(Thread.currentThread().getName()+" starting ");
			System.out.println("Thread is in :"+Thread.currentThread().getState()+" state");
			int count =1;
			while(count<11) {
				System.out.println(5*count++);
			}
			System.out.println(Thread.currentThread().getName()+" ended ");
		}
		else {
			System.out.println(Thread.currentThread().getName()+" starting ");
			System.out.println("Thread is in :"+Thread.currentThread().getState()+" state");
			int count =1;
			while(count<11) {
				System.out.println(8*count++);
			}
			System.out.println(Thread.currentThread().getName()+" ended ");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		MainMultipleThreads multipleThreads = new MainMultipleThreads();
		Thread thread1 = new Thread(multipleThreads,"2MultiplesThread");
		Thread thread2 = new Thread(multipleThreads,"5MultiplesThread");
		Thread thread3 = new Thread(multipleThreads,"8MultiplesThread");
		thread1.start();
		thread2.join();
		thread2.start();
		thread3.join();
		thread3.start();
	}

}
