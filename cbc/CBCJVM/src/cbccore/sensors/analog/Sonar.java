package cbccore.sensors.analog;

import cbccore.CBC;
import cbccore.sensors.IAnalogSensor;

public class Sonar implements IAnalogSensor {
	private int port = 0;
	public Sonar(int port) {
		this.port = port;
	}
	@Override
	public int getValue() {
		return CBC.sensor.analog(port);
	}
	@Override
	public int getValueHigh() {
		return CBC.sensor.analog10(port);
	}
	
}
