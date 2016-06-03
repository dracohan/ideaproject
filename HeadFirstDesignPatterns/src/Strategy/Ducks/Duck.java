package Strategy.Ducks;

import Strategy.FlyBehavior.FlyBehavior;
import Strategy.QuackBehavior.QuackBehavior;

/**
 * @project: HeadFirstDesignPatterns
 * @filename: Duck.java
 * @version: 0.10
 * @author: JM Han
 * @date: 20:26 2016/6/3
 * @comment: 父类，除了一个不变的接口，其他的全部写成接口形式
 * @result:
 */


public abstract class Duck {
	QuackBehavior qb;
	FlyBehavior fb;

	public abstract void display();

	public void performFly(){
		fb.fly();
	}

	public void performQuack(){
		qb.quack();
	}

	public void swim(){
		System.out.println("All ducks float!");
	}

	public void setQuackBehavior(QuackBehavior quackbehavior){
		qb = quackbehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior){
		fb = flyBehavior;
	}
}
