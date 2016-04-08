package c03;
/**
 * @project: ThinkingInJava
 * @filename: URShift.java
 * @version: 0.10
 * @author: JM Han
 * @date: 1:39 PM 4/5/2016
 * @comment: Test Purpose
 * @result:
 */

//: URShift.java
// Test of unsigned right shift
public class URShift {
	public static void main(String[] args) {
		int i = -1;
		i >>>= 10;
		System.out.println(i);
		long l = -1;
		l >>>= 10;
		System.out.println(l);
		short s = -1;
		s >>>= 10;
		System.out.println(s);
		byte b = -1;
		b >>>= 10;
		System.out.println(b);
	}
} ///:~
