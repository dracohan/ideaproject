package c04;
/**
 * @project: LearningJava
 * @filename: InstanceOf.java
 * @version: 0.10
 * @author: JM Han
 * @date: 15:53 2016/1/17
 * @comment: Test Purpose
 * @result:
 */

class Base{
}

class Derived extends Base {
}

public class InstanceOf {
	public static void main(String[] args) {
		Derived d = new Derived();
		if (d instanceof Base)
			System.out.println("Yes, derived object is also instance of Base");
		else
			System.out.println("No, derived object is not instance of Base");

		Derived[] darr = new Derived[10];

		if(darr instanceof Base[])
			System.out.println("Yes, derived object array is also instance of Base array");
		else
			System.out.println("No, derived object array is not instance of Base array");
	}
}
