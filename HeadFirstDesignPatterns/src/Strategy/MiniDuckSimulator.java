package Strategy;

import Strategy.Ducks.Duck;
import Strategy.Ducks.MallardDuck;
import Strategy.Ducks.ModelDuck;
import Strategy.FlyBehavior.FlyRocketPowered;

/**
 * @project: HeadFirstDesignPatterns
 * @filename: MiniDuckSimulator.java
 * @version: 0.10
 * @author: JM Han
 * @date: 21:09 2016/6/3
 * @comment: Test Purpose
 * @result:
 */

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
