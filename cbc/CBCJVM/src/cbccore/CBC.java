package cbccore;

import cbccore.interaction.Interaction;
import cbccore.low.Camera;
import cbccore.low.Create;
import cbccore.low.Device;
import cbccore.low.Display;
import cbccore.low.Input;
import cbccore.low.Motor;
import cbccore.low.Sensor;
import cbccore.low.Servo;
import cbccore.low.Sound;


public class CBC {
		static {
        	System.load("/mnt/user/java/cbc/CBC.so");
    	}
		public static void init(Object main, boolean runInteraction)
		{
			sound = new Sound();
			sensor = new Sensor();
			device = new Device();
			display = new Display();
			input = new Input();
			servo = new Servo();
			motor = new Motor();
			camera = new Camera();
			create = new Create();
			if(runInteraction) {
				interaction = new Interaction(main);
				new Thread(interaction).start();
			}
		}
		public static Sound sound = null;
		public static Sensor sensor = null;
		public static Device device = null;
		public static Display display = null;
		public static Input input = null;
		public static Servo servo = null;
		public static Motor motor = null;
		public static Camera camera = null;
		public static Interaction interaction = null;
		public static Create create = null;
}
