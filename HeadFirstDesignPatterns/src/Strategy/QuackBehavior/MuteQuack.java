package Strategy.QuackBehavior;
/**
 * @project: HeadFirstDesignPatterns
 * @filename: MuteQuack.java
 * @version: 0.10
 * @author: JM Han
 * @date: 20:57 2016/6/3
 * @comment: Test Purpose
 * @result:
 */

public class MuteQuack implements QuackBehavior {
	public void quack(){
		System.out.println("<<silence>>");
	}
}
