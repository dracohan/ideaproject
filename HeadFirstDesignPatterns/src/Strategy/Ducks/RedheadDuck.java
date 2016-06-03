package Strategy.Ducks;

import Strategy.FlyBehavior.FlyWithWings;
import Strategy.QuackBehavior.Squeak;

/**
 * @project: HeadFirstDesignPatterns
 * @filename: RedheadDuck.java
 * @version: 0.10
 * @author: JM Han
 * @date: 20:28 2016/6/3
 * @comment: Test Purpose
 * @result:
 */

public class RedheadDuck extends Duck {
	public RedheadDuck(){
		qb = new Squeak();
		fb = new FlyWithWings();
	}
	public void display(){
		System.out.println("I'm a real RedheadDuck!");
	}
}
