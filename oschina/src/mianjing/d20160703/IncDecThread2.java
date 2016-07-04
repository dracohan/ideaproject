package mianjing.d20160703;
/**
 * @project: oschina
 * @filename: IncDecThread2.java
 * @version: 0.10
 * @author: JM Han
 * @date: 5:37 PM 4/11/2016
 * @comment: Test Purpose
 * @result:
 */


/**
 * @author lijinnan
 * @date:2013-9-12 上午9:55:32
 */

public class IncDecThread2 {

	/**
	 * 测试次数
	 */
	public static final int TEST_COUNT = 20;

	/*
	 * 题目:用JAVA写一个多线程程序，写四个线程，其中二个对一个变量加1，另外二个对一个变量减1
	 * 两个问题：
	 * 1、线程同步--synchronized
	 * 2、线程之间如何共享同一个j变量--将j以及对j的操作封装在Data类中，然后作为共享对象传递给IncRunnable和DecRunnable
	 *
	 * 相对上面第一种解法（利用内部类），本解法更符合面向对象的思想
	 */
	public static void main(String[] args) {
		Data data = new Data();

		//加1线程，2个
		new Thread(new IncRunnable(data)).start();
		new Thread(new IncRunnable(data)).start();

		//减1线程，2个
		new Thread(new DecRunnable(data)).start();
		new Thread(new DecRunnable(data)).start();
	}

}

class Data {

	private int j = 10;

	public synchronized void inc () {
		j++;
		System.out.println(Thread.currentThread().getName()+"-inc:"+j);
	}

	public synchronized void dec () {
		j--;
		System.out.println(Thread.currentThread().getName()+"-dec:"+j);
	}

}


class IncRunnable implements Runnable {

	private Data data;

	public IncRunnable (Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (int i = 0; i < IncDecThread2.TEST_COUNT; i++) {
			data.inc();
		}
	}

}


class DecRunnable implements Runnable {

	private Data data;

	public DecRunnable (Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (int i = 0; i < IncDecThread2.TEST_COUNT; i++) {
			data.dec();
		}
	}

}





