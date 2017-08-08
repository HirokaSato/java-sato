package jp.co.rakus.java_sato;

public class Car {
	private int speed;

	public void run() {
		this.speed += 10;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
