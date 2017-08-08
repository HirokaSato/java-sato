package jp.co.rakus.java_sato;

/**
 * 車を表すクラスです.
 * お疲れ様です。
 * かぁかぁにゅぅかー
 * @author admin
 *
 */
public class Car {

//	Car car = new Car();
	
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
