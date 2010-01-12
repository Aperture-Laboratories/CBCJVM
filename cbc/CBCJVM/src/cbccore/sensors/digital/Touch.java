package cbccore.sensors.digital;

import cbccore.DeviceSingleton;
import cbccore.InvalidPortException;

public class Touch {
	private cbccore.low.Sensor lowSensor = DeviceSingleton.getInstance().getLowSensorController();
	private int port = 0;
	public Touch(int port) throws InvalidPortException {
		// TODO: Check port validity
		this.port = port;
	}
	public boolean getValue() {
		return (lowSensor.digital(port) == 1) ? true : false;
	}
}
