package Decorator;

/**
 * @project: HeadFirstDesignPatterns
 * @filename: DarkRoast.java
 * @version: 0.10
 * @author: JM Han
 * @date: 4:06 PM 7/5/2016
 * @comment: Test Purpose
 * @result:
 */

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}

	public double cost() {
		return .99;
	}
}
