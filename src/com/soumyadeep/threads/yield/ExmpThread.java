package com.soumyadeep.threads.yield;

public class ExmpThread extends Thread {

	/*
	 * When a thread executes a thread yield, the executing thread is suspended and
	 * the CPU is given to some other runnable thread. This thread will wait until
	 * the CPU becomes available again. Technically, in process scheduler's
	 * terminology, the executing thread is put back into the ready queue of the
	 * processor and waits for its next turn.
	 */

	private int stopCount;

	public ExmpThread(int count) {
		this.stopCount = count;
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			if (i % stopCount == 0) {
				System.out.println("Stoping thread: " + getName());
				yield();
			}
		}
	}
}