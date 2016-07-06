package Factory.SimpleFactory;

/**
 * @project: HeadFirstDesignPatterns
 * @filename: NYStyleCheesePizza.java
 * @version: 0.10
 * @author: JM Han
 * @date: 8:36 2016/7/6
 * @comment: Purpose
 * @result:
 */

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";

		toppings.add("Grated Reggiano Cheese");
	}


}
