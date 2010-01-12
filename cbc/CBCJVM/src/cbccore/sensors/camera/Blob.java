package cbccore.sensors.camera;

public class Blob {
	private int x = 0;
	private int y = 0;
	private int width = 0;
	private int height = 0;
	private int bottom = 0;
	private int top = 0;
	private int left = 0;
	private int right = 0;
	private float angle = 0;
	private int minorAxis = 0;
	private int majorAxis = 0;
	private int confidence = 0;
	private int size = 0;
	public Blob(cbccore.low.Camera lowCamera, Channel c, int i) {
		int ch = c.getChannelID();
		x = lowCamera.track_x(ch, i);
		y = lowCamera.track_y(ch, i);
		width = lowCamera.track_bbox_width(ch, i);
		height = lowCamera.track_bbox_height(ch, i);
		bottom = lowCamera.track_bbox_bottom(ch, i);
		top = lowCamera.track_bbox_top(ch, i);
		left = lowCamera.track_bbox_left(ch, i);
		right = lowCamera.track_bbox_right(ch, i);
		angle = lowCamera.track_angle(ch, i);
		minorAxis = lowCamera.track_minor_axis(ch, i);
		majorAxis = lowCamera.track_major_axis(ch, i);
		confidence = lowCamera.track_confidence(ch, i);
		size = lowCamera.track_size(ch, i);
	}
	public int getCenterX() {
		return x;
	}
	public int getCenterY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getBottomY() {
		return bottom;
	}
	public int getTopY() {
		return top;
	}
	public int getLeftX() {
		return left;
	}
	public int getRightX() {
		return right;
	}
	public float getAngle() {
		return angle;
	}
	public int getMinorAxis() {
		return minorAxis;
	}
	public int getMajorAxis() {
		return majorAxis;
	}
	public int getConfidence() {
		return confidence;
	}
	public int getSize() {
		return size;
	}
}
