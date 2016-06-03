package Observer.Observers;
/**
 * @project: HeadFirstDesignPatterns
 * @filename: Observer.java
 * @version: 0.10
 * @author: JM Han
 * @date: 22:51 2016/6/3
 * @comment: 所有的观察者必须的接口
 * @result:
 */

public interface Observer {
	public void update(float tmp, float humidity, float pressure);
}
