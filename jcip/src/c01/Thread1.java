package c01;
/**
 * @project: jcip
 * @filename: Thread1.java
 * @version: 0.10
 * @author: JM Han
 * @date: 11:16 AM 6/1/2016
 * @comment: Test Purpose
 * @result:
 */

class Thread1 extends Thread{
	private String name;
	public Thread1(String name) {
		this.name=name;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "运行  :  " + i);
		}

	}
}


