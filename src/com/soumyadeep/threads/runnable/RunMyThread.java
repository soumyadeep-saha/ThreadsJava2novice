package com.soumyadeep.threads.runnable;

public class RunMyThread {

	public static void main(String[] args) {

		/*
		 * A Thread can be created by extending Thread class also. But Java allows only
		 * one class to extend, it wont allow multiple inheritance. So it is always
		 * better to create a thread by implementing Runnable interface. Java allows you
		 * to impliment multiple interfaces at a time. By implementing Runnable
		 * interface, you need to provide implementation for run() method. To run this
		 * implementation class, create a Thread object, pass Runnable implementation
		 * class object to its constructor. Call start() method on thread class to start
		 * executing run() method. Implementing Runnable interface does not create a
		 * Thread object, it only defines an entry point for threads in your object. It
		 * allows you to pass the object to the Thread(Runnable implementation)
		 * constructor.
		 */
		System.out.println("Starting Main Thread...");
		MyRunnableThread mrt = new MyRunnableThread();
		Thread t = new Thread(mrt);
		t.start();
		while (MyRunnableThread.myCount <= 10) {
			try {
				System.out.println("Main Thread: " + (++MyRunnableThread.myCount));
				Thread.sleep(100);
			} catch (InterruptedException iex) {
				System.out.println("Exception in main thread: " + iex.getMessage());
			}
		}
		System.out.println("End of Main Thread...");
	}
}
