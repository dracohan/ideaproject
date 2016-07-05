package Decorator;

/**
 * @project: HeadFirstDesignPatterns
 * @filename: HouseBlend.java
 * @version: 0.10
 * @author: JM Han
 * @date: 3:55 PM 7/5/2016
 * @comment: Test Purpose
 * @result:
 */

public class HouseBlend extends Beverage {
	public HouseBlend(){
		description = "House Blend Coffee";
	}

	public double cost() {
		return .89;
	}
}