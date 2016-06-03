package Strategy.Ducks;

import Strategy.FlyBehavior.FlyWithWings;
import Strategy.QuackBehavior.Quack;

/**
 * @project: HeadFirstDesignPatterns
 * @filename: MallardDuck.java
 * @version: 0.10
 * @author: JM Han
 * @date: 20:28 2016/6/3
 * @comment: Test Purpose
 * @result:
 */

public class MallardDuck extends Duck {
	public MallardDuck(){
		qb = new Quack();
		fb = new FlyWithWings();
	}
	public void display(){
		System.out.println("I'm a real Mallard Duck!");
	}
}
