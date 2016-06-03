package Observer.Subject;

import Observer.Observers.Observer;

/**
 * @project: HeadFirstDesignPatterns
 * @filename: Subject.java
 * @version: 0.10
 * @author: JM Han
 * @date: 22:49 2016/6/3
 * @comment: weatherData父类，用来继承注册机制
 * @result:
 */

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}
