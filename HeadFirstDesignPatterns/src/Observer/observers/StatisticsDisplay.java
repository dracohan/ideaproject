package Observer.Observers;

import Observer.Subject.Subject;

/**
 * @project: HeadFirstDesignPatterns
 * @filename: StatisticsDisplay.java
 * @version: 0.10
 * @author: JM Han
 * @date: 23:09 2016/6/3
 * @comment: 一个订阅者
 * @result:
 */

public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;

	public StatisticsDisplay(Subject weatherData) {
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		float temp = temperature;
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}

		if (temp < minTemp) {
			minTemp = temp;
		}

		display();

	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
				+ "/" + maxTemp + "/" + minTemp);
	}
}
