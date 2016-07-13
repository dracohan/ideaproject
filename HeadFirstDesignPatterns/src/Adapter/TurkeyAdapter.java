package Adapter;
/**
 * @project: HeadFirstDesignPatterns
 * @filename: TurkeyAdapter.java
 * @version: 0.10
 * @author: JM Han
 * @date: 3:36 PM 7/7/2016
 * @comment: Test Purpose
 * @result:
 */

public class TurkeyAdapter implements Duck {
	Turkey turkey;

	public TurkeyAdapter(Turkey turkey){
		this.turkey = turkey;
	}

	public void quack(){
		turkey.gobble();
	}

	public void fly(){
		for (int i = 0; i < 5; i++){
			turkey.fly();
		}
	}
}
