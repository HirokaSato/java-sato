package jp.co.rakus.java_sato;

public class Car {
	private int speed;

	public void run() {
		this.speed += 5;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
