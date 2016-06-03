package Strategy.QuackBehavior;
/**
 * @project: HeadFirstDesignPatterns
 * @filename: Quck.java
 * @version: 0.10
 * @author: JM Han
 * @date: 20:56 2016/6/3
 * @comment: 行为的抽象
 * @result:
 */

public class Quack implements QuackBehavior{
	public void quack(){
		System.out.println("Quack");
	}
}
