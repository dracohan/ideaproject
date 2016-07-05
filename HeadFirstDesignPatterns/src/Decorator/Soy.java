package Decorator;
/**
 * @project: HeadFirstDesignPatterns
 * @filename: Soy.java
 * @version: 0.10
 * @author: JM Han
 * @date: 4:07 PM 7/5/2016
 * @comment: Test Purpose
 * @result:
 */

public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
