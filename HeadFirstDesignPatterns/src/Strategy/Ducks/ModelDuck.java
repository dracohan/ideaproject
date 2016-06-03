package Strategy.Ducks;

import Strategy.FlyBehavior.FlyNoWay;
import Strategy.QuackBehavior.Quack;

/**
 * @project: HeadFirstDesignPatterns
 * @filename: ModelDuck.java
 * @version: 0.10
 * @author: JM Han
 * @date: 21:13 2016/6/3
 * @comment: Test Purpose
 * @result:
 */

public class ModelDuck extends Duck {
	public ModelDuck(){
		qb = new Quack();
		fb = new FlyNoWay();
	}
	public void display(){
		System.out.println("I'm a Model duck!!");
	}
}
