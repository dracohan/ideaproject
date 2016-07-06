package Factory.SimpleFactory;

/**
 * @project: HeadFirstDesignPatterns
 * @filename: ChicagoStyleCheesePizza.java
 * @version: 0.10
 * @author: JM Han
 * @date: 8:38 2016/7/6
 * @comment: Purpose
 * @result:
 */

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza(){
		name = "Chicago Style Sauce and Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";

		toppings.add("Shredded Mozzarella Cheese");
		}

	public void cut(){
		System.out.println("Cutting the pizza into square slices");
	}

}
