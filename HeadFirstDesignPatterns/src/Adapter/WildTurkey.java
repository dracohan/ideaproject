package Adapter;
/**
 * @project: HeadFirstDesignPatterns
 * @filename: WildTurkey.java
 * @version: 0.10
 * @author: JM Han
 * @date: 3:35 PM 7/7/2016
 * @comment: Test Purpose
 * @result:
 */

public class WildTurkey implements Turkey {
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	public void fly() {
		System.out.println("I'm flying a short distance");
	}
}
