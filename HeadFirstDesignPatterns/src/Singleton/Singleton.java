package Singleton;
/**
 * @project: HeadFirstDesignPatterns
 * @filename: Singleton.java
 * @version: 0.10
 * @author: JM Han
 * @date: 1:27 PM 7/6/2016
 * @comment: Test Purpose
 * @result:
 */

public class Singleton {
	private static Singleton uniqueInstance = new Singleton();

	private Singleton() {}

	public static Singleton getInstance() {
		return uniqueInstance;
	}

	// other useful methods here
	public String getDescription() {
		return "I'm a statically initialized Singleton!";
	}
}
