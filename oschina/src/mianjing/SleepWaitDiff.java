package mianjing;
/**
 * @project: oschina
 * @filename: SleepWaitDiff.java
 * @version: 0.10
 * @author: JM Han
 * @date: 5:03 PM 4/11/2016
 * @comment: Test Purpose
 * @result: http://www.cnblogs.com/DreamSea/archive/2012/01/16/2263844.html
 */


/**
 * Thread sleep和wait区别
 * @author DreamSea
 * 2012-1-15
 */
public class SleepWaitDiff implements Runnable {
	int number = 10;

	public void firstMethod() throws Exception {
		synchronized (this) {
			number += 100;
			System.out.println(number);
		}
	}

	public void secondMethod() throws Exception {
		synchronized (this) {
			/**
			 * (休息2S,阻塞线程)
			 * 以验证当前线程对象的机锁被占用时,
			 * 是否被可以访问其他同步代码块
			 */
			Thread.sleep(2000);
			//this.wait(2000);
			number *= 200;
		}
	}

	@Override
	public void run() {
		try {
			firstMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		SleepWaitDiff threadTest = new SleepWaitDiff();
		Thread thread = new Thread(threadTest);
		thread.start();
		threadTest.secondMethod();
		System.out.println("number="+threadTest.number);
	}
}
