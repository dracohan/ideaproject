package c01;
/**
 * @project: jcip
 * @filename: main.java
 * @version: 0.10
 * @author: JM Han
 * @date: 11:17 AM 6/1/2016
 * @comment: Test Purpose
 * @result:
 */

public class main {

	public static void main(String[] args) {
		Thread1 mTh1=new Thread1("A");
		Thread1 mTh2=new Thread1("B");
		mTh1.start();
		mTh2.start();

		new Thread(new Thread2("C")).start();
		new Thread(new Thread2("D")).start();

	}

}
