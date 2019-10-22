

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement
{
	private float temperature;
	private float humidity;
	private float heatIndex;
	Observable observalble;
	
	public CurrentConditionsDisplay(Observable observalble)
	{
		this.observalble = observalble;
		observalble.addObserver(this);
	}
	
	public void update (Observable obs, Object arg)
	{
		if (obs instanceof WeatherData)
		{
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			heatIndex = HeatIndexDisplay.computeHeatIndex(temperature, humidity);
			display();
		}
	}
	
	public void display()
	{
		System.out.println("Current conditions: " + temperature + "F degrees and "
			+ humidity + "% humidity");
		System.out.println("Heat index is " + heatIndex);
	}
}