package self;

/**
 * @project: ThinkingInJava
 * @filename: MyOuterClassDemo.java
 * @version: 0.10
 * @author: JM Han
 * @date: 4:17 PM 4/8/2016
 * @comment: Test Purpose
 * @result:
 */

public class MyOuterClassDemo {
	private int x= 1;

	public void doThings(){
		final String name ="local variable"; // name is effectively final
		// inner class defined inside a method of outer class
		class MyInnerClassDemo {
			public void seeOuter() {
				System.out.println("Outer Value of x is :" + x);
				System.out.println("Value of name is :" + name);
			} //close inner class method
		} // close inner class definition
		MyInnerClassDemo inner = new MyInnerClassDemo();
		inner.seeOuter();
	} //close Top level class method
	public static void main(String[] args){

		MyOuterClassDemo outer = new MyOuterClassDemo();
		outer.doThings();
	}
}
