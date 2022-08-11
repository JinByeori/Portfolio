package 타이머;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {

		try {
			System.out.println("레시피");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("종료");

	}
}
