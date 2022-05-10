package Practice;

class Lamp
{
	//stores the class for light
	//true if light is on
	//false if light is off
	boolean isOn;
	
	//method to turn on the light
	void turnOn()
	{
		isOn =true;
		System.out.println("Light On? "+isOn);
	}
	
	//method to turn off the light
	void turnOff()
	{
		isOn = false;
		System.out.println("Light On? "+isOn);
	}
}

public class LampTest {
	public static void main(String[] args) {
		
		//create object for led and halogen
		
		Lamp led = new Lamp();
		Lamp halogen = new Lamp();
		
		//switch on the led and halogen
		led.turnOn();
		halogen.turnOn();
		
		led.turnOff();
		halogen.turnOff();
		
	}

}
