package com.soumyadeep.threads.threadClass;

public class RunThread {

	/*
	 * A thread can be created in java by extending Thread class, where you must
	 * override run() method. Call start() method to start executing the thread
	 * object.
	 */
	public static void main(String[] args) {

		System.out.println("Starting Main Thread...");
		MySmpThread mst = new MySmpThread();
		mst.start();
		while (MySmpThread.myCount <= 10) {
			try {
				System.out.println("Main Thread: " + (++MySmpThread.myCount));
				Thread.sleep(100);
			} catch (InterruptedException iex) {
				System.out.println("Exception in main thread: " + iex.getMessage());
			}
		}
		System.out.println("End of Main Thread...");
	}
}
