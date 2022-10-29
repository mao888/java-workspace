package game;
/**
 * ∑…––ŒÔ¿‡
 *
 */
 abstract class FlyingObject {
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected int speed;
	protected int getX() {
		return x;
	}
	protected void setX(int x) {
		this.x=x;
	}
	protected int getY() {
		return y;
	}
	protected void setY(int y) {
		this.y=y;
	}
	protected int getWidth() {
		return width;
	}
	protected void setWidth(int width) {
		this.width=width;
	}
	protected int getHeight() {
		return height;
	}
	protected void setHeight(int height) {
		this.height=height;
	}
	protected int getSpeed() {
		return speed;
	}
	protected void setSpeed(int speed) {
		this.speed=speed;
	}
}

