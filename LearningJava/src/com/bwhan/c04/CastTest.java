package c04;
/**
 * @project: LearningJava
 * @filename: CastTest.java
 * @version: 0.10
 * @author: JM Han
 * @date: 15:36 2016/1/17
 * @comment: Test Purpose
 * @result:
 */

public class CastTest {
	public static void main(String[] args) {
		int i = 400;
		short s = 1;
		long l = 1;
		byte bt = 42;
		float f = (float)1.1;
		double d = 1.1;
		boolean b = true;

		i = s;
		i = (int)l;     //larger val need to be cased to short
		bt = (byte)i;
		System.out.println("bt: " + bt);    //value is unknow after cast
	}
}
