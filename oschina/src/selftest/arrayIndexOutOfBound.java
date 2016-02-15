package selftest;
/**
 * @project: oschina
 * @filename: arrayIndexOutOfBound.java
 * @version: 0.10
 * @author: JM Han
 * @date: 11:13 AM 2/15/2016
 * @comment: Test Purpose
 * @result:
 */

public class arrayIndexOutOfBound {
	public static void main(String[] args) {
		int[] intArray = {6,1,2,3,4,5};
		for (int i = 0; i <= intArray.length; i++)
			System.out.print(intArray[i] + " ");
	}
}
