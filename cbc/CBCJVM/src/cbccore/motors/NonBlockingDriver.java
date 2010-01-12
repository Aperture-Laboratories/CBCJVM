package cbccore.motors;

import java.util.LinkedList;

public class NonBlockingDriver extends Thread {
	private IDriver driver = null;
	LinkedList<Drive> drives = new LinkedList<Drive>();

	public NonBlockingDriver(IDriver driver) {
		this.driver = driver;
	}

	public LinkedList<Drive> getDrives() {
		return drives;
	}

	public void run() {
		synchronized (drives) {
			if (!drives.isEmpty()) {
				driver.drive(drives.removeFirst());
			}
		}
		Thread.yield();
	}
}
