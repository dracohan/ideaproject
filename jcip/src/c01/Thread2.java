package c01;
/**
 * @project: jcip
 * @filename: Thread2.java
 * @version: 0.10
 * @author: JM Han
 * @date: 11:24 AM 6/1/2016
 * @comment: Test Purpose
 * @result:
 */

class Thread2 implements Runnable{
	private String name;

	public Thread2(String name) {
		this.name=name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "运行  :  " + i);
		}

	}

}
