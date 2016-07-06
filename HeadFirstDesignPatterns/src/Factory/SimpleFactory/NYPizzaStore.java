package Factory.SimpleFactory;

/**
 * @project: HeadFirstDesignPatterns
 * @filename: NYPizzaStore.java
 * @version: 0.10
 * @author: JM Han
 * @date: 8:47 2016/7/6
 * @comment: Purpose
 * @result:
 */

public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else return null;
	}
}