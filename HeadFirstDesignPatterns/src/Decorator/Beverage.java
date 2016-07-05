package Decorator;
/**
 * @project: HeadFirstDesignPatterns
 * @filename: Beverage.java
 * @version: 0.10
 * @author: JM Han
 * @date: 3:50 PM 7/5/2016
 * @comment: Test Purpose
 * @result:
 */

public abstract class Beverage {
	String description = "Unknow Beverage";

	public String getDescription(){
		return description;
	}

	public abstract double cost();
}
