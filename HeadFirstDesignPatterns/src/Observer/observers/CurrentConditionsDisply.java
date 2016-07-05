package Observer.Observers;
import Observer.Subject.Subject;


/**
 * @project: HeadFirstDesignPatterns
 * @filename: CurrentConditionsDisply.java
 * @version: 0.10
 * @author: JM Han
 * @date: 22:59 2016/6/3
 * @comment: 一个订阅者
 * @result:
 */

public class CurrentConditionsDisply implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	//保存weatherData是为了方便取消订阅
	private Subject weatherData;

	public CurrentConditionsDisply(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	public void display(){
		System.out.println("Current conditions: " + temperature
				+ "F degrees and " + humidity + "% humidity");
	}
}
