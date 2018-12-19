package com.soumyadeep.threads.sleep;

public class ExmpThread extends Thread {

	/*
	 * It makes current executing thread to sleep specified number of milli seconds.
	 * Below example shows sample code for thread sleep.
	 */
	private int suspendCount;

	public ExmpThread(int count) {
		this.suspendCount = count;
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			if (i % suspendCount == 0) {
				try {
					System.out.println("Thread Sleep: " + getName());
					Thread.sleep(500);
				} catch (InterruptedException ex) {
				}
			}
		}
	}
}