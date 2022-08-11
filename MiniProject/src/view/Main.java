package view;

import java.util.Scanner;

import controller.Controller;

public class Main {

	public static void main(String[] args) {

		Controller c = new Controller();
		Scanner sc = new Scanner(System.in);

		System.out.println("! 난이도를 선택해주세요 !");
		System.out.print("[1] EASY [2] NORMAL [3] HARD >> ");

		while (true) {
			int level = sc.nextInt();
			if (level == 1) {
				// 이지 난이도 버거 게임 시작
				c.easyGame();

			} else if (level == 2) {
				// 노말 난이도 버거 게임 시작
				c.normalGame();

			} else if (level == 3) {
				// 하드 난이도 버거 게임 시작
				c.hardGame();

			} else {
				System.out.println("Xx 잘못된 숫자 입력 ! xX");
				System.out.print("원하는 난이도에 해당하는 숫자를 입력해주세요 >> ");
			}
		}

	}

}
