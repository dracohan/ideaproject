package c01;
/**
 * @project: jcip
 * @filename: UnsafeSequenceTestThread2.java
 * @version: 0.10
 * @author: JM Han
 * @date: 10:53 AM 6/1/2016
 * @comment: Test Purpose
 * @result:
 */

public class UnsafeSequenceTestThread2 {
	public static void main(String[] args) {
		UnsafeSequence us = new UnsafeSequence();
		for(int i = 0; i < 10; i++)
			us.getV();
	}
}
