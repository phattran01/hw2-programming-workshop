
public class TestHarness {

	public static void main(String[] args) {
		Heater heater = new Heater(15);
		
		heater.setIncrement(5);
		heater.setMax(30);
		heater.setMin(10);
		
		System.out.println("The current temperature: " + heater.getTemperature());
		
		heater.Warmer();
		System.out.println("The temperature after warming up: " + heater.getTemperature());
		heater.Warmer();
		System.out.println("The temperature after warming up: " + heater.getTemperature());
		heater.Warmer();
		System.out.println("The temperature after warming up: " + heater.getTemperature());
		heater.Warmer();
		System.out.println("The temperature after warming up: " + heater.getTemperature());
		
		heater.Cooler();
		System.out.println("The temperature after cooling down: " + heater.getTemperature());
		heater.Cooler();
		System.out.println("The temperature after cooling down: " + heater.getTemperature());
		heater.Cooler();
		System.out.println("The temperature after cooling down: " + heater.getTemperature());
		heater.Cooler();
		System.out.println("The temperature after cooling down: " + heater.getTemperature());
		heater.Cooler();
		System.out.println("The temperature after cooling down: " + heater.getTemperature());
	}

}
