package c06;
/**
 * @project: LearningJava
 * @filename: SuperTest.java
 * @version: 0.10
 * @author: JM Han
 * @date: 14:35 2016/1/23
 * @comment: Test Purpose
 * @result:
 */

class B0{
	int i = 0;
	void func(){
		System.out.println("B0.func()");
	}
}
class B1 extends B0{
	int i = 1;
	void func(){
		System.out.println("B1.func()");
	}
}

class D1 extends B1{
	int i = 2;
	void func(){
		super.func();
	}
}

public class SuperTest {
	public static void main(String[] args) {
		B0 d1 = new D1();
		d1.func();

	}
}
