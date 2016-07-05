package Decorator;
/**
 * @project: HeadFirstDesignPatterns
 * @filename: Espresso.java
 * @version: 0.10
 * @author: JM Han
 * @date: 3:54 PM 7/5/2016
 * @comment: Test Purpose
 * @result:
 */

public class Espresso extends Beverage {
	public Espresso(){
		description = "Espresso";
	}

	public double cost(){
		return 1.99;
	}
}
