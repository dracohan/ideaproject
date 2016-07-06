package Factory.SimpleFactory;

/**
 * @project: HeadFirstDesignPatterns
 * @filename: ChicagoPizzaStore.java
 * @version: 0.10
 * @author: JM Han
 * @date: 8:49 2016/7/6
 * @comment: Purpose
 * @result:
 */

public class ChicagoPizzaStore extends PizzaStore {

		protected Pizza createPizza(String item) {
			if (item.equals("cheese")) {
				return new ChicagoStyleCheesePizza();
			} else return null;
		}
}
