package Strategy.FlyBehavior;
/**
 * @project: HeadFirstDesignPatterns
 * @filename: FlyNoWay.java
 * @version: 0.10
 * @author: JM Han
 * @date: 21:03 2016/6/3
 * @comment: Test Purpose
 * @result:
 */

public class FlyNoWay implements FlyBehavior {
	public void fly(){
		System.out.println("I can't fly");
	}
}
