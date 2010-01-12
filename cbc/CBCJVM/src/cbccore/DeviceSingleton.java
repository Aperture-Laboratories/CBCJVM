package cbccore;

import cbccore.low.*;

public class DeviceSingleton {
	private static DeviceSingleton instance = null;
	private Motor lowMotors = new Motor();
	private Servo lowServos = new Servo();
	private Camera lowCamera = new Camera();
	private Device lowDevice = new Device();
	private Input lowInput = new Input();
	private Sound lowSound = new Sound();
	private Sensor lowSensor = new Sensor();
	public static DeviceSingleton getInstance() {
		if(instance == null) {
			instance = new DeviceSingleton();
		}
		return instance;
	}
	private DeviceSingleton() {
		
	}
	public Motor getLowMotorController() {
		return lowMotors;
	}
	public Servo getLowServoController() {
		return lowServos;
	}
	public Camera getLowCameraController() {
		return lowCamera;
	}
	public Device getLowDeviceController() {
		return lowDevice;
	}
	public Input getLowInputController() {
		return lowInput;
	}
	public Sound getLowSoundController() {
		return lowSound;
	}
	public Sensor getLowSensorController() {
		return lowSensor;
	}
}
