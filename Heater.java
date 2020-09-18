
public class Heater {
	private double temperature;
	private double min;
	private double max;
	private double increment;
	
	public Heater(double temp) {
		temperature = temp;
	}
	
	public void setIncrement(double inc) {
		increment = inc;
	}
	
	public void setMax(double ma) {
		max = ma;
	}
	
	public void setMin(double mi) {
		min = mi;
	}
	
	public void Warmer() {
		if(temperature >= max) {
			temperature = temperature + 0;
		}
		else {
			temperature = temperature + increment;
		}
	}
	
	public void Cooler() {
		if(temperature <= min) {
			temperature = temperature - 0;
		}
		else {
			temperature = temperature - increment;
		}
	}
	
	public double getTemperature() {
		return temperature;
	}
}
