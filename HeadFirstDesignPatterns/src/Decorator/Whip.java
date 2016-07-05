package Decorator;
/**
 * @project: HeadFirstDesignPatterns
 * @filename: Whip.java
 * @version: 0.10
 * @author: JM Han
 * @date: 4:07 PM 7/5/2016
 * @comment: Test Purpose
 * @result:
 */

public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}

