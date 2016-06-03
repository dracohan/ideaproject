package Observer.Subject;

import Observer.Observers.Observer;

import java.util.ArrayList;

/**
 * @project: HeadFirstDesignPatterns
 * @filename: WeatherData.java
 * @version: 0.10
 * @author: JM Han
 * @date: 22:52 2016/6/3
 * @comment: 原始API函数，实现注册和分发机制
 * @result:
 */

public class WeatherData implements Subject {
	private ArrayList observers;
	private float temp;
	private float humidity;
	private float pressure;

	public WeatherData(){
		observers = new ArrayList();
	}

	public void registerObserver(Observer o){
		observers.add(o);
	}

	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	public void notifyObserver(){
		for(int i = 0; i < observers.size(); i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(temp, humidity, pressure);
		}
	}

	public void measurementsChanged(){
		notifyObserver();
	}

	public void setMeasurements(float temp, float humidity, float pressure){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
