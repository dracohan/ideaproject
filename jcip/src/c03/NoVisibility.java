package c03;
/**
 * @project: jcip
 * @filename: NoVisibility.java
 * @version: 0.10
 * @author: JM Han
 * @date: 11:34 AM 5/30/2016
 * @comment: Test Purpose
 * @result:
 */

public class NoVisibility {
	private static boolean ready;
	private static int number;
	private static class ReaderThread extends Thread {
		public void run() {
			while (!ready)
				Thread.yield();
			System.out.println(number);
		}
	}
	public static void main(String[] args) {
		new ReaderThread().start();
		ready = true;
		number = 42;

	}
}
