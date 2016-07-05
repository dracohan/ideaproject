package Decorator;
/**
 * @project: HeadFirstDesignPatterns
 * @filename: Mocha.java
 * @version: 0.10
 * @author: JM Han
 * @date: 4:03 PM 7/5/2016
 * @comment: Test Purpose
 * @result:
 */

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	public double cost() {
		return .20 + beverage.cost();
	}
}
