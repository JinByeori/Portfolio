package Ÿ�̸�;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {

		try {
			System.out.println("������");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("����");

	}
}
