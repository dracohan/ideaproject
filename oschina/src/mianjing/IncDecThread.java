package mianjing;
/**
 * @project: oschina
 * @filename: IncDecThread.java
 * @version: 0.10
 * @author: JM Han
 * @date: 5:30 PM 4/11/2016
 * @comment: Test Purpose
 * @result: http://bylijinnan.iteye.com/blog/1456978
 */


public class IncDecThread {

	private int j=10;

	/*
	 * 题目:用JAVA写一个多线程程序，写四个线程，其中二个对一个变量加1，另外二个对一个变量减1
	 * 两个问题：
	 * 1、线程同步--synchronized
	 * 2、线程之间如何共享同一个j变量--内部类
	 */
	public static void main(String[] args) {
		IncDecThread incDec=new IncDecThread();
		Inc inc=incDec.new Inc();
		Dec dec=incDec.new Dec();
		for(int i=0;i<2;i++){
			Thread thread=new Thread(inc);
			thread.start();
			thread=new Thread(dec);
			thread.start();
		}
	}

	public synchronized void inc(){
		j++;
		System.out.println(Thread.currentThread().getName()+"-inc:"+j);
	}
	public synchronized void dec(){
		j--;
		System.out.println(Thread.currentThread().getName()+"-dec:"+j);
	}

	class Inc implements Runnable{
		public void run(){
			for(int i=0;i<20;i++){
				inc();
			}
		}
	}
	class Dec implements Runnable{
		public void run(){
			for(int i=0;i<20;i++){
				dec();
			}
		}
	}
}



