package Factory.SimpleFactory;

import master.designpatterns.factory.pizzafm.*;

/**
 * @project: HeadFirstDesignPatterns
 * @filename: PizzaStore.java
 * @version: 0.10
 * @author: JM Han
 * @date: 8:45 2016/7/6
 * @comment: Purpose
 * @result:
 */

public abstract class PizzaStore {

	protected abstract Pizza createPizza(String type);

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
