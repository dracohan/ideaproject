package Observer;

import Observer.Observers.CurrentConditionsDisply;
import Observer.Observers.StatisticsDisplay;
import Observer.Subject.WeatherData;

/**
 * @project: HeadFirstDesignPatterns
 * @filename: WeatherStation.java
 * @version: 0.10
 * @author: JM Han
 * @date: 23:05 2016/6/3
 * @comment: 一个测试程序
 * @result:
 */

public class WeatherStation {
	public static void main(String[] args) {
	WeatherData weatherData = new WeatherData();
		CurrentConditionsDisply currentConditionsDisply = new CurrentConditionsDisply(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(85, 70, 29.2f);
		weatherData.setMeasurements(75, 90, 29.2f);
	}
}
