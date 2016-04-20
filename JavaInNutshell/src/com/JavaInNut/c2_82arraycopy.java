package com.JavaInNut;
/**
 * @project: inteliJ
 * @filename: c2_82 arraycopy.java
 * @version: 0.10
 * @author: JM Han
 * @date: 1:11 PM 4/20/2016
 * @comment: Test Purpose
 * @result:
 */
import static java.lang.System.out;
/*interface a{
	public default void foo(){
		System.out.println("foo");
	}
}*/
public class c2_82arraycopy {
	public static void main(String[] args) {
		int[] a = {2,3,4,5,6,7,8,9,};
		int[] b = new int[6];
		System.out.println(a.length);
		System.arraycopy(a, 1, b, 0, 6);
		for (int n :
				b) {
			out.println("n: " + n);
		}
		System.out.println(a.length);
	}
}
