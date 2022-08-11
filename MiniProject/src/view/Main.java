package view;

import java.util.Scanner;

import controller.Controller;

public class Main {

	public static void main(String[] args) {

		Controller c = new Controller();
		Scanner sc = new Scanner(System.in);

		System.out.println("! ���̵��� �������ּ��� !");
		System.out.print("[1] EASY [2] NORMAL [3] HARD >> ");

		while (true) {
			int level = sc.nextInt();
			if (level == 1) {
				// ���� ���̵� ���� ���� ����
				c.easyGame();

			} else if (level == 2) {
				// �븻 ���̵� ���� ���� ����
				c.normalGame();

			} else if (level == 3) {
				// �ϵ� ���̵� ���� ���� ����
				c.hardGame();

			} else {
				System.out.println("Xx �߸��� ���� �Է� ! xX");
				System.out.print("���ϴ� ���̵��� �ش��ϴ� ���ڸ� �Է����ּ��� >> ");
			}
		}

	}

}
