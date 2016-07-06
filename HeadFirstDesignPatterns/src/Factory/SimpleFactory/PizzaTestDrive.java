package Factory.SimpleFactory;

/**
 * @project: HeadFirstDesignPatterns
 * @filename: PizzaTestDrive.java
 * @version: 0.10
 * @author: JM Han
 * @date: 8:44 2016/7/6
 * @comment: Purpose
 * @result:
 */

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}
