package c01;
/**
 * @project: jcip
 * @filename: UnsafeSequenceTestThread1.java
 * @version: 0.10
 * @author: JM Han
 * @date: 10:52 AM 6/1/2016
 * @comment: Test Purpose
 * @result:
 */

public class UnsafeSequenceTestThread1 {
	public static void main(String[] args) {
		UnsafeSequence us = new UnsafeSequence();
		for(int i = 0; i < 10; i++)
			us.getV();
	}
}
