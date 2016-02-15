package cnblogs;
/**
 * @project: oschina
 * @filename: ThreadDemo2.java
 * @version: 0.10
 * @author: JM Han
 * @date: 10:48 AM 2/15/2016
 * @comment: Test Purpose
 * @result:
 */

public class ThreadDemo2 extends Thread {
	private int countDown = 10;

	@Override
	// 在run方法中定义任务
	public void run() {
		while (countDown-- > 0) {
			System.out.println("#" + this.getName() + "(" + countDown + ")");
		}
	}

	public static void main(String[] args) {
		new ThreadDemo2().start();
		new ThreadDemo2().start();
		// 由于start方法迅速返回，所以main线程可以执行其他的操作,此时有两个独立的线程在并发运行
		System.out.println("火箭发射前倒计时：");
	}
}
