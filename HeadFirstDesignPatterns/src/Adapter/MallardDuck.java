package Adapter;
/**
 * @project: HeadFirstDesignPatterns
 * @filename: MallardDuck.java
 * @version: 0.10
 * @author: JM Han
 * @date: 3:34 PM 7/7/2016
 * @comment: Test Purpose
 * @result:
 */

public class MallardDuck implements Duck {
	public void quack(){
		System.out.println("Quack");
	}

	public void fly(){
		System.out.println("I'm flying");
	}
}
