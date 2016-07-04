package mianjing.d20160703;
/**
 * @project: oschina
 * @filename: switchTest.java
 * @version: 0.10
 * @author: JM Han
 * @date: 4:38 PM 4/12/2016
 * @comment: Test Purpose
 * @result:
 */

public class switchTest {
	public static void test(String s){
		System.out.println("s: " + s);
	}
	public static void main(String[] args) {
		test("abc,"+
		"cde");
		String s = "abc";
		Byte b = 1;
		Character c = 'a';
		Short st = 1;
		Integer i = 1;
		Double d = 1.1;

		switch (st){
			case 1:
				System.out.println("match");
				break;
			case 2:
				System.out.println("match too");
				break;
			default:
				System.out.println("No match");
		}
	}
}
